```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 //Or throw an exception or handle differently based on requirements
  }
  return a + b
}

println myMethod(1, 2) // 3
println myMethod(null, 2) // 0
println myMethod(1, null) // 0
println myMethod(null, null) // 0

//Alternatively using Groovy's safe navigation operator:
def myMethodSafeNav(a, b) {
  return (a ?: 0) + (b ?: 0)
}

println myMethodSafeNav(1, 2) // 3
println myMethodSafeNav(null, 2) // 2
println myMethodSafeNav(1, null) // 1
println myMethodSafeNav(null, null) // 0
```