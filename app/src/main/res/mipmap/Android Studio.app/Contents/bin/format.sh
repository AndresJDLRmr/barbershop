#!/bin/sh
# ------------------------------------------------------
# Android Studio formatting script.
# ------------------------------------------------------

IDE_BIN_HOME="${0%/*}"
exec "$IDE_BIN_HOME/../MacOS/studio" format "$@"
