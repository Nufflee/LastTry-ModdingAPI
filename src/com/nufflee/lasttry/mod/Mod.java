package com.nufflee.lasttry.mod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mod {
	String modid();
	String name();
	String version() default "1.0";
	String dependencies() default "";
	String authors() default "";
	String acceptableGameVersions() default "";
	String acceptableSaveVersions() default "";
}
