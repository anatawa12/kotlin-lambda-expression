#!/bin/sh

JAR="$(dirname "$0")/tools/build/libs/tools.jar"

if ! [ -f "$JAR" ]; then
    echo "$JAR not exists." >&2
    echo "build tools fitst." >&2
    exit 1
fi

java -cp "$JAR" DumperKt "$@"
