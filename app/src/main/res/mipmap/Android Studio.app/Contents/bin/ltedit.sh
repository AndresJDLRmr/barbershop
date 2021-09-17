#!/bin/sh
# ------------------------------------------------------
# Android Studio LightEdit mode script.
# ------------------------------------------------------

IDE_BIN_HOME="${0%/*}"
exec "$IDE_BIN_HOME/../MacOS/studio" -e "$@"
