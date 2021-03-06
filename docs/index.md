siddhi-execution-math
======================================

The **siddhi-execution-math** is an extension to <a target="_blank" href="https://wso2.github
.io/siddhi">Siddhi</a>, which provides useful mathematical functions that can make your siddhi queries more 
flexible.

For more information, see:

* <a target="_blank" href="https://github.com/wso2-extensions/siddhi-execution-math">Source code</a>
* <a target="_blank" href="https://github.com/wso2-extensions/siddhi-execution-math/releases">Releases</a>
* <a target="_blank" href="https://github.com/wso2-extensions/siddhi-execution-math/issues">Issue tracker</a>

## Latest API Docs 

Latest API Docs is <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20">4.0.20</a>.

## How to use 

**Using the extension with <a target="_blank" href="https://github.com/wso2/product-sp">WSO2 Stream Processor</a>**

* You can use this extension with the latest <a target="_blank" href="https://wso2.com/analytics-and-stream-processing">WSO2 Stream Processor</a> offering, which supports an  
editor, debugger, and simulator. 

* By default, the latest version of this extension is shipped with WSO2 Stream Processor. If you wish to use
 an alternative version of this extension, replace the component <a target="_blank" href="https://github
 .com/wso2-extensions/siddhi-execution-math/releases">jar</a> that is available at the 
 `<STREAM_PROCESSOR_HOME>/lib` directory.

**Using the extension as a <a target="_blank" href="https://wso2.github.io/siddhi/documentation/running-as-a-java-library">java library</a>**

* This extension can be added as a maven dependency to your project along with other Siddhi dependencies.

```
     <dependency>
        <groupId>org.wso2.extension.siddhi.execution.math</groupId>
        <artifactId>siddhi-execution-math</artifactId>
        <version>x.x.x</version>
     </dependency>
```

## Jenkins Build Status

---

