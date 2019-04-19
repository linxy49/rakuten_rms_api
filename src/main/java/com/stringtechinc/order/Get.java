package com.stringtechinc.order;

import com.stringtechinc.base.AbstractBaseBatch;

public class Get extends AbstractBaseBatch {

	private final static String NAME = "order.get";

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Get order = new Get();
		int code = order.doProcess(Get.class, NAME);
		System.exit(code);

	}

	/**
	 * execute
	 */
	@Override
	public int execute() {
		System.out.print("execute");
		return 0;
	}

}
