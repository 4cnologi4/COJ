process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    var numbers = read.toString();
    var cad = "a";

    var radio = parseInt(numbers);
    var rad = radio * 4;

    process.stdout.write("A");
    for (var i = 0; i < rad; i++) {
        process.stdout.write(cad);
    }
    process.stdout.write("h\n");

    process.exit();
});