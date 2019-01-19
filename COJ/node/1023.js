process.stdin.resume()
process.stdin.setEncoding('utf8')

process.stdin.on('data', function (chunk) {
  var values = chunk.split('\n')
  values.pop()

  var total = (values.reduce(sum, 0) / 12).toFixed(2)
  process.stdout.write('$' + total + '\n')
  process.exit()
})

function sum (acc, value) {
  return acc + parseFloat(value)
}