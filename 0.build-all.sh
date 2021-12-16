#!/bin/sh

set -e -u

DIR="$(dirname "$0")"

# The list of files to build
FILES=$(cat <<EOF
crossinline-expandation
lambda-types
EOF
);

for FILE in $FILES; do
    "$DIR/1.build.sh" "$FILE.kt"
done

for FILE in $FILES; do
    find "$FILE" -name "*.class" | while read -r CLASS_FILE; do
        "$DIR/1.dump.sh" "$CLASS_FILE" > "$CLASS_FILE.txt"
    done
done
