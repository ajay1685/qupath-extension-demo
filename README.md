# QuPath extension demo

This is a demo extension for [QuPath](http://qupath.github.io)!

The goal of this project is to build a demo extension with a few basic example of functions, commands, guis, tables and charts in QuPath. This repository may help those who have limited expertise with Java to be able to learn from example. 

## Installing

To install the demo extension, drag `qupath-extension-demo-[version].jar` file from `Build\libs` directory onto the main QuPath window.

If you haven't installed any extensions before, you'll be prompted to select a QuPath user directory.
The extension will then be copied to a location inside that directory.

You might then need to restart QuPath (but not your computer).


## Building

You can build the QuPath demo extension from source with

```bash
gradlew clean build
```

The output will be under `build/libs`.

* `clean` removes anything old
* `build` builds the QuPath extension as a *.jar* file and adds it to `libs`
