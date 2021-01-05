package com.atiurin.ultron.extensions

import android.graphics.Point
import android.graphics.Rect
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.UiObject2
import com.atiurin.ultron.core.config.UltronConfig
import com.atiurin.ultron.core.uiautomator.UiAutomatorOperationResult
import com.atiurin.ultron.core.uiautomator.uiobject2.UiAutomatorBySelectorAction
import com.atiurin.ultron.core.uiautomator.uiobject2.UiAutomatorBySelectorAssertion
import com.atiurin.ultron.core.uiautomator.uiobject2.UiObject2Operation
import org.hamcrest.Matcher

fun UiObject2.isSuccess(
    action: UiObject2.() -> Unit
): Boolean {
    return this.methodToBoolean(action)
}

/** Returns this object's parent, or null if it has no parent. */
fun UiObject2.getParent(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): UiObject2? {
    return UiObject2Operation.getParent({ this }, this.toString(), timeoutMs, resultHandler)
}

/**
 * @return Returns a collection of the child elements directly under this object. Empty list if no child exist
 * */
fun UiObject2.getChildren(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): List<UiObject2> {
    return UiObject2Operation.getChildren({ this }, this.toString(), timeoutMs, resultHandler)
}

/** Returns the number of child elements directly under this object, 0 if it has no child*/
fun UiObject2.getChildCount(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Int {
    return UiObject2Operation.getChildCount({ this }, this.toString(), timeoutMs, resultHandler)
}

/**
 * Searches all elements under this object and returns the first object to match the criteria,
 * or null if no matching objects are found.
 */
fun UiObject2.findObject(
    bySelector: BySelector,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): UiObject2? {
    return UiObject2Operation.findObject(
        bySelector,
        { this },
        this.toString(),
        timeoutMs,
        resultHandler
    )
}

/** Searches all elements under this object and returns all objects that match the criteria. */
fun UiObject2.findObjects(
    bySelector: BySelector,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): List<UiObject2> {
    return UiObject2Operation.findObjects(
        bySelector,
        { this },
        this.toString(),
        timeoutMs,
        resultHandler
    )
}

/** Clicks on this object. */
fun UiObject2.click(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.click({ this }, this.toString(), timeoutMs, resultHandler)
}

/** Performs a click on this object that lasts for {@code duration} milliseconds. */
fun UiObject2.click(
    duration: Long,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.click({ this }, this.toString(), duration, timeoutMs, resultHandler)
}

/** Performs a long click on this object. */
fun UiObject2.longClick(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.longClick({ this }, this.toString(), timeoutMs, resultHandler)
}

/** Clears the text content if this object is an editable field. */
fun UiObject2.clear(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.clear({ this }, this.toString(), timeoutMs, resultHandler)
}

/**
 * @return view text
 */
fun UiObject2.getText(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): String {
    return UiObject2Operation.getText({ this }, this.toString(), timeoutMs, resultHandler)
}

/** Returns the package name of the app that this object belongs to. */
fun UiObject2.getApplicationPackage(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): String {
    return UiObject2Operation.getApplicationPackage(
        { this },
        this.toString(),
        timeoutMs,
        resultHandler
    )
}

/** Returns the visible bounds of this object in screen coordinates. */
fun UiObject2.getVisibleBounds(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Rect {
    return UiObject2Operation.getVisibleBounds({ this }, this.toString(), timeoutMs, resultHandler)
}

/** Returns a point in the center of the visible bounds of this object. */
fun UiObject2.getVisibleCenter(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Point {
    return UiObject2Operation.getVisibleCenter({ this }, this.toString(), timeoutMs, resultHandler)
}

/** Returns the fully qualified resource name for this object's id.  */
fun UiObject2.getResourceName(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): String {
    return UiObject2Operation.getResourceName({ this }, this.toString(), timeoutMs, resultHandler)
}

/**
 * Returns the class name of the underlying [android.view.View] represented by this object.
 */
fun UiObject2.getClassName(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): String {
    return UiObject2Operation.getClassName({ this }, this.resourceName, timeoutMs, resultHandler)
}

/** Returns the content description for this object. */
fun UiObject2.getContentDescription(
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): String {
    return UiObject2Operation.getContentDescription(
        { this },
        this.toString(),
        timeoutMs,
        resultHandler
    )
}

/** Add the text content if this object is an editable field. */
fun UiObject2.addText(
    text: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    return UiObject2Operation.addText({ this }, this.toString(), text, timeoutMs, resultHandler)
}

/**
 * Set the text content by sending individual key codes.
 * @hide
 */
fun UiObject2.legacySetText(
    text: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    return UiObject2Operation.legacySetText(
        { this },
        this.toString(),
        text,
        timeoutMs,
        resultHandler
    )
}

/** Sets the text content if this object is an editable field. */
fun UiObject2.replaceText(
    text: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    return UiObject2Operation.replaceText({ this }, this.toString(), text, timeoutMs, resultHandler)
}

fun UiObject2.drag(
    dest: Point,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.drag({ this }, this.toString(), dest, timeoutMs, resultHandler)
}

fun UiObject2.drag(
    dest: Point,
    speed: Int,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.drag({ this }, this.toString(), dest, speed, timeoutMs, resultHandler)
}

/**
 * Performs a pinch close gesture on this object.
 *
 * @param percent The size of the pinch as a percentage of this object's size.
 */
fun UiObject2.pinchClose(
    percent: Float,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.pinchClose({ this }, this.toString(), percent, timeoutMs, resultHandler)
}

/**
 * Performs a pinch close gesture on this object.
 *
 * @param percent The size of the pinch as a percentage of this object's size.
 * @param speed The speed at which to perform this gesture in pixels per second.
 */
fun UiObject2.pinchClose(
    percent: Float,
    speed: Int,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.pinchClose(
        { this },
        this.toString(),
        percent,
        speed,
        timeoutMs,
        resultHandler
    )
}

/**
 * Performs a pinch open gesture on this object.
 *
 * @param percent The size of the pinch as a percentage of this object's size.
 */
fun UiObject2.pinchOpen(
    percent: Float,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.pinchOpen({ this }, this.toString(), percent, timeoutMs, resultHandler)
}

/**
 * Performs a pinch open gesture on this object.
 *
 * @param percent The size of the pinch as a percentage of this object's size.
 * @param speed The speed at which to perform this gesture in pixels per second.
 */
fun UiObject2.pinchOpen(
    percent: Float,
    speed: Int,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.pinchOpen(
        { this },
        this.toString(),
        percent,
        speed,
        timeoutMs,
        resultHandler
    )
}

/**
 * Performs a swipe gesture on this object.
 *
 * @param direction The direction in which to swipe.
 * @param percent The length of the swipe as a percentage of this object's size.
 */
fun UiObject2.swipe(
    direction: Direction,
    percent: Float,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.swipe(
        { this },
        this.toString(),
        direction,
        percent,
        timeoutMs,
        resultHandler
    )
}

/**
 * Performs a swipe gesture on this object.
 *
 * @param direction The direction in which to swipe.
 * @param percent The length of the swipe as a percentage of this object's size.
 * @param speed The speed at which to perform this gesture in pixels per second.
 */
fun UiObject2.swipe(
    direction: Direction,
    percent: Float,
    speed: Int,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
) {
    UiObject2Operation.swipe(
        { this },
        this.toString(),
        direction,
        percent,
        speed,
        timeoutMs,
        resultHandler
    )
}

/**
 * Performs a scroll gesture on this object.
 *
 * @param direction The direction in which to scroll.
 * @param percent The distance to scroll as a percentage of this object's visible size.
 * @return Whether the object can still scroll in the given direction.
 */
fun UiObject2.scroll(
    direction: Direction,
    percent: Float,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Boolean {
    return UiObject2Operation.scroll(
        { this },
        this.toString(),
        direction,
        percent,
        timeoutMs,
        resultHandler
    )
}

/**
 * Performs a scroll gesture on this object.
 *
 * @param direction The direction in which to scroll.
 * @param percent The distance to scroll as a percentage of this object's visible size.
 * @param speed The speed at which to perform this gesture in pixels per second.
 * @return Whether the object can still scroll in the given direction.
 */
fun UiObject2.scroll(
    direction: Direction,
    percent: Float,
    speed: Int,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Boolean {
    return UiObject2Operation.scroll(
        { this },
        this.toString(),
        direction,
        percent,
        speed,
        timeoutMs,
        resultHandler
    )
}

/**
 * Performs a fling gesture on this object.
 *
 * @param direction The direction in which to fling.
 * @return Whether the object can still scroll in the given direction.
 */
fun UiObject2.fling(
    direction: Direction,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Boolean {
    return UiObject2Operation.fling({ this }, this.toString(), direction, timeoutMs, resultHandler)
}

/**
 * Performs a fling gesture on this object.
 *
 * @param direction The direction in which to fling.
 * @param speed The speed at which to perform this gesture in pixels per second.
 * @return Whether the object can still scroll in the given direction.
 */
fun UiObject2.fling(
    direction: Direction,
    speed: Int,
    timeoutMs: Long = UltronConfig.UiAutomator.ACTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAction>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorActionResultHandler
): Boolean {
    return UiObject2Operation.fling(
        { this },
        this.toString(),
        direction,
        speed,
        timeoutMs,
        resultHandler
    )
}


//asserts
fun UiObject2.hasText(
    text: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.hasText({ this }, this.toString(), text, timeoutMs, resultHandler)
}

fun UiObject2.hasText(
    textMatcher: Matcher<String>,
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.hasText(
        { this },
        this.toString(),
        textMatcher,
        timeoutMs,
        resultHandler
    )
}

fun UiObject2.textContains(
    text: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.textContains({ this }, this.toString(), text, timeoutMs, resultHandler)
}


fun UiObject2.hasContentDescription(
    contentDesc: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.hasContentDescription(
        { this },
        this.toString(),
        contentDesc,
        timeoutMs,
        resultHandler
    )
}

fun UiObject2.hasContentDescription(
    contentDescMatcher: Matcher<String>,
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.hasContentDescription(
        { this },
        this.toString(),
        contentDescMatcher,
        timeoutMs,
        resultHandler
    )
}

fun UiObject2.contentDescriptionContains(
    contentDescSubstring: String,
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.contentDescriptionContains(
        { this },
        this.toString(),
        contentDescSubstring,
        timeoutMs,
        resultHandler
    )
}

fun UiObject2.isCheckable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isCheckable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotCheckable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotCheckable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isChecked(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isChecked({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotChecked(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotChecked({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isClickable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isClickable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotClickable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotClickable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isEnabled(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isEnabled({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotEnabled(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotEnabled({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isFocusable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isFocusable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotFocusable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotFocusable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isFocused(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isFocused({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotFocused(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotFocused({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isLongClickable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isLongClickable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotLongClickable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotLongClickable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isScrollable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isScrollable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotScrollable(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotScrollable({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isSelected(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isSelected({ this }, this.toString(), timeoutMs, resultHandler)
}

fun UiObject2.isNotSelected(
    timeoutMs: Long = UltronConfig.UiAutomator.ASSERTION_TIMEOUT,
    resultHandler: (UiAutomatorOperationResult<UiAutomatorBySelectorAssertion>) -> Unit = UltronConfig.UiAutomator.UiObject2Config.bySelectorAssertionResultHandler
) {
    UiObject2Operation.isNotSelected({ this }, this.toString(), timeoutMs, resultHandler)
}