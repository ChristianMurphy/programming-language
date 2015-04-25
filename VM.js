var fs = require('fs');

var file = fs.readFile(process.argv[2], 'utf8', function(error, file) {
    file = file.split('\n');
    var line;
    var programCounter = 0;
    var stack = [];
    var symbolTable = {};

    if (file.length === 0) {
        line = ['end'];
    }
    else {
        line = file[programCounter];
    }

    while (line != 'end') {
        var tokens = line.split(' ');
        switch (tokens[0]) {
            case 'read':
                stack.push(parseInt(process.argv[3], 10));

                break;
            case 'store':
                symbolTable[tokens[1]] = stack.pop();
                break;
            case 'push':
                if (tokens[1] in symbolTable) {
                    stack.push(symbolTable[tokens[1]]);
                } else {
                    stack.push(tokens[1]);
                }

                break;
            case 'greater':
                var first = stack.pop();
                var second = stack.pop();
                stack.push(second > first);
                break;
            case 'lesser':
                var first = stack.pop();
                var second = stack.pop();
                stack.push(second < first);
                break;
            case 'multiply':
                var first = stack.pop();
                var second = stack.pop();
                stack.push(second * first);
                break;
            case 'divide':
                var first = stack.pop();
                var second = stack.pop();
                stack.push(second / first);
                break;
            case 'add':
                var first = stack.pop();
                var second = stack.pop();
                stack.push(second + first);
                break;
            case 'minus':
                var first = stack.pop();
                var second = stack.pop();
                stack.push(second - first);
                break;
            case 'testfgoto':
                if (!stack.pop()) {
                    programCounter = tokens[1] - 1;
                }

                break;
            case 'testtgoto':
                if (stack.pop()) {
                    programCounter = tokens[1] - 1;
                }

                break;
            case 'print':
                console.log(stack.pop());
                break;
            default:
                console.log('ERROR NO SUCH OPCODE');
        }

        line = file[++programCounter];
        if (programCounter > file.length - 1) {
            line = 'end';
        }
    }
});
