package com.tenxerconsulting.swagger.doclet;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Restricted {

	// Right that is required
	String value();

}