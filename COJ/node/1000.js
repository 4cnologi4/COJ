process.stdin.resume();
//process.openStdin();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    var numbers = read.toString().split(' ');
    var a = parseInt(numbers.pop());
    var b = parseInt(numbers.pop());
    var c = a+b;
    console.log("%d",c)
    process.exit();
});