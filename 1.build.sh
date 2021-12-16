#!/bin/sh
set -e -u

FILE=$1
NAME=${FILE%.kt}

echo "building $NAME..." >&2

if ! [ -f "$FILE" ]; then
    echo "$FILE not exists" >&2
    exit 1
fi

rm -rf "$NAME"
mkdir -p "$NAME"

cd "$NAME"
kotlinc-jvm "../$FILE"
cd - > /dev/null
