package ch.tutteli.atrium.api.infix.en_GB.creating.charsequence

import ch.tutteli.atrium.domain.builders.utils.VarArgHelper

/**
 * Parameter object to express `String, vararg String` in the infix-api.
 *
 * Use the function `regexPatterns("pattern", ...)` to create this representation.
 */
class RegexPatterns(pattern: String, otherPatterns: Array<out String>) :
    VarArgHelper<String> {
    override val expected = pattern
    override val otherExpected = otherPatterns
}
