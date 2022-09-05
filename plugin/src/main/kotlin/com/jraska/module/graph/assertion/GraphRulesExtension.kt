package com.jraska.module.graph.assertion

open class GraphRulesExtension {
  var maxHeight: Int = 0

  /**
   * each restriction in format "regexp -X> regexp" e.g.: ":feature-[a-z]* -X> :forbidden-lib"
   */
  var restricted =
    emptyArray<String>()

  /**
   * (Optional) Exceptions in defined restrictions.
   * Useful for refactoring phase, where one or a more dependency exist which requires time to adhere to newly defined restrictions
   * each exception in format "regexp -> regexp" e.g.: ":feature-[a-z]* -> :allowed-lib"
   */
  var restrictedExceptions =
    emptyArray<String>()

  /**
   * each allowance in format "regexp -> regexp" e.g.: ":feature-[a-z]* -> :forbidden-lib"
   */
  var allowed =
    emptyArray<String>()

  /**
   * (Optional) Exceptions in defined allowed.
   * Useful for refactoring phase, where one or a more dependency exist which requires time to adhere to newly defined restrictions
   * each exception in format "regexp -> regexp" e.g.: ":feature-[a-z]* -> :allowed-lib"
   */
  var allowedExceptions =
    emptyArray<String>()
  var configurations: Set<String> = Api.API_IMPLEMENTATON_CONFIGURATIONS
}
