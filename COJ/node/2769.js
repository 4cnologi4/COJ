process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    var numbers = read.toString().split(' ');
    var t = parseInt(numbers.pop());
    for (i = 1; i <= t; i++) {
    console.log(i + ": I am participating in the Engineer's day.");
}
    process.exit();
});