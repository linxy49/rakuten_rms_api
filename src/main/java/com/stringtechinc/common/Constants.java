package com.stringtechinc.common;

/**
 * 定数
 */

public class Constants {

	// 正常コード
	public final static int SUCCESS_CODE = 0;

	// 異常コード
	public final static int FAILURE_CODE = 1;

	// プロパティファイルパス
	public final static String RMS_PROPERTIES = "./conf/rms.properties";

	/**
	 * DB接続用情報
	 */
	// データベース名
	public final static String DB_CONF = "RMS_DB_CONFIG";
	// データベース名
	public final static String DB_URL = "RMS_DB_URL";
	// ユーザ
	public final static String DB_USER = "RMS_DB_USER";
	// パスワード
	public final static String DB_PASSWORD = "RMS_DB_PASSWORD";

	/**
	 *  楽天API エンドポイント関連
	 */
	public static final String RMS_API_ITEM_INSERT = "https://api.rms.rakuten.co.jp/es/1.0/item/insert";
	public static final String RMS_API_ITEM_UPDATE = "https://api.rms.rakuten.co.jp/es/1.0/item/update";
	public static final String RMS_API_ITEM_GET = "https://api.rms.rakuten.co.jp/es/1.0/item/get";
	public static final String RMS_API_CABINET_USAGE_GET = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/usage/get";
	public static final String RMS_API_CABINET_FOLDERS_GET = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/folders/get";
	public static final String RMS_API_CABINET_FOLDERS_INSERT = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/folder/insert";
	public static final String RMS_API_CABINET_FILES_SEARCH = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/files/search";
	public static final String RMS_API_CABINET_FILE_INSERT = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/file/insert";
	public static final String RMS_API_CABINET_FILE_UPDATE = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/file/update";
	public static final String RMS_API_CABINET_FILE_DELETE = "https://api.rms.rakuten.co.jp/es/1.0/cabinet/file/delete";
	public static final String RMS_API_ORDER_GET = "https://api.rms.rakuten.co.jp/es/1.0/order/ws";
	public static final String RMS_API_ORDER_SOAP_WSDL = "https://api.rms.rakuten.co.jp/es/1.0/order/ws?WSDL";
	public static final String RMS_API_INVENTORY_SOAP_ADDRESS = "https://api.rms.rakuten.co.jp/es/1.0/inventory/ws";
	public static final String RMS_API_INVENTORY_SOAP_WSDL = "https://inventoryapi.rms.rakuten.co.jp/rms/mall/inventoryapi";
	public static final String RMS_API_PAYMENT_SOAP_WSDL = "https://orderapi.rms.rakuten.co.jp/rccsapi-services/RCCSApiService?wsdl";
	public static final String RMS_API_CATEGORY_SETS_GET = "https://api.rms.rakuten.co.jp/es/1.0/categoryapi/shop/categorysets/get";
	public static final String RMS_API_CATEGORIES_GET = "https://api.rms.rakuten.co.jp/es/1.0/categoryapi/shop/categories/get";
	public static final String RMS_API_CATEGORY_GET = "https://api.rms.rakuten.co.jp/es/1.0/categoryapi/shop/category/get";
	public static final String RMS_API_CATEGORY_INSERT = "https://api.rms.rakuten.co.jp/es/1.0/categoryapi/shop/category/insert";
	public static final String RMS_API_CATEGORY_UPDATE = "https://api.rms.rakuten.co.jp/es/1.0/categoryapi/shop/category/update";
	public static final String RMS_API_CATEGORY_DELETE = "https://api.rms.rakuten.co.jp/es/1.0/categoryapi/shop/category/delete";

	/**
	 *  楽天ペイAPI エンドポイント
	 */
	public static final String RMS_API_RAKUTEN_PAY_GET_ORDER = "https://api.rms.rakuten.co.jp/es/2.0/order/getOrder/";
	public static final String RMS_API_RAKUTEN_PAY_SEARCH_ORDER = "https://api.rms.rakuten.co.jp/es/2.0/order/searchOrder/";
	public static final String RMS_API_RAKUTEN_PAY_CONFIRM_ORDER = "https://api.rms.rakuten.co.jp/es/2.0/order/confirmOrder/";
	public static final String RMS_API_RAKUTEN_PAY_UPDATE_ORDER_DELIVERY = "https://api.rms.rakuten.co.jp/es/2.0/order/updateOrderDelivery/";
	public static final String RMS_API_RAKUTEN_PAY_UPDATE_ORDER_SENDER = "https://api.rms.rakuten.co.jp/es/2.0/order/updateOrderSender/";
	public static final String RMS_API_RAKUTEN_PAY_GET_PAYMENT = "https://api.rms.rakuten.co.jp/es/2.0/order/getPayment/";
	public static final String RMS_API_RAKUTEN_PAY_CANCEL_ORDER = "https://api.rms.rakuten.co.jp/es/2.0/order/cancelOrder/";
	public static final String RMS_API_RAKUTEN_PAY_UPDATE_ORDER_SHIPPING = "https://api.rms.rakuten.co.jp/es/2.0/order/updateOrderShipping/";

	// 商品登録(ItemAPI)設定関連
	public static final int RMS_CATALOG_EXCEPTION_REASON_NO_JAN = 5;

	public static final String RMS_IMAGE_BASE_URL = "https://image.rakuten.co.jp/";
	/*
	 *  在庫設定関連
	 */
	// 通常在庫設定
	public static final int RMS_ITEM_INVENTORY_TYPE_NORMAL = 1;
	// 項目選択肢別在庫設定
	public static final int RMS_ITEM_INVENTORY_TYPE_VARIATION = 2;

	/*
	 *  受注関連設定
	 */
	// 注文日で取得
	public static final int RMS_GET_ORDER_DATE_TYPE_ORDER = 1;

}
