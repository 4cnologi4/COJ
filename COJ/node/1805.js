process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
    var numbers = chunk.toString().split(' ');

    var a = parseInt(numbers.pop());
    var b = parseInt(numbers.pop());
    var c = (a + b) * 2;
    process.stdout.write(c.toString());
    process.exit();
});