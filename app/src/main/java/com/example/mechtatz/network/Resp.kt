package com.example.mechtatz.network

data class Resp(
    val data: Data,
    val errors: List<Any>,
    val result: Boolean
)

data class Data(
    val allItemsCount: Int,
    val breadcrumbs: List<Breadcrumb>,
    val header: String,
    val index: Boolean,
    val items: List<Item>,
    val metaTags: MetaTags,
    val pageItemsCount: Int,
    val pageNumber: Int,
    val section1cCode: String,
    val sectionDescription: String,
    val sectionId: Int,
    val sectionList: List<Section>
)

data class Breadcrumb(
    val code: String,
    val id: Int,
    val name: String,
    val nameRu: String
)

data class Item(
    val availability: String,
    val bonus: Int,
    val cityCodeForKaspi: String,
    val cityExist: Boolean,
    val code: String,
    val code1c: String,
    val digital: Boolean,
    val express: Boolean,
    val expressDelivery: Boolean,
    val gifts: List<Any>,
    val hasGift: Boolean,
    val id: Int,
    val inCompare: Boolean,
    val inFavorites: Boolean,
    val isIntercity: Boolean,
    val metrics: Metrics,
    val name: String,
    val newItem: Boolean,
    val photos: List<String>,
    val podOrderItem: Boolean,
    val podOrderTime: Any,
    val preorder: Boolean,
    val preorderLink: Any,
    val preorderStart: Any,
    val preorderSum: Any,
    val price: Int,
    val prices: Prices,
    val rating: Double,
    val reviewsCount: Int,
    val sameProductProperties: List<String>,
    val service: Boolean,
    val title: String,
    val type: Int,
    val videoLink: List<String>,
    val xmlId: String
)

data class MetaTags(
    val canonical: Any,
    val description: String,
    val keywords: String,
    val noIndex: Any,
    val ogImage: String,
    val ogImageHeight: String,
    val ogImageWidth: String,
    val ogTitle: String,
    val ogType: String,
    val title: String
)

data class Section(
    val code: String,
    val name: String
)

data class Metrics(
    val brand: String,
    val category: String,
    val name: String
)

data class Prices(
    val basePrice: Int,
    val discountedPrice: Int,
    val hasDiscount: Boolean
)

data class Stickers(
    val deliveryExpress: DeliveryExpress,
    val tradeInAktsiya: TradeInAktsiya
)

data class DeliveryExpress(
    val color: String,
    val link: Any,
    val name: String
)

data class TradeInAktsiya(
    val code: String,
    val color: String,
    val link: String,
    val name: String
)