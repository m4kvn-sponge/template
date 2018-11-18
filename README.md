# sponge-template

## Usage

### 1. Clone this repository and rename to your plugin name.

```
git clone https://github.com/m4kvn/sponge-template.git <your-plugin-name>
```

### 2. Remove `.git`

```
cd <your-plugin-name>
rm -fr .git
```

### 3. Edit Properties for your plugin.

Please edit `buildSrc/src/main/java/Properties.kt`

| name | description |
| :--: | :---------- |
| pluginGroup | Your plugin group |
| pluginVersion | Your plugin version |

```Properties.kt
object Properties {
    const val pluginGroup = "com.m4kvn"
    const val pluginVersion = "1.0-SNAPSHOT"
}
```

### 4. Refactor main package for your plugin.

Rename `com.m4kvn.spongetemplate` to your package name.

ex) `com.<your-github-id>.<your-plugin-id>`

### 5. Edit Plugin information for your plugin.

Rename `id`, `name` and `description`.

```Main.kt
@Plugin(
    id = "sponge-template",
    name = "Sponge Template",
    description = "This is Sponge Plugin Template"
)
class Main {

    @Inject
    lateinit var logger: Logger

    @Listener
    fun onServerStart(event: GameStartedServerEvent) {
        logger.debug("Sponge Server Plugin on Start.")
    }
}
```

