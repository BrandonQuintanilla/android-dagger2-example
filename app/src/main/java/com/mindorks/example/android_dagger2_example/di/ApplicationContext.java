package com.mindorks.example.android_dagger2_example.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by janisharali on 25/12/16.
 */

@Qualifier
@Retention(RetentionPolicy.CLASS)
public @interface ApplicationContext {
}