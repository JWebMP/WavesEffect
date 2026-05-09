# JWebMP Waves Effect Plugin

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/waveseffect)](https://central.sonatype.com/artifact/com.jwebmp.plugins/waveseffect)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-21-DD0031?logo=angular)
![TypeScript](https://img.shields.io/badge/TypeScript-5-3178C6?logo=typescript)

<!-- Tech icons row -->
![Waves](https://img.shields.io/badge/Waves-0.7.6-blue)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

Material-design inspired click/tap ripple effect for JWebMP using [Waves.js](https://github.com/fians/Waves). Adds beautiful click-feedback animations to buttons and interactive elements.

Built on [Waves 0.7.6](https://fians.github.io/Waves/) · [JWebMP Core](https://jwebmp.com/) · JPMS module `com.jwebmp.plugins.waveseffect` · Java 25+

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>waveseffect</artifactId>
  <version>2.0.0-SNAPSHOT</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:waveseffect:2.0.0-SNAPSHOT")
```
</details>

### NPM Dependencies

The plugin automatically includes:

```json
{
  "dependencies": {
    "node-waves": "^0.7.6"
  }
}
```

## JPMS Module

```java
module your.module {
    requires com.jwebmp.plugins.waveseffect;
}
```

## Features

- **Material ripple effect** — Google Material Design inspired click/tap animations
- **Multiple effect styles** — Light, Circle, Button, Float, Block variants
- **CSS selector targeting** — apply waves to any DOM elements via selector
- **Auto-initialization** — `Waves.init()` called automatically via feature attachment
- **SCSS styles included** — full Waves stylesheet auto-registered
- **Zero configuration** — auto-registered via ServiceLoader SPI (`IPageConfigurator`, `IGuiceScanModuleInclusions`)
- **Type-safe enum** — `WavesEffects` enum for all effect class variants

## Quick Start

```java
// Add waves effect to a button
var button = new WaButton<>("Click Me");
button.addFeature(new WavesAttachFeature(button));

// Apply waves to all elements matching a CSS selector
var feature = new WavesApplyToSelectorFeature(".btn", WavesEffects.Waves_Light);
page.getBody().addFeature(feature);
```

## Available Effects

| Enum Value | CSS Class | Description |
|-----------|-----------|-------------|
| `Waves_Effect` | `waves-effect` | Default ripple effect |
| `Waves_Light` | `waves-light` | Light-colored ripple for dark backgrounds |
| `Waves_Circle` | `waves-circle` | Circular ripple pattern |
| `Waves_Button` | `waves-button` | Button-specific styling |
| `Waves_Float` | `waves-float` | Floating action button style |
| `Waves_Block` | `waves-block` | Block-level ripple fill |

## Architecture

```
┌─────────────────────────────────────────────┐
│  Your JWebMP Application                    │
├─────────────────────────────────────────────┤
│  com.jwebmp.plugins.waveseffect            │
│    ├── WavesEffectPageConfigurator (scripts)│
│    ├── WavesEffects (enum)                 │
│    ├── WavesAttachFeature (Waves.init())   │
│    ├── WavesApplyToSelectorFeature         │
│    └── WavesEffectsInclusionModule (SPI)   │
├─────────────────────────────────────────────┤
│  node-waves NPM package (JS + SCSS)        │
└─────────────────────────────────────────────┘
```

## SPI Extension Points

| Direction | Interface | Implementation |
|-----------|-----------|---------------|
| provides  | `IPageConfigurator` | `WavesEffectPageConfigurator` — registers Waves JS and SCSS |
| provides  | `IGuiceScanModuleInclusions` | `WavesEffectsInclusionModule` — includes module in classpath scan |

## Dependencies

| Dependency | Purpose |
|-----------|---------|
| `com.jwebmp:jwebmp-core` | JWebMP core framework (Feature, Page, Component) |
| `com.jwebmp.plugins:typescript-client` | TypeScript/Angular generation |
| `node-waves` (NPM) | Waves.js ripple effect library |

## Links

- [Waves.js GitHub](https://github.com/fians/Waves)
- [Waves.js Demo](https://fians.github.io/Waves/)
- [JWebMP Documentation](https://jwebmp.com/)

