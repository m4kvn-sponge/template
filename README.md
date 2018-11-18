# sponge-template

## Usage template

1. Clone this repository and rename to your plugin name.

```
git clone https://github.com/m4kvn/sponge-template.git <your-plugin-name>
```

2. Remove and Initialize dot git.

```
cd <your-plugin-name>
rm -fr .git
git init
```

3. Edit Properties for your plugin.

```Properties.kt
object Properties {
    val pluginGroup = "com.m4kvn"
    val pluginId = "sponge-template"
    val pluginVersion = "1.0-SNAPSHOT"
}
```

4. Refactor SpongeTemplate for your plugin.

Rename `id`, `name`, `description` and class name `SpongeTemplate`.

```SpongeTemplate.kt
@Plugin(
        id = "sponge-template",
        name = "Sponge Template",
        description = "project description"
)
class SpongeTemplate {

    @Inject lateinit var logger: Logger

    @Listener
    fun onServerStart(event: GameStartedServerEvent) {
        logger.debug("Sponge Server Plugin on Start.")
    }
}
```

## Build plugin

```
./gradlew build
```
