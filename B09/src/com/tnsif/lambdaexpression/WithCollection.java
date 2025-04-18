package com.tnsif.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class WithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=Arrays.asList("ram","sham","ahad");
		names.forEach(name->System.out.println(name));

	}

}
