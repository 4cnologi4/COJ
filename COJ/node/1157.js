    fac = 2;
        N = 2.5, a = 1;
        console.log('n e');
        console.log('- -----------');
        console.log('0 1');
        console.log('1 2');
        console.log('2 2.5');

        for (i = 3; i <= 9; i++) {

            N = N + a / (fac * i);
            fac = fac * i;
            f = N.toFixed(9);
            console.log(i + ' ' + f);
            //console.log(i + ' ' + Math.round((N * 100) / 100));
        }