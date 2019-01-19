process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    var numbers = read.toString().split(' ');
    n = parseInt(numbers.pop());
    if (n == 2) {
        console.log("NO");
    } else if (n != 2) {
        if (n % 2 == 0) {
            console.log("YES");
        }
        else {
            console.log("NO");
        }
    }
    process.exit();
});