|  Branch | Build Status |
| :------ |:------------ | 
| master  | [![Build Status](https://wso2.org/jenkins/job/siddhi/job/siddhi-execution-math/badge/icon)](https://wso2.org/jenkins/job/siddhi/job/siddhi-execution-math/) |

---

## Features

* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#percentile-aggregate-function">percentile</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#aggregate-function">(Aggregate Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the pth percentile value of the argument values.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#abs-function">abs</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the absolute value of the given parameter. This function wraps the <code>java.lang.Math.abs()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#acos-function">acos</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>If -1 &lt;= p1 &lt;= 1, returns the arc-cosine (inverse cosine) of p1. If not, it returns NULL. The returned value is in radian scale. This function wraps the java.lang.Math.acos()function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#asin-function">asin</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>If -1 &lt;= p1 &lt;= 1, returns the arc-sin (inverse sine) of p1. If not, it returns NULL. The returned value is in radian scale. This function wraps the java.lang.Math.asin() function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#atan-function">atan</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>1. If a single <code>p1</code> is received, returns the arc-tangent (inverse tangent) of <code>p1</code>.<br>2. If <code>p1</code> is received along with an optional <code>p1</code>, considers them as x,y coordinates and returnsthe respective arc-tangent (inverse tangent) of the <code>p1</code>, <code>p2</code> coordinates. <br>3.The returned value is in radian scale. This function wraps the <code>java.lang.Math.atan()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#bin-function">bin</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns a string representation of the integer/long <code>p1</code> argument as an unsigned integer in base 2. This function wraps the <code>java.lang.Integer.toBinaryString</code> and <code>java.lang.Long.toBinaryString</code> methods.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#cbrt-function">cbrt</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the cube-root of p1 that is in radians. This function wraps the <code>java.lang.Math.cbrt()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#ceil-function">ceil</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the smallest (closest to negative infinity) double value that is greater than or equal to the <code>p1</code> argument, and is equal to a mathematical integer. This function wraps the<code>java.lang.Math.ceil()</code> method.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#conv-function">conv</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Converts <code>a</code> from the <code>fromBase</code> base to the <code>toBase</code> base.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#copysign-function">copySign</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returs a value with the received <code>magnitude</code> and the <code>sign</code>. This function wraps the <code>java.lang.Math.copySign()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#cos-function">cos</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the cosine of <code>p1</code> that is in radians. This function wraps the <code>java.lang.Math.cos()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#cosh-function">cosh</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the hyperbolic cosine of <code>p1</code> that is in radians. This function wraps the <code>java.lang.Math.cosh()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#e-function">e</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the <code>java.lang.Math.E</code> constant, which is the closest double value to e, which is the base of the natural logarithms.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#exp-function">exp</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the Euler's number <code>e</code> raised to the power of <code>p1</code>. This function wraps the <code>java.lang.Math.exp()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#floor-function">floor</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>This function wraps the <code>java.lang.Math.floor()</code> function, which returns the largest (closest to positive infinity) value that is less that or equal to <code>p1</code>, and is equal to a mathematical integer.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#getexponent-function">getExponent</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the unbiased exponent that is used in the representation of <code>p1</code>. This function wraps the <code>java.lang.Math.getExponent()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#hex-function">hex</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Wraps the <code>java.lang.Double.toHexString()</code> function that returns a hexadecimal string representation of <code>p1</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#isinfinite-function">isInfinite</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Wraps the <code>java.lang.Float.isInfinite()</code> and <code>java.lang.Double.isInfinite()</code> functions and returns <code>true</code> if <code>p1</code> is infinitely large in magnitude and returns <code>false</code> if otherwise.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#isnan-function">isNan</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Wraps the <code>java.lang.Float.isNaN()</code> and <code>java.lang.Double.isNaN()</code> functions and returns <code>true</code> if <code>p1</code> is a NaN (Not-a-Number) value, and returns <code>false</code> if otherwise.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#ln-function">ln</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the natural logarithm (base e) of <code>p1</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#log-function">log</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the logarithm of the received <code>number</code> as per the given <code>base</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#log10-function">log10</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the base 10 logarithm of <code>p1</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#log2-function">log2</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the base 2 logarithm of <code>p1</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#max-function">max</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the greater value out of <code>p1</code> and <code>p2</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#min-function">min</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the smaller value out of <code>p1</code> and <code>p2</code>.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#oct-function">oct</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Converts <code>p1</code> to octal.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#parsedouble-function">parseDouble</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the double value of the received string.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#parsefloat-function">parseFloat</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the float value of the received string.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#parseint-function">parseInt</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the integer value of the received string.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#parselong-function">parseLong</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the long value of the received string.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#pi-function">pi</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the <code>java.lang.Math.PI</code> constant, which is the closest value to pi, i.e., the ratio of the circumference of a circle to its diameter. </p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#power-function">power</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns a value by raising to the given power.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#rand-function">rand</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns a stream of pseudo-random numbers when a sequence of calls are sent to the <code>rand()</code>. Optionally, it is possible to define a seed, i.e., <code>rand(seed)</code> using which the pseudo-random numbers are generated. These functions use the <code>java.util.Random</code> class internally.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#round-function">round</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the closest integer/long value depending on the input argument.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#signum-function">signum</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns +1, 0, or -1 for the given positive, zero, and negative values respectively. This function wraps the <code>java.lang.Math.signum()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#sin-function">sin</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the sine of the value given in radians. This function wraps the <code>java.lang.Math.sin()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#sinh-function">sinh</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the hyperbolic sine of the value given in radians. This function wraps the <code>java.lang.Math.sinh()</code> function. </p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#sqrt-function">sqrt</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the square-root of the given value. This function wraps the <code>java.lang.Math.sqrt()</code>s function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#tan-function">tan</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the tan of the given value in radians. This function wraps the <code>java.lang.Math.tan()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#tanh-function">tanh</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Returns the hyperbolic tangent of the value given in radians. This function wraps the <code>java.lang.Math.tanh()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#todegrees-function">toDegrees</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Converts the value given in radians to degrees. This function wraps the <code>java.lang.Math.toDegrees()</code> function.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-execution-math/api/4.0.20/#toradians-function">toRadians</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#function">(Function)</a>*<br><div style="padding-left: 1em;"><p>Converts the value given in degrees to radians. This function wraps the <code>java.lang.Math.toRadians()</code> function.</p></div>

## How to Contribute
 
  * Please report issues at <a target="_blank" href="https://github.com/wso2-extensions/siddhi-execution-math/issues">GitHub Issue Tracker</a>.
  
  * Send your contributions as pull requests to <a target="_blank" href="https://github.com/wso2-extensions/siddhi-execution-math/tree/master">master branch</a>. 
 
## Contact us 

 * Post your questions with the <a target="_blank" href="http://stackoverflow.com/search?q=siddhi">"Siddhi"</a> tag in <a target="_blank" href="http://stackoverflow.com/search?q=siddhi">Stackoverflow</a>. 
 
 * Siddhi developers can be contacted via the mailing lists:
 
    Developers List   : [dev@wso2.org](mailto:dev@wso2.org)
    
    Architecture List : [architecture@wso2.org](mailto:architecture@wso2.org)
 
## Support 

* We are committed to ensuring support for this extension in production. Our unique approach ensures that all support leverages our open development methodology and is provided by the very same engineers who build the technology. 

* For more details and to take advantage of this unique opportunity contact us via <a target="_blank" href="http://wso2.com/support?utm_source=gitanalytics&utm_campaign=gitanalytics_Jul17">http://wso2.com/support/</a>. 
