package com.example.tabenabi.controller;

import com.example.tabenabi.model.locations.ShopsInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class StoreController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    // TODO: 確認
    //  https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial

    @GetMapping("/locations")
    public String locations(Model model) throws IOException {

        String url = "https://webservice.recruit.co.jp/hotpepper/gourmet/v1/?key=a5c3c9fb001ca296&large_area=Z011&budget+codeB008&results_available&format=json";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        System.out.println(responseBody);
        // TODO: 別ファイルに返却されるAPIの定義を行う
        ObjectMapper mapper = new ObjectMapper();
        ShopsInfo shopsInfo = mapper.readValue(responseBody, ShopsInfo.class);
        System.out.println(shopsInfo.results.shops.get(0).address);

        model.addAttribute("shopsInfo", shopsInfo);
        return "Locations";
    }

    @GetMapping("/details")
    public String details(Model model, @RequestParam("shopId") String shopId) throws IOException  {
        System.out.println(shopId);
        // todo: LocationsPageで表示した店舗の情報を一つを取得してくる店鋪IDで検索する
        String url = "https://webservice.recruit.co.jp/hotpepper/gourmet/v1/?key=a5c3c9fb001ca296&id=" + shopId + "&format=json";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        System.out.println(responseBody);

        ObjectMapper mapper = new ObjectMapper();
        ShopsInfo shopsInfo = mapper.readValue(responseBody, ShopsInfo.class);
        model.addAttribute("shopsInfo", shopsInfo);
        return "details";
    }

}
