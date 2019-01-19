process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (read) {
    var letr = read.toString().split(' ');
    var letra = letr.pop();
    sum = 0;
        for (i = 0; i < letra.length; i++) {

            switch (letra.charAt(i)) {
                case 'A':
                    sum += 1;
                    break;
                case 'B':
                    sum += 2;
                    break;
                case 'C':
                    sum += 3;
                    break;
                case 'D':
                    sum += 4;
                    break;
                case 'E':
                    sum += 5;
                    break;
                case 'F':
                    sum += 6;
                    break;
                case 'G':
                    sum += 7;
                    break;
                case 'H':
                    sum += 8;
                    break;
                case 'I':
                    sum += 9;
                    break;
                case 'J':
                    sum += 10;
                    break;
                case 'K':
                    sum += 11;
                    break;
                case 'L':
                    sum += 12;
                    break;
                case 'M':
                    sum += 13;
                    break;
                case 'N':
                    sum += 14;
                    break;
                case 'O':
                    sum += 15;
                    break;
                case 'P':
                    sum += 16;
                    break;
                case 'Q':
                    sum += 17;
                    break;
                case 'R':
                    sum += 18;
                    break;
                case 'S':
                    sum += 19;
                    break;
                case 'T':
                    sum += 20;
                    break;
                case 'U':
                    sum += 21;
                    break;
                case 'V':
                    sum += 22;
                    break;
                case 'W':
                    sum += 23;
                    break;
                case 'X':
                    sum += 24;
                    break;
                case 'Y':
                    sum += 25;
                    break;
                case 'Z':
                    sum += 26;
                    break;
            }
        }
        console.log(sum);
    process.exit();
});