package dev.sayaya.client.domain;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@JsType(isNative=true, namespace= JsPackage.GLOBAL, name="Object")
@Getter(onMethod_ = { @JsOverlay, @JsIgnore} )
@Accessors(fluent = true)
@Builder
public final class User {
    private String id;
    private String name;
}
