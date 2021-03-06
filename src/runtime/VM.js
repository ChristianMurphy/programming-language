'use strict';

var fs = require('fs');
var line;
var replCounter = 2;
var programCounter = 0;
var stack = [];
var symbolTable = {};

fs.readFile(process.argv[replCounter++], 'utf8', function(error, file) {
    file = file.split('\n');

    if (file.length === 0) {
        line = ['end'];
    } else {
        line = file[programCounter];
    }

    while (line !== 'end') {
        var tokens = line.split(' ');
        switch (tokens[0]) {
            case 'read':
                switch (tokens[1]) {
                    case 'number':
                        stack.push(parseInt(process.argv[replCounter++], 10));
                        break;
                    case 'string':
                        stack.push(process.argv[replCounter++]);
                        break;
                    case 'boolean':
                        if (process.argv[replCounter++] === 'yes') {
                            stack.push(true);
                        } else {
                            stack.push(false);
                        }
                }
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
