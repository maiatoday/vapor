# How to add Hot Reload

The [Compose Hot reload repo](https://github.com/JetBrains/compose-hot-reload) has the details. 

1. Check the kotlin version is above 2.1.20 in [toml file line 2](gradle/libs.versions.toml#L2)
2. Add the plugin and versions to the [toml file line 12](gradle/libs.versions.toml#L12)
3. Add the plugin to [build.gradle.kts line 9](build.gradle.kts#L9) 
4. Setup the runHot target in [build.gradle.kts line 9](build.gradle.kts#L45)
5. Add the Foojay resolver in [settings.gradle.kts line 10](settings.gradle.kts#L10) file