package dev.sayaya.client.domain;

import jsinterop.annotations.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Objects;

@JsType(isNative=true, namespace= JsPackage.GLOBAL, name="Object")
@Setter(onMethod_ = { @JsOverlay, @JsIgnore } )
@Getter(onMethod_ = { @JsOverlay, @JsIgnore} )
@Accessors(fluent = true)
@Builder
public final class Page {
    private String icon;
    @JsProperty(name="icon_type")
    private String iconType;
    private String title;
    private String uri;
    private String script;
    private String order;
    @Override @JsOverlay @JsIgnore
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return Objects.equals(uri, page.uri) && Objects.equals(script, page.script);
    }
    @Override @JsOverlay @JsIgnore
    public int hashCode() {
        return Objects.hash(uri, script);
    }
}