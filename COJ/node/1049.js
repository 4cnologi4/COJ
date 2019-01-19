process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    var numbers = read.toString().split(' ');
    var n = parseInt(numbers.pop());
    var sum;
    if (n > 0) {
        sum = n * (n + 1) / 2;
    }
    else {
        sum = ((((n * n) + ((-1) * n)) / 2) - 1) * (-1);
    }
   console.log(sum);
    process.exit();
});