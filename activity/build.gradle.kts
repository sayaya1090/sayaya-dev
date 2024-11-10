plugins {
    kotlin("jvm")
    id("net.sayaya.gwt")
}
dependencies {
    implementation(libs.sayaya.rx)
    implementation(libs.bundles.gwt)
    implementation(libs.lombok)
    annotationProcessor(libs.lombok)
}
tasks {
    jar {
        from(sourceSets.main.get().allSource)
        duplicatesStrategy = DuplicatesStrategy.WARN
    }
    gwtTest {
        launcherDir = file("src/test/webapp")
    }
}