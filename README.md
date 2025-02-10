# Groovy NullPointerException in Loosely Typed Methods

This example demonstrates a common issue in Groovy: unexpected null results when dealing with loosely typed methods and null parameters.  Groovy's flexibility with types can sometimes mask potential null pointer exceptions unless carefully handled.

The `bug.groovy` file contains code that shows a method returning null when either input is null. While this might seem intuitive, it can lead to unexpected behavior if not anticipated in calling code.  The solution demonstrates a safer approach using explicit null checks or Groovy's safe navigation operator.