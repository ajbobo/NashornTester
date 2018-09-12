var string = 'one {two} three {fourf} five {sixes} seven {eight}';
var pattern = /{((\w)(\w*)(\2))}/g;

var match = pattern.exec(string);
while (match) {
    print(JSON.stringify(match));
    print("Result: " + match[1]);
    match = pattern.exec(string);
}