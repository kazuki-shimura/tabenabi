package com.example.tabenabi.model.locations;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Shop {

    public String access;
    public String address;
    public String band;
    public String barrier_free;
    public Budget budget;
    public String budget_memo;
    public int capacity;
    public String card;
    // https://qiita.com/RyuNen344/items/ac348100df690aedb066
    @JsonProperty("catch")
    public String catch_sample; // catchは予約語なので使えない
    public String charter;
    public String child;
    public String close;
    public CouponUrls coupon_urls;
    public String course;
    public String english;
    public String free_drink;
    public String free_food;
    public Genre genre;
    public String horigotatsu;
    public String id;
    public String karaoke;
    public int ktai_coupon;
    public LargeArea large_area;
    public LargeServiceArea large_service_area;
    public int lat;
    public int lng;
    public String logo_image;
    public String lunch;
    public MiddleArea middle_area;
    public String midnight;
    public String mobile_access;
    public String name;
    public String name_kana;
    public String non_smoking;
    public String open;
    public String other_memo;
    public String parking;
    public int party_capacity;
    public String pet;
    public Photo photo;
    public String private_room;
    public ServiceArea service_area;
    public String shop_detail_memo;
    public String show;
    public SmallArea small_area;
    public String station_name;
    public SubGenre sub_genre;
    public String tatami;
    public String tv;
    public Urls urls;
    public String wedding;
    public String wifi;

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getBarrier_free() {
        return barrier_free;
    }

    public void setBarrier_free(String barrier_free) {
        this.barrier_free = barrier_free;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public String getBudget_memo() {
        return budget_memo;
    }

    public void setBudget_memo(String budget_memo) {
        this.budget_memo = budget_memo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCatch_sample() {
        return catch_sample;
    }

    public void setCatch_sample(String catch_sample) {
        this.catch_sample = catch_sample;
    }

    public String getCharter() {
        return charter;
    }

    public void setCharter(String charter) {
        this.charter = charter;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public CouponUrls getCoupon_urls() {
        return coupon_urls;
    }

    public void setCoupon_urls(CouponUrls coupon_urls) {
        this.coupon_urls = coupon_urls;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getFree_drink() {
        return free_drink;
    }

    public void setFree_drink(String free_drink) {
        this.free_drink = free_drink;
    }

    public String getFree_food() {
        return free_food;
    }

    public void setFree_food(String free_food) {
        this.free_food = free_food;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getHorigotatsu() {
        return horigotatsu;
    }

    public void setHorigotatsu(String horigotatsu) {
        this.horigotatsu = horigotatsu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKaraoke() {
        return karaoke;
    }

    public void setKaraoke(String karaoke) {
        this.karaoke = karaoke;
    }

    public int getKtai_coupon() {
        return ktai_coupon;
    }

    public void setKtai_coupon(int ktai_coupon) {
        this.ktai_coupon = ktai_coupon;
    }

    public LargeArea getLarge_area() {
        return large_area;
    }

    public void setLarge_area(LargeArea large_area) {
        this.large_area = large_area;
    }

    public LargeServiceArea getLarge_service_area() {
        return large_service_area;
    }

    public void setLarge_service_area(LargeServiceArea large_service_area) {
        this.large_service_area = large_service_area;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public String getLogo_image() {
        return logo_image;
    }

    public void setLogo_image(String logo_image) {
        this.logo_image = logo_image;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public MiddleArea getMiddle_area() {
        return middle_area;
    }

    public void setMiddle_area(MiddleArea middle_area) {
        this.middle_area = middle_area;
    }

    public String getMidnight() {
        return midnight;
    }

    public void setMidnight(String midnight) {
        this.midnight = midnight;
    }

    public String getMobile_access() {
        return mobile_access;
    }

    public void setMobile_access(String mobile_access) {
        this.mobile_access = mobile_access;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_kana() {
        return name_kana;
    }

    public void setName_kana(String name_kana) {
        this.name_kana = name_kana;
    }

    public String getNon_smoking() {
        return non_smoking;
    }

    public void setNon_smoking(String non_smoking) {
        this.non_smoking = non_smoking;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getOther_memo() {
        return other_memo;
    }

    public void setOther_memo(String other_memo) {
        this.other_memo = other_memo;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public int getParty_capacity() {
        return party_capacity;
    }

    public void setParty_capacity(int party_capacity) {
        this.party_capacity = party_capacity;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getPrivate_room() {
        return private_room;
    }

    public void setPrivate_room(String private_room) {
        this.private_room = private_room;
    }

    public ServiceArea getService_area() {
        return service_area;
    }

    public void setService_area(ServiceArea service_area) {
        this.service_area = service_area;
    }

    public String getShop_detail_memo() {
        return shop_detail_memo;
    }

    public void setShop_detail_memo(String shop_detail_memo) {
        this.shop_detail_memo = shop_detail_memo;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public SmallArea getSmall_area() {
        return small_area;
    }

    public void setSmall_area(SmallArea small_area) {
        this.small_area = small_area;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public SubGenre getSub_genre() {
        return sub_genre;
    }

    public void setSub_genre(SubGenre sub_genre) {
        this.sub_genre = sub_genre;
    }

    public String getTatami() {
        return tatami;
    }

    public void setTatami(String tatami) {
        this.tatami = tatami;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getWedding() {
        return wedding;
    }

    public void setWedding(String wedding) {
        this.wedding = wedding;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

}
