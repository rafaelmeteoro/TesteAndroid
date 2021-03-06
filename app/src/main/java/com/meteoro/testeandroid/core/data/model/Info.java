package com.meteoro.testeandroid.core.data.model;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true, chain = true)
public class Info {

    @Getter
    String name;

    @Getter
    String data;
}
