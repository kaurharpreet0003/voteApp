import Foundation

print("Hello World")

func split(name: String) -> (firstName: String?, lastName: String?) {
    let names = name.components(separatedBy: " ")
    return (firstName: names.first, lastName: names.count > 1 ? names.last : nil)
}

let names = split(name: "donald trumph")
print((names.firstName ?? "Unknown") + " " + (names.lastName ?? "Unknown"))

split(name: "Donald Trump")
split(name: "Batman")
split(name: "")
split(name: "Dwayne \"The Rock\" Johnson")


func square(_ a: Int) -> Int {
    return (a * a)
}

print(square(3))


func whoAmI(name: String) { 
    if name == "Bruce Wayne" { 
        print("I am Batman")
     } else {
         print("I am not Batman.")
     }
}
whoAmI(name: "Bruce ")


func sum(value1: Int...) -> Int {
  var sum = 0
  for a in value1 {
      sum += a
  }
  return sum
} 
print (sum(value1: 2, 11, 55, 22))





