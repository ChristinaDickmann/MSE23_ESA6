plugins {
	id("com.gradle.enterprise") version("3.15.1")
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

gradleEnterprise {
	if (System.getenv("CI") != null) {
		buildScan {
			publishAlways()
			termsOfServiceUrl = "https://gradle.com/terms-of-service"
			termsOfServiceAgree = "yes"
		}
	}
}

rootProject.name = "MSE23_ESA6"
include("lib")
