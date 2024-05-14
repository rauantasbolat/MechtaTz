package com.example.mechtatz.model

import com.google.gson.annotations.SerializedName

data class SmartPhonesResponse(
    @SerializedName("result") var result: Boolean? = null,
    @SerializedName("errors") var errors: ArrayList<String> = arrayListOf(),
    @SerializedName("data") var data: Data? = Data()
)

data class SectionList(
    @SerializedName("name") var name: String? = null,
    @SerializedName("code") var code: String? = null
)

data class TradeInAktsiya(
    @SerializedName("name") var name: String? = null,
    @SerializedName("link") var link: String? = null,
    @SerializedName("code") var code: String? = null,
    @SerializedName("color") var color: String? = null
)

data class DeliveryExpress(
    @SerializedName("name") var name: String? = null,
    @SerializedName("link") var link: String? = null,
    @SerializedName("color") var color: String? = null
)

data class Stickers(
    @SerializedName("trade-in-aktsiya") var tradeInAktsiya: TradeInAktsiya? = TradeInAktsiya(),
    @SerializedName("delivery-express") var deliveryExpress: DeliveryExpress? = DeliveryExpress()
)

data class Metrics(
    @SerializedName("name") var name: String? = null,
    @SerializedName("brand") var brand: String? = null,
    @SerializedName("category") var category: String? = null
)

data class Prices(
    @SerializedName("discounted_price") var discountedPrice: Int? = null,
    @SerializedName("base_price") var basePrice: Int? = null,
    @SerializedName("has_discount") var hasDiscount: Boolean? = null
)

data class Items(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("xml_id") var xmlId: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("code") var code: String? = null,
    @SerializedName("type") var type: Int? = null,
    @SerializedName("price") var price: Int? = null,
    @SerializedName("photos") var photos: ArrayList<String> = arrayListOf(),
    @SerializedName("city_exist") var cityExist: Boolean? = null,
    @SerializedName("video_link") var videoLink: ArrayList<String?>,
    @SerializedName("code_1c") var code1c: String? = null,
    @SerializedName("express") var express: Boolean? = null,
    @SerializedName("express_delivery") var expressDelivery: Boolean? = null,
    @SerializedName("is_intercity") var isIntercity: Boolean? = null,
    @SerializedName("rating") var rating: Int? = null,
    @SerializedName("reviews_count") var reviewsCount: Int? = null,
    @SerializedName("pod_order_item") var podOrderItem: Boolean? = null,
    @SerializedName("pod_order_time") var podOrderTime: String? = null,
    @SerializedName("preorder") var preorder: Boolean? = null,
    @SerializedName("preorder_start") var preorderStart: String? = null,
    @SerializedName("preorder_sum") var preorderSum: String? = null,
    @SerializedName("preorder_link") var preorderLink: String? = null,
    @SerializedName("service") var service: Boolean? = null,
    @SerializedName("digital") var digital: Boolean? = null,
    @SerializedName("in_compare") var inCompare: Boolean? = null,
    @SerializedName("in_favorites") var inFavorites: Boolean? = null,
    @SerializedName("stickers") var stickers: ArrayList<Stickers>,
    @SerializedName("new_item") var newItem: Boolean? = null,
    @SerializedName("same_product_properties") var sameProductProperties: ArrayList<String> = arrayListOf(),
    @SerializedName("metrics") var metrics: Metrics? = Metrics(),
    @SerializedName("availability") var availability: String? = null,
    @SerializedName("prices") var prices: Prices? = Prices(),
    @SerializedName("bonus") var bonus: Int? = null,
    @SerializedName("has_gift") var hasGift: Boolean? = null,
    @SerializedName("gifts") var gifts: ArrayList<String> = arrayListOf(),
    @SerializedName("city_code_for_kaspi") var cityCodeForKaspi: String? = null
)

data class Breadcrumbs(
    @SerializedName("name") var name: String? = null,
    @SerializedName("code") var code: String? = null
)

data class MetaTags(
    @SerializedName("title") var title: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("keywords") var keywords: String? = null,
    @SerializedName("og:title") var ogTitle: String? = null,
    @SerializedName("og:type") var ogType: String? = null,
    @SerializedName("og:image") var ogImage: String? = null,
    @SerializedName("og:image:width") var ogImageWidth: String? = null,
    @SerializedName("og:image:height") var ogImageHeight: String? = null,
    @SerializedName("canonical") var canonical: String? = null,
    @SerializedName("noindex") var noindex: String? = null
)

data class Data(
    @SerializedName("section_list") var sectionList: ArrayList<SectionList> = arrayListOf(),
    @SerializedName("all_items_count") var allItemsCount: Int? = null,
    @SerializedName("page_items_count") var pageItemsCount: Int? = null,
    @SerializedName("page_number") var pageNumber: Int? = null,
    @SerializedName("items") var items: ArrayList<Items> = arrayListOf(),
    @SerializedName("breadcrumbs") var breadcrumbs: ArrayList<Breadcrumbs> = arrayListOf(),
    @SerializedName("section_id") var sectionId: Int? = null,
    @SerializedName("section_1c_code") var section1cCode: String? = null,
    @SerializedName("section_description") var sectionDescription: String? = null,
    @SerializedName("index") var index: Boolean? = null,
    @SerializedName("meta_tags") var metaTags: MetaTags? = MetaTags(),
    @SerializedName("header") var header: String? = null
)
