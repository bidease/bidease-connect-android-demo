pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://artifact.bytedance.com/repository/pangle")
        }
        maven {
            setUrl("https://dl-maven-android.mintegral.com/repository/mbridge_android_sdk_oversea")
        }
        maven {
            setUrl("https://cboost.jfrog.io/artifactory/chartboost-ads/")
        }
    }
}

rootProject.name = "Bidease Connect Android Demo"
include(":app")
