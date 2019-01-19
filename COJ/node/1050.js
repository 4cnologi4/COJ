process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    
    var numbers = read.toString().split(' ');
    c = 0;	
    var n = parseInt(numbers.pop());

    for (i = 1; i <= n; i++) {
            if (coprimos(i, n)) {
                c++;
            }
		}
		console.log(c);
    process.exit();
});

	function coprimos(i,n) {

        if (i % n == 1) {
            return true;
        }
        if (i % n == 0) {
            return false;
        }
        return coprimos(n, i % n);
    }