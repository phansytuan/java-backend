/*! jQuery v3.6.0 | (c) OpenJS Foundation and other contributors | jquery.org/license */
!function(e,t){"use strict";"object"==typeof module&&"object"==typeof module.exports?module.exports=e.document?t(e,!0):function(e){if(!e.document)throw new Error("jQuery requires a window with a document");return t(e)}:t(e)}("undefined"!=typeof window?window:this,function(C,e){"use strict";var t=[],r=Object.getPrototypeOf,s=t.slice,g=t.flat?function(e){return t.flat.call(e)}:function(e){return t.concat.apply([],e)},u=t.push,i=t.indexOf,n={},o=n.toString,v=n.hasOwnProperty,a=v.toString,l=a.call(Object),y={},m=function(e){return"function"==typeof e&&"number"!=typeof e.nodeType&&"function"!=typeof e.item},x=function(e){return null!=e&&e===e.window},E=C.document,c={type:!0,src:!0,nonce:!0,noModule:!0};function b(e,t,n){var r,i,o=(n=n||E).createElement("script");if(o.text=e,t)for(r in c)(i=t[r]||t.getAttribute&&t.getAttribute(r))&&o.setAttribute(r,i);n.head.appendChild(o).parentNode.removeChild(o)}function w(e){return null==e?e+"":"object"==typeof e||"function"==typeof e?n[o.call(e)]||"object":typeof e}var f="3.6.0",S=function(e,t){return new S.fn.init(e,t)};function p(e){var t=!!e&&"length"in e&&e.length,n=w(e);return!m(e)&&!x(e)&&("array"===n||0===t||"number"==typeof t&&0<t&&t-1 in e)}S.fn=S.prototype={jquery:f,constructor:S,length:0,toArray:function(){return s.call(this)},get:function(e){return null==e?s.call(this):e<0?this[e+this.length]:this[e]},pushStack:function(e){var t=S.merge(this.constructor(),e);return t.prevObject=this,t},each:function(e){return S.each(this,e)},map:function(n){return this.pushStack(S.map(this,function(e,t){return n.call(e,t,e)}))},slice:function(){return this.pushStack(s.apply(this,arguments))},first:function(){return this.eq(0)},last:function(){return this.eq(-1)},even:function(){return this.pushStack(S.grep(this,function(e,t){return(t+1)%2}))},odd:function(){return this.pushStack(S.grep(this,function(e,t){return t%2}))},eq:function(e){var t=this.length,n=+e+(e<0?t:0);return this.pushStack(0<=n&&n<t?[this[n]]:[])},end:function(){return this.prevObject||this.constructor()},push:u,sort:t.sort,splice:t.splice},S.extend=S.fn.extend=function(){var e,t,n,r,i,o,a=arguments[0]||{},s=1,u=arguments.length,l=!1;for("boolean"==typeof a&&(l=a,a=arguments[s]||{},s++),"object"==typeof a||m(a)||(a={}),s===u&&(a=this,s--);s<u;s++)if(null!=(e=arguments[s]))for(t in e)r=e[t],"__proto__"!==t&&a!==r&&(l&&r&&(S.isPlainObject(r)||(i=Array.isArray(r)))?(n=a[t],o=i&&!Array.isArray(n)?[]:i||S.isPlainObject(n)?n:{},i=!1,a[t]=S.extend(l,o,r)):void 0!==r&&(a[t]=r));return a},S.extend({expando:"jQuery"+(f+Math.random()).replace(/\D/g,""),isReady:!0,error:function(e){throw new Error(e)},noop:function(){},isPlainObject:function(e){var t,n;return!(!e||"[object Object]"!==o.call(e))&&(!(t=r(e))||"function"==typeof(n=v.call(t,"constructor")&&t.constructor)&&a.call(n)===l)},isEmptyObject:function(e){var t;for(t in e)return!1;return!0},globalEval:function(e,t,n){b(e,{nonce:t&&t.nonce},n)},each:function(e,t){var n,r=0;if(p(e)){for(n=e.length;r<n;r++)if(!1===t.call(e[r],r,e[r]))break}else for(r in e)if(!1===t.call(e[r],r,e[r]))break;return e},makeArray:function(e,t){var n=t||[];return null!=e&&(p(Object(e))?S.merge(n,"string"==typeof e?[e]:e):u.call(n,e)),n},inArray:function(e,t,n){return null==t?-1:i.call(t,e,n)},merge:function(e,t){for(var n=+t.length,r=0,i=e.length;r<n;r++)e[i++]=t[r];return e.length=i,e},grep:function(e,t,n){for(var r=[],i=0,o=e.length,a=!n;i<o;i++)!t(e[i],i)!==a&&r.push(e[i]);return r},map:function(e,t,n){var r,i,o=0,a=[];if(p(e))for(r=e.length;o<r;o++)null!=(i=t(e[o],o,n))&&a.push(i);else for(o in e)null!=(i=t(e[o],o,n))&&a.push(i);return g(a)},guid:1,support:y}),"function"==typeof Symbol&&(S.fn[Symbol.iterator]=t[Symbol.iterator]),S.each("Boolean Number String Function Array Date RegExp Object Error Symbol".split(" "),function(e,t){n["[object "+t+"]"]=t.toLowerCase()});var d=function(n){var e,d,b,o,i,h,f,g,w,u,l,T,C,a,E,v,s,c,y,S="sizzle"+1*new Date,p=n.document,k=0,r=0,m=ue(),x=ue(),A=ue(),N=ue(),j=function(e,t){return e===t&&(l=!0),0},D={}.hasOwnProperty,t=[],q=t.pop,L=t.push,H=t.push,O=t.slice,P=function(e,t){for(var n=0,r=e.length;n<r;n++)if(e[n]===t)return n;return-1},R="checked|selected|async|autofocus|autoplay|controls|defer|disabled|hidden|ismap|loop|multiple|open|readonly|required|scoped",M="[\\x20\\t\\r\\n\\f]",I="(?:\\\\[\\da-fA-F]{1,6}"+M+"?|\\\\[^\\r\\n\\f]|[\\w-]|[^\0-\\x7f])+",W="\\["+M+"*("+I+")(?:"+M+"*([*^$|!~]?=)"+M+"*(?:'((?:\\\\.|[^\\\\'])*)'|\"((?:\\\\.|[^\\\\\"])*)\"|("+I+"))|)"+M+"*\\]",F=":("+I+")(?:\\((('((?:\\\\.|[^\\\\'])*)'|\"((?:\\\\.|[^\\\\\"])*)\")|((?:\\\\.|[^\\\\()[\\]]|"+W+")*)|.*)\\)|)",B=new RegExp(M+"+","g"),$=new RegExp("^"+M+"+|((?:^|[^\\\\])(?:\\\\.)*)"+M+"+$","g"),_=new RegExp("^"+M+"*,"+M+"*"),z=new RegExp("^"+M+"*([>+~]|"+M+")"+M+"*"),U=new RegExp(M+"|>"),X=new RegExp(F),V=new RegExp("^"+I+"$"),G={ID:new RegExp("^#("+I+")"),CLASS:new RegExp("^\\.("+I+")"),TAG:new RegExp("^("+I+"|[*])"),ATTR:new RegExp("^"+W),PSEUDO:new RegExp("^"+F),CHILD:new RegExp("^:(only|first|last|nth|nth-last)-(child|of-type)(?:\\("+M+"*(even|odd|(([+-]|)(\\d*)n|)"+M+"*(?:([+-]|)"+M+"*(\\d+)|))"+M+"*\\)|)","i"),bool:new RegExp("^(?:"+R+")$","i"),needsContext:new RegExp("^"+M+"*[>+~]|:(even|odd|eq|gt|lt|nth|first|last)(?:\\("+M+"*((?:-\\d)?\\d*)"+M+"*\\)|)(?=[^-]|$)","i")},Y=/HTML$/i,Q=/^(?:input|select|textarea|button)$/i,J=/^h\d$/i,K=/^[^{]+\{\s*\[native \w/,Z=/^(?:#([\w-]+)|(\w+)|\.([\w-]+))$/,ee=/[+~]/,te=new RegExp("\\\\[\\da-fA-F]{1,6}"+M+"?|\\\\([^\\r\\n\\f])","g"),ne=function(e,t){var n="0x"+e.slice(1)-65536;return t||(n<0?String.fromCharCode(n+65536):String.fromCharCode(n>>10|55296,1023&n|56320))},re=/([\0-\x1f\x7f]|^-?\d)|^-$|[^\0-\x1f\x7f-\uFFFF\w-]/g,ie=function(e,t){return t?"\0"===e?"\ufffd":e.slice(0,-1)+"\\"+e.charCodeAt(e.length-1).toString(16)+" ":"\\"+e},oe=function(){T()},ae=be(function(e){return!0===e.disabled&&"fieldset"===e.nodeName.toLowerCase()},{dir:"parentNode",next:"legend"});try{H.apply(t=O.call(p.childNodes),p.childNodes),t[p.childNodes.length].nodeType}catch(e){H={apply:t.length?function(e,t){L.apply(e,O.call(t))}:function(e,t){var n=e.length,r=0;while(e[n++]=t[r++]);e.length=n-1}}}function se(t,e,n,r){var i,o,a,s,u,l,c,f=e&&e.ownerDocument,p=e?e.nodeType:9;if(n=n||[],"string"!=typeof t||!t||1!==p&&9!==p&&11!==p)return n;if(!r&&(T(e),e=e||C,E)){if(11!==p&&(u=Z.exec(t)))if(i=u[1]){if(9===p){if(!(a=e.getElementById(i)))return n;if(a.id===i)return n.push(a),n}else if(f&&(a=f.getElementById(i))&&y(e,a)&&a.id===i)return n.push(a),n}else{if(u[2])return H.apply(n,e.getElementsByTagName(t)),n;if((i=u[3])&&d.getElementsByClassName&&e.getElementsByClassName)return H.apply(n,e.getElementsByClassName(i)),n}if(d.qsa&&!N[t+" "]&&(!v||!v.test(t))&&(1!==p||"object"!==e.nodeName.toLowerCase())){if(c=t,f=e,1===p&&(U.test(t)||z.test(t))){(f=ee.test(t)&&ye(e.parentNode)||e)===e&&d.scope||((s=e.getAttribute("id"))?s=s.replace(re,ie):e.setAttribute("id",s=S)),o=(l=h(t)).length;while(o--)l[o]=(s?"#"+s:":scope")+" "+xe(l[o]);c=l.join(",")}try{return H.apply(n,f.querySelectorAll(c)),n}catch(e){N(t,!0)}finally{s===S&&e.removeAttribute("id")}}}return g(t.replace($,"$1"),e,n,r)}function ue(){var r=[];return function e(t,n){return r.push(t+" ")>b.cacheLength&&delete e[r.shift()],e[t+" "]=n}}function le(e){return e[S]=!0,e}function ce(e){var t=C.createElement("fieldset");try{return!!e(t)}catch(e){return!1}finally{t.parentNode&&t.parentNode.removeChild(t),t=null}}function fe(e,t){var n=e.split("|"),r=n.length;while(r--)b.attrHandle[n[r]]=t}function pe(e,t){var n=t&&e,r=n&&1===e.nodeType&&1===t.nodeType&&e.sourceIndex-t.sourceIndex;if(r)return r;if(n)while(n=n.nextSibling)if(n===t)return-1;return e?1:-1}function de(t){return function(e){return"input"===e.nodeName.toLowerCase()&&e.type===t}}function he(n){return function(e){var t=e.nodeName.toLowerCase();return("input"===t||"button"===t)&&e.type===n}}function ge(t){return function(e){return"form"in e?e.parentNode&&!1===e.disabled?"label"in e?"label"in e.parentNode?e.parentNode.disabled===t:e.disabled===t:e.isDisabled===t||e.isDisabled!==!t&&ae(e)===t:e.disabled===t:"label"in e&&e.disabled===t}}function ve(a){return le(function(o){return o=+o,le(function(e,t){var n,r=a([],e.length,o),i=r.length;while(i--)e[n=r[i]]&&(e[n]=!(t[n]=e[n]))})})}function ye(e){return e&&"undefined"!=typeof e.getElementsByTagName&&e}for(e in d=se.support={},i=se.isXML=function(e){var t=e&&e.namespaceURI,n=e&&(e.ownerDocument||e).documentElement;return!Y.test(t||n&&n.nodeName||"HTML")},T=se.setDocument=function(e){var t,n,r=e?e.ownerDocument||e:p;return r!=C&&9===r.nodeType&&r.documentElement&&(a=(C=r).documentElement,E=!i(C),p!=C&&(n=C.defaultView)&&n.top!==n&&(n.addEventListener?n.addEventListener("unload",oe,!1):n.attachEvent&&n.attachEvent("onunload",oe)),d.scope=ce(function(e){return a.appendChild(e).appendChild(C.createElement("div")),"undefined"!=typeof e.querySelectorAll&&!e.querySelectorAll(":scope fieldset div").length}),d.attributes=ce(function(e){return e.className="i",!e.getAttribute("className")}),d.getElementsByTagName=ce(function(e){return e.appendChild(C.createComment("")),!e.getElementsByTagName("*").length}),d.getElementsByClassName=K.test(C.getElementsByClassName),d.getById=ce(function(e){return a.appendChild(e).id=S,!C.getElementsByName||!C.getElementsByName(S).length}),d.getById?(b.filter.ID=function(e){var t=e.replace(te,ne);return function(e){return e.getAttribute("id")===t}},b.find.ID=function(e,t){if("undefined"!=typeof t.getElementById&&E){var n=t.getElementById(e);return n?[n]:[]}}):(b.filter.ID=function(e){var n=e.replace(te,ne);return function(e){var t="undefined"!=typeof e.getAttributeNode&&e.getAttributeNode("id");return t&&t.value===n}},b.find.ID=function(e,t){if("undefined"!=typeof t.getElementById&&E){var n,r,i,o=t.getElementById(e);if(o){if((n=o.getAttributeNode("id"))&&n.value===e)return[o];i=t.getElementsByName(e),r=0;while(o=i[r++])if((n=o.getAttributeNode("id"))&&n.value===e)return[o]}return[]}}),b.find.TAG=d.getElementsByTagName?function(e,t){return"undefined"!=typeof t.getElementsByTagName?t.getElementsByTagName(e):d.qsa?t.querySelectorAll(e):void 0}:function(e,t){var n,r=[],i=0,o=t.getElementsByTagName(e);if("*"===e){while(n=o[i++])1===n.nodeType&&r.push(n);return r}return o},b.find.CLASS=d.getElementsByClassName&&function(e,t){if("undefined"!=typeof t.getElementsByClassName&&E)return t.getElementsByClassName(e)},s=[],v=[],(d.qsa=K.test(C.querySelectorAll))&&(ce(function(e){var t;a.appendChild(e).innerHTML="<a id='"+S+"'></a><select id='"+S+"-\r\\' msallowcapture=''><option selected=''></option></select>",e.querySelectorAll("[msallowcapture^='']").length&&v.push("[*^$]="+M+"*(?:''|\"\")"),e.querySelectorAll("[selected]").length||v.push("\\["+M+"*(?:value|"+R+")"),e.querySelectorAll("[id~="+S+"-]").length||v.push("~="),(t=C.createElement("input")).setAttribute("name",""),e.appendChild(t),e.querySelectorAll("[name='']").length||v.push("\\["+M+"*name"+M+"*="+M+"*(?:''|\"\")"),e.querySelectorAll(":checked").length||v.push(":checked"),e.querySelectorAll("a#"+S+"+*").length||v.push(".#.+[+~]"),e.querySelectorAll("\\\f"),v.push("[\\r\\n\\f]")}),ce(function(e){e.innerHTML="<a href='' disabled='disabled'></a><select disabled='disabled'><option/></select>";var t=C.createElement("input");t.setAttribute("type","hidden"),e.appendChild(t).setAttribute("name","D"),e.querySelectorAll("[name=d]").length&&v.push("name"+M+"*[*^$|!~]?="),2!==e.querySelectorAll(":enabled").length&&v.push(":enabled",":disabled"),a.appendChild(e).disabled=!0,2!==e.querySelectorAll(":disabled").length&&v.push(":enabled",":disabled"),e.querySelectorAll("*,:x"),v.push(",.*:")})),(d.matchesSelector=K.test(c=a.matches||a.webkitMatchesSelector||a.mozMatchesSelector||a.oMatchesSelector||a.msMatchesSelector))&&ce(function(e){d.disconnectedMatch=c.call(e,"*"),c.call(e,"[s!='']:x"),s.push("!=",F)}),v=v.length&&new RegExp(v.join("|")),s=s.length&&new RegExp(s.join("|")),t=K.test(a.compareDocumentPosition),y=t||K.test(a.contains)?function(e,t){var n=9===e.nodeType?e.documentElement:e,r=t&&t.parentNode;return e===r||!(!r||1!==r.nodeType||!(n.contains?n.contains(r):e.compareDocumentPosition&&16&e.compareDocumentPosition(r)))}:function(e,t){if(t)while(t=t.parentNode)if(t===e)return!0;return!1},j=t?function(e,t){if(e===t)return l=!0,0;var n=!e.compareDocumentPosition-!t.compareDocumentPosition;return n||(1&(n=(e.ownerDocument||e)==(t.ownerDocument||t)?e.compareDocumentPosition(t):1)||!d.sortDetached&&t.compareDocumentPosition(e)===n?e==C||e.ownerDocument==p&&y(p,e)?-1:t==C||t.ownerDocument==p&&y(p,t)?1:u?P(u,e)-P(u,t):0:4&n?-1:1)}:function(e,t){if(e===t)return l=!0,0;var n,r=0,i=e.parentNode,o=t.parentNode,a=[e],s=[t];if(!i||!o)return e==C?-1:t==C?1:i?-1:o?1:u?P(u,e)-P(u,t):0;if(i===o)return pe(e,t);n=e;while(n=n.parentNode)a.unshift(n);n=t;while(n=n.parentNode)s.unshift(n);while(a[r]===s[r])r++;return r?pe(a[r],s[r]):a[r]==p?-1:s[r]==p?1:0}),C},se.matches=function(e,t){return se(e,null,null,t)},se.matchesSelector=function(e,t){if(T(e),d.matchesSelector&&E&&!N[t+" "]&&(!s||!s.test(t))&&(!v||!v.test(t)))try{var n=c.call(e,t);if(n||d.disconnectedMatch||e.document&&11!==e.document.nodeType)return n}catch(e){N(t,!0)}return 0<se(t,C,null,[e]).length},se.contains=function(e,t){return(e.ownerDocument||e)!=C&&T(e),y(e,t)},se.attr=function(e,t){(e.ownerDocument||e)!=C&&T(e);var n=b.attrHandle[t.toLowerCase()],r=n&&D.call(b.attrHandle,t.toLowerCase())?n(e,t,!E):void 0;return void 0!==r?r:d.attributes||!E?e.getAttribute(t):(r=e.getAttributeNode(t))&&r.specified?r.value:null},se.escape=function(e){return(e+"").replace(re,ie)},se.error=function(e){throw new Error("Syntax error, unrecognized expression: "+e)},se.uniqueSort=function(e){var t,n=[],r=0,i=0;if(l=!d.detectDuplicates,u=!d.sortStable&&e.slice(0),e.sort(j),l){while(t=e[i++])t===e[i]&&(r=n.push(i));while(r--)e.splice(n[r],1)}return u=null,e},o=se.getText=function(e){var t,n="",r=0,i=e.nodeType;if(i){if(1===i||9===i||11===i){if("string"==typeof e.textContent)return e.textContent;for(e=e.firstChild;e;e=e.nextSibling)n+=o(e)}else if(3===i||4===i)return e.nodeValue}else while(t=e[r++])n+=o(t);return n},(b=se.selectors={cacheLength:50,createPseudo:le,match:G,attrHandle:{},find:{},relative:{">":{dir:"parentNode",first:!0}," ":{dir:"parentNode"},"+":{dir:"previousSibling",first:!0},"~":{dir:"previousSibling"}},preFilter:{ATTR:function(e){return e[1]=e[1].replace(te,ne),e[3]=(e[3]||e[4]||e[5]||"").replace(te,ne),"~="===e[2]&&(e[3]=" "+e[3]+" "),e.slice(0,4)},CHILD:function(e){return e[1]=e[1].toLowerCase(),"nth"===e[1].slice(0,3)?(e[3]||se.error(e[0]),e[4]=+(e[4]?e[5]+(e[6]||1):2*("even"===e[3]||"odd"===e[3])),e[5]=+(e[7]+e[8]||"odd"===e[3])):e[3]&&se.error(e[0]),e},PSEUDO:function(e){var t,n=!e[6]&&e[2];return G.CHILD.test(e[0])?null:(e[3]?e[2]=e[4]||e[5]||"":n&&X.test(n)&&(t=h(n,!0))&&(t=n.indexOf(")",n.length-t)-n.length)&&(e[0]=e[0].slice(0,t),e[2]=n.slice(0,t)),e.slice(0,3))}},filter:{TAG:function(e){var t=e.replace(te,ne).toLowerCase();return"*"===e?function(){return!0}:function(e){return e.nodeName&&e.nodeName.toLowerCase()===t}},CLASS:function(e){var t=m[e+" "];return t||(t=new RegExp("(^|"+M+")"+e+"("+M+"|$)"))&&m(e,function(e){return t.test("string"==typeof e.className&&e.className||"undefined"!=typeof e.getAttribute&&e.getAttribute("class")||"")})},ATTR:function(n,r,i){return function(e){var t=se.attr(e,n);return null==t?"!="===r:!r||(t+="","="===r?t===i:"!="===r?t!==i:"^="===r?i&&0===t.indexOf(i):"*="===r?i&&-1<t.indexOf(i):"$="===r?i&&t.slice(-i.length)===i:"~="===r?-1<(" "+t.replace(B," ")+" ").indexOf(i):"|="===r&&(t===i||t.slice(0,i.length+1)===i+"-"))}},CHILD:function(h,e,t,g,v){var y="nth"!==h.slice(0,3),m="last"!==h.slice(-4),x="of-type"===e;return 1===g&&0===v?function(e){return!!e.parentNode}:function(e,t,n){var r,i,o,a,s,u,l=y!==m?"nextSibling":"previousSibling",c=e.parentNode,f=x&&e.nodeName.toLowerCase(),p=!n&&!x,d=!1;if(c){if(y){while(l){a=e;while(a=a[l])if(x?a.nodeName.toLowerCase()===f:1===a.nodeType)return!1;u=l="only"===h&&!u&&"nextSibling"}return!0}if(u=[m?c.firstChild:c.lastChild],m&&p){d=(s=(r=(i=(o=(a=c)[S]||(a[S]={}))[a.uniqueID]||(o[a.uniqueID]={}))[h]||[])[0]===k&&r[1])&&r[2],a=s&&c.childNodes[s];while(a=++s&&a&&a[l]||(d=s=0)||u.pop())if(1===a.nodeType&&++d&&a===e){i[h]=[k,s,d];break}}else if(p&&(d=s=(r=(i=(o=(a=e)[S]||(a[S]={}))[a.uniqueID]||(o[a.uniqueID]={}))[h]||[])[0]===k&&r[1]),!1===d)while(a=++s&&a&&a[l]||(d=s=0)||u.pop())if((x?a.nodeName.toLowerCase()===f:1===a.nodeType)&&++d&&(p&&((i=(o=a[S]||(a[S]={}))[a.uniqueID]||(o[a.uniqueID]={}))[h]=[k,d]),a===e))break;return(d-=v)===g||d%g==0&&0<=d/g}}},PSEUDO:function(e,o){var t,a=b.pseudos[e]||b.setFilters[e.toLowerCase()]||se.error("unsupported pseudo: "+e);return a[S]?a(o):1<a.length?(t=[e,e,"",o],b.setFilters.hasOwnProperty(e.toLowerCase())?le(function(e,t){var n,r=a(e,o),i=r.length;while(i--)e[n=P(e,r[i])]=!(t[n]=r[i])}):function(e){return a(e,0,t)}):a}},pseudos:{not:le(function(e){var r=[],i=[],s=f(e.replace($,"$1"));return s[S]?le(function(e,t,n,r){var i,o=s(e,null,r,[]),a=e.length;while(a--)(i=o[a])&&(e[a]=!(t[a]=i))}):function(e,t,n){return r[0]=e,s(r,null,n,i),r[0]=null,!i.pop()}}),has:le(function(t){return function(e){return 0<se(t,e).length}}),contains:le(function(t){return t=t.replace(te,ne),function(e){return-1<(e.textContent||o(e)).indexOf(t)}}),lang:le(function(n){return V.test(n||"")||se.error("unsupported lang: "+n),n=n.replace(te,ne).toLowerCase(),function(e){var t;do{if(t=E?e.lang:e.getAttribute("xml:lang")||e.getAttribute("lang"))return(t=t.toLowerCase())===n||0===t.indexOf(n+"-")}while((e=e.parentNode)&&1===e.nodeType);return!1}}),target:function(e){var t=n.location&&n.location.hash;return t&&t.slice(1)===e.id},root:function(e){return e===a},focus:function(e){return e===C.activeElement&&(!C.hasFocus||C.hasFocus())&&!!(e.type||e.href||~e.tabIndex)},enabled:ge(!1),disabled:ge(!0),checked:function(e){var t=e.nodeName.toLowerCase();return"input"===t&&!!e.checked||"option"===t&&!!e.selected},selected:function(e){return e.parentNode&&e.parentNode.selectedIndex,!0===e.selected},empty:function(e){for(e=e.firstChild;e;e=e.nextSibling)if(e.nodeType<6)return!1;return!0},parent:function(e){return!b.pseudos.empty(e)},header:function(e){return J.test(e.nodeName)},input:function(e){return Q.test(e.nodeName)},button:function(e){var t=e.nodeName.toLowerCase();return"input"===t&&"button"===e.type||"button"===t},text:function(e){var t;return"input"===e.nodeName.toLowerCase()&&"text"===e.type&&(null==(t=e.getAttribute("type"))||"text"===t.toLowerCase())},first:ve(function(){return[0]}),last:ve(function(e,t){return[t-1]}),eq:ve(function(e,t,n){return[n<0?n+t:n]}),even:ve(function(e,t){for(var n=0;n<t;n+=2)e.push(n);return e}),odd:ve(function(e,t){for(var n=1;n<t;n+=2)e.push(n);return e}),lt:ve(function(e,t,n){for(var r=n<0?n+t:t<n?t:n;0<=--r;)e.push(r);return e}),gt:ve(function(e,t,n){for(var r=n<0?n+t:n;++r<t;)e.push(r);return e})}}).pseudos.nth=b.pseudos.eq,{radio:!0,checkbox:!0,file:!0,password:!0,image:!0})b.pseudos[e]=de(e);for(e in{submit:!0,reset:!0})b.pseudos[e]=he(e);function me(){}function xe(e){for(var t=0,n=e.length,r="";t<n;t++)r+=e[t].value;return r}function be(s,e,t){var u=e.dir,l=e.next,c=l||u,f=t&&"parentNode"===c,p=r++;return e.first?function(e,t,n){while(e=e[u])if(1===e.nodeType||f)return s(e,t,n);return!1}:function(e,t,n){var r,i,o,a=[k,p];if(n){while(e=e[u])if((1===e.nodeType||f)&&s(e,t,n))return!0}else while(e=e[u])if(1===e.nodeType||f)if(i=(o=e[S]||(e[S]={}))[e.uniqueID]||(o[e.uniqueID]={}),l&&l===e.nodeName.toLowerCase())e=e[u]||e;else{if((r=i[c])&&r[0]===k&&r[1]===p)return a[2]=r[2];if((i[c]=a)[2]=s(e,t,n))return!0}return!1}}function we(i){return 1<i.length?function(e,t,n){var r=i.length;while(r--)if(!i[r](e,t,n))return!1;return!0}:i[0]}function Te(e,t,n,r,i){for(var o,a=[],s=0,u=e.length,l=null!=t;s<u;s++)(o=e[s])&&(n&&!n(o,r,i)||(a.push(o),l&&t.push(s)));return a}function Ce(d,h,g,v,y,e){return v&&!v[S]&&(v=Ce(v)),y&&!y[S]&&(y=Ce(y,e)),le(function(e,t,n,r){var i,o,a,s=[],u=[],l=t.length,c=e||function(e,t,n){for(var r=0,i=t.length;r<i;r++)se(e,t[r],n);return n}(h||"*",n.nodeType?[n]:n,[]),f=!d||!e&&h?c:Te(c,s,d,n,r),p=g?y||(e?d:l||v)?[]:t:f;if(g&&g(f,p,n,r),v){i=Te(p,u),v(i,[],n,r),o=i.length;while(o--)(a=i[o])&&(p[u[o]]=!(f[u[o]]=a))}if(e){if(y||d){if(y){i=[],o=p.length;while(o--)(a=p[o])&&i.push(f[o]=a);y(null,p=[],i,r)}o=p.length;while(o--)(a=p[o])&&-1<(i=y?P(e,a):s[o])&&(e[i]=!(t[i]=a))}}else p=Te(p===t?p.splice(l,p.length):p),y?y(null,t,p,r):H.apply(t,p)})}function Ee(e){for(var i,t,n,r=e.length,o=b.relative[e[0].type],a=o||b.relative[" "],s=o?1:0,u=be(function(e){return e===i},a,!0),l=be(function(e){return-1<P(i,e)},a,!0),c=[function(e,t,n){var r=!o&&(n||t!==w)||((i=t).nodeType?u(e,t,n):l(e,t,n));return i=null,r}];s<r;s++)if(t=b.relative[e[s].type])c=[be(we(c),t)];else{if((t=b.filter[e[s].type].apply(null,e[s].matches))[S]){for(n=++s;n<r;n++)if(b.relative[e[n].type])break;return Ce(1<s&&we(c),1<s&&xe(e.slice(0,s-1).concat({value:" "===e[s-2].type?"*":""})).replace($,"$1"),t,s<n&&Ee(e.slice(s,n)),n<r&&Ee(e=e.slice(n)),n<r&&xe(e))}c.push(t)}return we(c)}return me.prototype=b.filters=b.pseudos,b.setFilters=new me,h=se.tokenize=function(e,t){var n,r,i,o,a,s,u,l=x[e+" "];if(l)return t?0:l.slice(0);a=e,s=[],u=b.preFilter;while(a){for(o in n&&!(r=_.exec(a))||(r&&(a=a.slice(r[0].length)||a),s.push(i=[])),n=!1,(r=z.exec(a))&&(n=r.shift(),i.push({value:n,type:r[0].replace($," ")}),a=a.slice(n.length)),b.filter)!(r=G[o].exec(a))||u[o]&&!(r=u[o](r))||(n=r.shift(),i.push({value:n,type:o,matches:r}),a=a.slice(n.length));if(!n)break}return t?a.length:a?se.error(e):x(e,s).slice(0)},f=se.compile=function(e,t){var n,v,y,m,x,r,i=[],o=[],a=A[e+" "];if(!a){t||(t=h(e)),n=t.length;while(n--)(a=Ee(t[n]))[S]?i.push(a):o.push(a);(a=A(e,(v=o,m=0<(y=i).length,x=0<v.length,r=function(e,t,n,r,i){var o,a,s,u=0,l="0",c=e&&[],f=[],p=w,d=e||x&&b.find.TAG("*",i),h=k+=null==p?1:Math.random()||.1,g=d.length;for(i&&(w=t==C||t||i);l!==g&&null!=(o=d[l]);l++){if(x&&o){a=0,t||o.ownerDocument==C||(T(o),n=!E);while(s=v[a++])if(s(o,t||C,n)){r.push(o);break}i&&(k=h)}m&&((o=!s&&o)&&u--,e&&c.push(o))}if(u+=l,m&&l!==u){a=0;while(s=y[a++])s(c,f,t,n);if(e){if(0<u)while(l--)c[l]||f[l]||(f[l]=q.call(r));f=Te(f)}H.apply(r,f),i&&!e&&0<f.length&&1<u+y.length&&se.uniqueSort(r)}return i&&(k=h,w=p),c},m?le(r):r))).selector=e}return a},g=se.select=function(e,t,n,r){var i,o,a,s,u,l="function"==typeof e&&e,c=!r&&h(e=l.selector||e);if(n=n||[],1===c.length){if(2<(o=c[0]=c[0].slice(0)).length&&"ID"===(a=o[0]).type&&9===t.nodeType&&E&&b.relative[o[1].type]){if(!(t=(b.find.ID(a.matches[0].replace(te,ne),t)||[])[0]))return n;l&&(t=t.parentNode),e=e.slice(o.shift().value.length)}i=G.needsContext.test(e)?0:o.length;while(i--){if(a=o[i],b.relative[s=a.type])break;if((u=b.find[s])&&(r=u(a.matches[0].replace(te,ne),ee.test(o[0].type)&&ye(t.parentNode)||t))){if(o.splice(i,1),!(e=r.length&&xe(o)))return H.apply(n,r),n;break}}}return(l||f(e,c))(r,t,!E,n,!t||ee.test(e)&&ye(t.parentNode)||t),n},d.sortStable=S.split("").sort(j).join("")===S,d.detectDuplicates=!!l,T(),d.sortDetached=ce(function(e){return 1&e.compareDocumentPosition(C.createElement("fieldset"))}),ce(function(e){return e.innerHTML="<a href='#'></a>","#"===e.firstChild.getAttribute("href")})||fe("type|href|height|width",function(e,t,n){if(!n)return e.getAttribute(t,"type"===t.toLowerCase()?1:2)}),d.attributes&&ce(function(e){return e.innerHTML="<input/>",e.firstChild.setAttribute("value",""),""===e.firstChild.getAttribute("value")})||fe("value",function(e,t,n){if(!n&&"input"===e.nodeName.toLowerCase())return e.defaultValue}),ce(function(e){return null==e.getAttribute("disabled")})||fe(R,function(e,t,n){var r;if(!n)return!0===e[t]?t.toLowerCase():(r=e.getAttributeNode(t))&&r.specified?r.value:null}),se}(C);S.find=d,S.expr=d.selectors,S.expr[":"]=S.expr.pseudos,S.uniqueSort=S.unique=d.uniqueSort,S.text=d.getText,S.isXMLDoc=d.isXML,S.contains=d.contains,S.escapeSelector=d.escape;var h=function(e,t,n){var r=[],i=void 0!==n;while((e=e[t])&&9!==e.nodeType)if(1===e.nodeType){if(i&&S(e).is(n))break;r.push(e)}return r},T=function(e,t){for(var n=[];e;e=e.nextSibling)1===e.nodeType&&e!==t&&n.push(e);return n},k=S.expr.match.needsContext;function A(e,t){return e.nodeName&&e.nodeName.toLowerCase()===t.toLowerCase()}var N=/^<([a-z][^\/\0>:\x20\t\r\n\f]*)[\x20\t\r\n\f]*\/?>(?:<\/\1>|)$/i;function j(e,n,r){return m(n)?S.grep(e,function(e,t){return!!n.call(e,t,e)!==r}):n.nodeType?S.grep(e,function(e){return e===n!==r}):"string"!=typeof n?S.grep(e,function(e){return-1<i.call(n,e)!==r}):S.filter(n,e,r)}S.filter=function(e,t,n){var r=t[0];return n&&(e=":not("+e+")"),1===t.length&&1===r.nodeType?S.find.matchesSelector(r,e)?[r]:[]:S.find.matches(e,S.grep(t,function(e){return 1===e.nodeType}))},S.fn.extend({find:function(e){var t,n,r=this.length,i=this;if("string"!=typeof e)return this.pushStack(S(e).filter(function(){for(t=0;t<r;t++)if(S.contains(i[t],this))return!0}));for(n=this.pushStack([]),t=0;t<r;t++)S.find(e,i[t],n);return 1<r?S.uniqueSort(n):n},filter:function(e){return this.pushStack(j(this,e||[],!1))},not:function(e){return this.pushStack(j(this,e||[],!0))},is:function(e){return!!j(this,"string"==typeof e&&k.test(e)?S(e):e||[],!1).length}});var D,q=/^(?:\s*(<[\w\W]+>)[^>]*|#([\w-]+))$/;(S.fn.init=function(e,t,n){var r,i;if(!e)return this;if(n=n||D,"string"==typeof e){if(!(r="<"===e[0]&&">"===e[e.length-1]&&3<=e.length?[null,e,null]:q.exec(e))||!r[1]&&t)return!t||t.jquery?(t||n).find(e):this.constructor(t).find(e);if(r[1]){if(t=t instanceof S?t[0]:t,S.merge(this,S.parseHTML(r[1],t&&t.nodeType?t.ownerDocument||t:E,!0)),N.test(r[1])&&S.isPlainObject(t))for(r in t)m(this[r])?this[r](t[r]):this.attr(r,t[r]);return this}return(i=E.getElementById(r[2]))&&(this[0]=i,this.length=1),this}return e.nodeType?(this[0]=e,this.length=1,this):m(e)?void 0!==n.ready?n.ready(e):e(S):S.makeArray(e,this)}).prototype=S.fn,D=S(E);var L=/^(?:parents|prev(?:Until|All))/,H={children:!0,contents:!0,next:!0,prev:!0};function O(e,t){while((e=e[t])&&1!==e.nodeType);return e}S.fn.extend({has:function(e){var t=S(e,this),n=t.length;return this.filter(function(){for(var e=0;e<n;e++)if(S.contains(this,t[e]))return!0})},closest:function(e,t){var n,r=0,i=this.length,o=[],a="string"!=typeof e&&S(e);if(!k.test(e))for(;r<i;r++)for(n=this[r];n&&n!==t;n=n.parentNode)if(n.nodeType<11&&(a?-1<a.index(n):1===n.nodeType&&S.find.matchesSelector(n,e))){o.push(n);break}return this.pushStack(1<o.length?S.uniqueSort(o):o)},index:function(e){return e?"string"==typeof e?i.call(S(e),this[0]):i.call(this,e.jquery?e[0]:e):this[0]&&this[0].parentNode?this.first().prevAll().length:-1},add:function(e,t){return this.pushStack(S.uniqueSort(S.merge(this.get(),S(e,t))))},addBack:function(e){return this.add(null==e?this.prevObject:this.prevObject.filter(e))}}),S.each({parent:function(e){var t=e.parentNode;return t&&11!==t.nodeType?t:null},parents:function(e){return h(e,"parentNode")},parentsUntil:function(e,t,n){return h(e,"parentNode",n)},next:function(e){return O(e,"nextSibling")},prev:function(e){return O(e,"previousSibling")},nextAll:function(e){return h(e,"nextSibling")},prevAll:function(e){return h(e,"previousSibling")},nextUntil:function(e,t,n){return h(e,"nextSibling",n)},prevUntil:function(e,t,n){return h(e,"previousSibling",n)},siblings:function(e){return T((e.parentNode||{}).firstChild,e)},children:function(e){return T(e.firstChild)},contents:function(e){return null!=e.contentDocument&&r(e.contentDocument)?e.contentDocument:(A(e,"template")&&(e=e.content||e),S.merge([],e.childNodes))}},function(r,i){S.fn[r]=function(e,t){var n=S.map(this,i,e);return"Until"!==r.slice(-5)&&(t=e),t&&"string"==typeof t&&(n=S.filter(t,n)),1<this.length&&(H[r]||S.uniqueSort(n),L.test(r)&&n.reverse()),this.pushStack(n)}});var P=/[^\x20\t\r\n\f]+/g;function R(e){return e}function M(e){throw e}function I(e,t,n,r){var i;try{e&&m(i=e.promise)?i.call(e).done(t).fail(n):e&&m(i=e.then)?i.call(e,t,n):t.apply(void 0,[e].slice(r))}catch(e){n.apply(void 0,[e])}}S.Callbacks=function(r){var e,n;r="string"==typeof r?(e=r,n={},S.each(e.match(P)||[],function(e,t){n[t]=!0}),n):S.extend({},r);var i,t,o,a,s=[],u=[],l=-1,c=function(){for(a=a||r.once,o=i=!0;u.length;l=-1){t=u.shift();while(++l<s.length)!1===s[l].apply(t[0],t[1])&&r.stopOnFalse&&(l=s.length,t=!1)}r.memory||(t=!1),i=!1,a&&(s=t?[]:"")},f={add:function(){return s&&(t&&!i&&(l=s.length-1,u.push(t)),function n(e){S.each(e,function(e,t){m(t)?r.unique&&f.has(t)||s.push(t):t&&t.length&&"string"!==w(t)&&n(t)})}(arguments),t&&!i&&c()),this},remove:function(){return S.each(arguments,function(e,t){var n;while(-1<(n=S.inArray(t,s,n)))s.splice(n,1),n<=l&&l--}),this},has:function(e){return e?-1<S.inArray(e,s):0<s.length},empty:function(){return s&&(s=[]),this},disable:function(){return a=u=[],s=t="",this},disabled:function(){return!s},lock:function(){return a=u=[],t||i||(s=t=""),this},locked:function(){return!!a},fireWith:function(e,t){return a||(t=[e,(t=t||[]).slice?t.slice():t],u.push(t),i||c()),this},fire:function(){return f.fireWith(this,arguments),this},fired:function(){return!!o}};return f},S.extend({Deferred:function(e){var o=[["notify","progress",S.Callbacks("memory"),S.Callbacks("memory"),2],["resolve","done",S.Callbacks("once memory"),S.Callbacks("once memory"),0,"resolved"],["reject","fail",S.Callbacks("once memory"),S.Callbacks("once memory"),1,"rejected"]],i="pending",a={state:function(){return i},always:function(){return s.done(arguments).fail(arguments),this},"catch":function(e){return a.then(null,e)},pipe:function(){var i=arguments;return S.Deferred(function(r){S.each(o,function(e,t){var n=m(i[t[4]])&&i[t[4]];s[t[1]](function(){var e=n&&n.apply(this,arguments);e&&m(e.promise)?e.promise().progress(r.notify).done(r.resolve).fail(r.reject):r[t[0]+"With"](this,n?[e]:arguments)})}),i=null}).promise()},then:function(t,n,r){var u=0;function l(i,o,a,s){return function(){var n=this,r=arguments,e=function(){var e,t;if(!(i<u)){if((e=a.apply(n,r))===o.promise())throw new TypeError("Thenable self-resolution");t=e&&("object"==typeof e||"function"==typeof e)&&e.then,m(t)?s?t.call(e,l(u,o,R,s),l(u,o,M,s)):(u++,t.call(e,l(u,o,R,s),l(u,o,M,s),l(u,o,R,o.notifyWith))):(a!==R&&(n=void 0,r=[e]),(s||o.resolveWith)(n,r))}},t=s?e:function(){try{e()}catch(e){S.Deferred.exceptionHook&&S.Deferred.exceptionHook(e,t.stackTrace),u<=i+1&&(a!==M&&(n=void 0,r=[e]),o.rejectWith(n,r))}};i?t():(S.Deferred.getStackHook&&(t.stackTrace=S.Deferred.getStackHook()),C.setTimeout(t))}}return S.Deferred(function(e){o[0][3].add(l(0,e,m(r)?r:R,e.notifyWith)),o[1][3].add(l(0,e,m(t)?t:R)),o[2][3].add(l(0,e,m(n)?n:M))}).promise()},promise:function(e){return null!=e?S.extend(e,a):a}},s={};return S.each(o,function(e,t){var n=t[2],r=t[5];a[t[1]]=n.add,r&&n.add(function(){i=r},o[3-e][2].disable,o[3-e][3].disable,o[0][2].lock,o[0][3].lock),n.add(t[3].fire),s[t[0]]=function(){return s[t[0]+"With"](this===s?void 0:this,arguments),this},s[t[0]+"With"]=n.fireWith}),a.promise(s),e&&e.call(s,s),s},when:function(e){var n=arguments.length,t=n,r=Array(t),i=s.call(arguments),o=S.Deferred(),a=function(t){return function(e){r[t]=this,i[t]=1<arguments.length?s.call(arguments):e,--n||o.resolveWith(r,i)}};if(n<=1&&(I(e,o.done(a(t)).resolve,o.reject,!n),"pending"===o.state()||m(i[t]&&i[t].then)))return o.then();while(t--)I(i[t],a(t),o.reject);return o.promise()}});var W=/^(Eval|Internal|Range|Reference|Syntax|Type|URI)Error$/;S.Deferred.exceptionHook=function(e,t){C.console&&C.console.warn&&e&&W.test(e.name)&&C.console.warn("jQuery.Deferred exception: "+e.message,e.stack,t)},S.readyException=function(e){C.setTimeout(function(){throw e})};var F=S.Deferred();function B(){E.removeEventListener("DOMContentLoaded",B),C.removeEventListener("load",B),S.ready()}S.fn.ready=function(e){return F.then(e)["catch"](function(e){S.readyException(e)}),this},S.extend({isReady:!1,readyWait:1,ready:function(e){(!0===e?--S.readyWait:S.isReady)||(S.isReady=!0)!==e&&0<--S.readyWait||F.resolveWith(E,[S])}}),S.ready.then=F.then,"complete"===E.readyState||"loading"!==E.readyState&&!E.documentElement.doScroll?C.setTimeout(S.ready):(E.addEventListener("DOMContentLoaded",B),C.addEventListener("load",B));var $=function(e,t,n,r,i,o,a){var s=0,u=e.length,l=null==n;if("object"===w(n))for(s in i=!0,n)$(e,t,s,n[s],!0,o,a);else if(void 0!==r&&(i=!0,m(r)||(a=!0),l&&(a?(t.call(e,r),t=null):(l=t,t=function(e,t,n){return l.call(S(e),n)})),t))for(;s<u;s++)t(e[s],n,a?r:r.call(e[s],s,t(e[s],n)));return i?e:l?t.call(e):u?t(e[0],n):o},_=/^-ms-/,z=/-([a-z])/g;function U(e,t){return t.toUpperCase()}function X(e){return e.replace(_,"ms-").replace(z,U)}var V=function(e){return 1===e.nodeType||9===e.nodeType||!+e.nodeType};function G(){this.expando=S.expando+G.uid++}G.uid=1,G.prototype={cache:function(e){var t=e[this.expando];return t||(t={},V(e)&&(e.nodeType?e[this.expando]=t:Object.defineProperty(e,this.expando,{value:t,configurable:!0}))),t},set:function(e,t,n){var r,i=this.cache(e);if("string"==typeof t)i[X(t)]=n;else for(r in t)i[X(r)]=t[r];return i},get:function(e,t){return void 0===t?this.cache(e):e[this.expando]&&e[this.expando][X(t)]},access:function(e,t,n){return void 0===t||t&&"string"==typeof t&&void 0===n?this.get(e,t):(this.set(e,t,n),void 0!==n?n:t)},remove:function(e,t){var n,r=e[this.expando];if(void 0!==r){if(void 0!==t){n=(t=Array.isArray(t)?t.map(X):(t=X(t))in r?[t]:t.match(P)||[]).length;while(n--)delete r[t[n]]}(void 0===t||S.isEmptyObject(r))&&(e.nodeType?e[this.expando]=void 0:delete e[this.expando])}},hasData:function(e){var t=e[this.expando];return void 0!==t&&!S.isEmptyObject(t)}};var Y=new G,Q=new G,J=/^(?:\{[\w\W]*\}|\[[\w\W]*\])$/,K=/[A-Z]/g;function Z(e,t,n){var r,i;if(void 0===n&&1===e.nodeType)if(r="data-"+t.replace(K,"-$&").toLowerCase(),"string"==typeof(n=e.getAttribute(r))){try{n="true"===(i=n)||"false"!==i&&("null"===i?null:i===+i+""?+i:J.test(i)?JSON.parse(i):i)}catch(e){}Q.set(e,t,n)}else n=void 0;return n}S.extend({hasData:function(e){return Q.hasData(e)||Y.hasData(e)},data:function(e,t,n){return Q.access(e,t,n)},removeData:function(e,t){Q.remove(e,t)},_data:function(e,t,n){return Y.access(e,t,n)},_removeData:function(e,t){Y.remove(e,t)}}),S.fn.extend({data:function(n,e){var t,r,i,o=this[0],a=o&&o.attributes;if(void 0===n){if(this.length&&(i=Q.get(o),1===o.nodeType&&!Y.get(o,"hasDataAttrs"))){t=a.length;while(t--)a[t]&&0===(r=a[t].name).indexOf("data-")&&(r=X(r.slice(5)),Z(o,r,i[r]));Y.set(o,"hasDataAttrs",!0)}return i}return"object"==typeof n?this.each(function(){Q.set(this,n)}):$(this,function(e){var t;if(o&&void 0===e)return void 0!==(t=Q.get(o,n))?t:void 0!==(t=Z(o,n))?t:void 0;this.each(function(){Q.set(this,n,e)})},null,e,1<arguments.length,null,!0)},removeData:function(e){return this.each(function(){Q.remove(this,e)})}}),S.extend({queue:function(e,t,n){var r;if(e)return t=(t||"fx")+"queue",r=Y.get(e,t),n&&(!r||Array.isArray(n)?r=Y.access(e,t,S.makeArray(n)):r.push(n)),r||[]},dequeue:function(e,t){t=t||"fx";var n=S.queue(e,t),r=n.length,i=n.shift(),o=S._queueHooks(e,t);"inprogress"===i&&(i=n.shift(),r--),i&&("fx"===t&&n.unshift("inprogress"),delete o.stop,i.call(e,function(){S.dequeue(e,t)},o)),!r&&o&&o.empty.fire()},_queueHooks:function(e,t){var n=t+"queueHooks";return Y.get(e,n)||Y.access(e,n,{empty:S.Callbacks("once memory").add(function(){Y.remove(e,[t+"queue",n])})})}}),S.fn.extend({queue:function(t,n){var e=2;return"string"!=typeof t&&(n=t,t="fx",e--),arguments.length<e?S.queue(this[0],t):void 0===n?this:this.each(function(){var e=S.queue(this,t,n);S._queueHooks(this,t),"fx"===t&&"inprogress"!==e[0]&&S.dequeue(this,t)})},dequeue:function(e){return this.each(function(){S.dequeue(this,e)})},clearQueue:function(e){return this.queue(e||"fx",[])},promise:function(e,t){var n,r=1,i=S.Deferred(),o=this,a=this.length,s=function(){--r||i.resolveWith(o,[o])};"string"!=typeof e&&(t=e,e=void 0),e=e||"fx";while(a--)(n=Y.get(o[a],e+"queueHooks"))&&n.empty&&(r++,n.empty.add(s));return s(),i.promise(t)}});var ee=/[+-]?(?:\d*\.|)\d+(?:[eE][+-]?\d+|)/.source,te=new RegExp("^(?:([+-])=|)("+ee+")([a-z%]*)$","i"),ne=["Top","Right","Bottom","Left"],re=E.documentElement,ie=function(e){return S.contains(e.ownerDocument,e)},oe={composed:!0};re.getRootNode&&(ie=function(e){return S.contains(e.ownerDocument,e)||e.getRootNode(oe)===e.ownerDocument});var ae=function(e,t){return"none"===(e=t||e).style.display||""===e.style.display&&ie(e)&&"none"===S.css(e,"display")};function se(e,t,n,r){var i,o,a=20,s=r?function(){return r.cur()}:function(){return S.css(e,t,"")},u=s(),l=n&&n[3]||(S.cssNumber[t]?"":"px"),c=e.nodeType&&(S.cssNumber[t]||"px"!==l&&+u)&&te.exec(S.css(e,t));if(c&&c[3]!==l){u/=2,l=l||c[3],c=+u||1;while(a--)S.style(e,t,c+l),(1-o)*(1-(o=s()/u||.5))<=0&&(a=0),c/=o;c*=2,S.style(e,t,c+l),n=n||[]}return n&&(c=+c||+u||0,i=n[1]?c+(n[1]+1)*n[2]:+n[2],r&&(r.unit=l,r.start=c,r.end=i)),i}var ue={};function le(e,t){for(var n,r,i,o,a,s,u,l=[],c=0,f=e.length;c<f;c++)(r=e[c]).style&&(n=r.style.display,t?("none"===n&&(l[c]=Y.get(r,"display")||null,l[c]||(r.style.display="")),""===r.style.display&&ae(r)&&(l[c]=(u=a=o=void 0,a=(i=r).ownerDocument,s=i.nodeName,(u=ue[s])||(o=a.body.appendChild(a.createElement(s)),u=S.css(o,"display"),o.parentNode.removeChild(o),"none"===u&&(u="block"),ue[s]=u)))):"none"!==n&&(l[c]="none",Y.set(r,"display",n)));for(c=0;c<f;c++)null!=l[c]&&(e[c].style.display=l[c]);return e}S.fn.extend({show:function(){return le(this,!0)},hide:function(){return le(this)},toggle:function(e){return"boolean"==typeof e?e?this.show():this.hide():this.each(function(){ae(this)?S(this).show():S(this).hide()})}});var ce,fe,pe=/^(?:checkbox|radio)$/i,de=/<([a-z][^\/\0>\x20\t\r\n\f]*)/i,he=/^$|^module$|\/(?:java|ecma)script/i;ce=E.createDocumentFragment().appendChild(E.createElement("div")),(fe=E.createElement("input")).setAttribute("type","radio"),fe.setAttribute("checked","checked"),fe.setAttribute("name","t"),ce.appendChild(fe),y.checkClone=ce.cloneNode(!0).cloneNode(!0).lastChild.checked,ce.innerHTML="<textarea>x</textarea>",y.noCloneChecked=!!ce.cloneNode(!0).lastChild.defaultValue,ce.innerHTML="<option></option>",y.option=!!ce.lastChild;var ge={thead:[1,"<table>","</table>"],col:[2,"<table><colgroup>","</colgroup></table>"],tr:[2,"<table><tbody>","</tbody></table>"],td:[3,"<table><tbody><tr>","</tr></tbody></table>"],_default:[0,"",""]};function ve(e,t){var n;return n="undefined"!=typeof e.getElementsByTagName?e.getElementsByTagName(t||"*"):"undefined"!=typeof e.querySelectorAll?e.querySelectorAll(t||"*"):[],void 0===t||t&&A(e,t)?S.merge([e],n):n}function ye(e,t){for(var n=0,r=e.length;n<r;n++)Y.set(e[n],"globalEval",!t||Y.get(t[n],"globalEval"))}ge.tbody=ge.tfoot=ge.colgroup=ge.caption=ge.thead,ge.th=ge.td,y.option||(ge.optgroup=ge.option=[1,"<select multiple='multiple'>","</select>"]);var me=/<|&#?\w+;/;function xe(e,t,n,r,i){for(var o,a,s,u,l,c,f=t.createDocumentFragment(),p=[],d=0,h=e.length;d<h;d++)if((o=e[d])||0===o)if("object"===w(o))S.merge(p,o.nodeType?[o]:o);else if(me.test(o)){a=a||f.appendChild(t.createElement("div")),s=(de.exec(o)||["",""])[1].toLowerCase(),u=ge[s]||ge._default,a.innerHTML=u[1]+S.htmlPrefilter(o)+u[2],c=u[0];while(c--)a=a.lastChild;S.merge(p,a.childNodes),(a=f.firstChild).textContent=""}else p.push(t.createTextNode(o));f.textContent="",d=0;while(o=p[d++])if(r&&-1<S.inArray(o,r))i&&i.push(o);else if(l=ie(o),a=ve(f.appendChild(o),"script"),l&&ye(a),n){c=0;while(o=a[c++])he.test(o.type||"")&&n.push(o)}return f}var be=/^([^.]*)(?:\.(.+)|)/;function we(){return!0}function Te(){return!1}function Ce(e,t){return e===function(){try{return E.activeElement}catch(e){}}()==("focus"===t)}function Ee(e,t,n,r,i,o){var a,s;if("object"==typeof t){for(s in"string"!=typeof n&&(r=r||n,n=void 0),t)Ee(e,s,n,r,t[s],o);return e}if(null==r&&null==i?(i=n,r=n=void 0):null==i&&("string"==typeof n?(i=r,r=void 0):(i=r,r=n,n=void 0)),!1===i)i=Te;else if(!i)return e;return 1===o&&(a=i,(i=function(e){return S().off(e),a.apply(this,arguments)}).guid=a.guid||(a.guid=S.guid++)),e.each(function(){S.event.add(this,t,i,r,n)})}function Se(e,i,o){o?(Y.set(e,i,!1),S.event.add(e,i,{namespace:!1,handler:function(e){var t,n,r=Y.get(this,i);if(1&e.isTrigger&&this[i]){if(r.length)(S.event.special[i]||{}).delegateType&&e.stopPropagation();else if(r=s.call(arguments),Y.set(this,i,r),t=o(this,i),this[i](),r!==(n=Y.get(this,i))||t?Y.set(this,i,!1):n={},r!==n)return e.stopImmediatePropagation(),e.preventDefault(),n&&n.value}else r.length&&(Y.set(this,i,{value:S.event.trigger(S.extend(r[0],S.Event.prototype),r.slice(1),this)}),e.stopImmediatePropagation())}})):void 0===Y.get(e,i)&&S.event.add(e,i,we)}S.event={global:{},add:function(t,e,n,r,i){var o,a,s,u,l,c,f,p,d,h,g,v=Y.get(t);if(V(t)){n.handler&&(n=(o=n).handler,i=o.selector),i&&S.find.matchesSelector(re,i),n.guid||(n.guid=S.guid++),(u=v.events)||(u=v.events=Object.create(null)),(a=v.handle)||(a=v.handle=function(e){return"undefined"!=typeof S&&S.event.triggered!==e.type?S.event.dispatch.apply(t,arguments):void 0}),l=(e=(e||"").match(P)||[""]).length;while(l--)d=g=(s=be.exec(e[l])||[])[1],h=(s[2]||"").split(".").sort(),d&&(f=S.event.special[d]||{},d=(i?f.delegateType:f.bindType)||d,f=S.event.special[d]||{},c=S.extend({type:d,origType:g,data:r,handler:n,guid:n.guid,selector:i,needsContext:i&&S.expr.match.needsContext.test(i),namespace:h.join(".")},o),(p=u[d])||((p=u[d]=[]).delegateCount=0,f.setup&&!1!==f.setup.call(t,r,h,a)||t.addEventListener&&t.addEventListener(d,a)),f.add&&(f.add.call(t,c),c.handler.guid||(c.handler.guid=n.guid)),i?p.splice(p.delegateCount++,0,c):p.push(c),S.event.global[d]=!0)}},remove:function(e,t,n,r,i){var o,a,s,u,l,c,f,p,d,h,g,v=Y.hasData(e)&&Y.get(e);if(v&&(u=v.events)){l=(t=(t||"").match(P)||[""]).length;while(l--)if(d=g=(s=be.exec(t[l])||[])[1],h=(s[2]||"").split(".").sort(),d){f=S.event.special[d]||{},p=u[d=(r?f.delegateType:f.bindType)||d]||[],s=s[2]&&new RegExp("(^|\\.)"+h.join("\\.(?:.*\\.|)")+"(\\.|$)"),a=o=p.length;while(o--)c=p[o],!i&&g!==c.origType||n&&n.guid!==c.guid||s&&!s.test(c.namespace)||r&&r!==c.selector&&("**"!==r||!c.selector)||(p.splice(o,1),c.selector&&p.delegateCount--,f.remove&&f.remove.call(e,c));a&&!p.length&&(f.teardown&&!1!==f.teardown.call(e,h,v.handle)||S.removeEvent(e,d,v.handle),delete u[d])}else for(d in u)S.event.remove(e,d+t[l],n,r,!0);S.isEmptyObject(u)&&Y.remove(e,"handle events")}},dispatch:function(e){var t,n,r,i,o,a,s=new Array(arguments.length),u=S.event.fix(e),l=(Y.get(this,"events")||Object.create(null))[u.type]||[],c=S.event.special[u.type]||{};for(s[0]=u,t=1;t<arguments.length;t++)s[t]=arguments[t];if(u.delegateTarget=this,!c.preDispatch||!1!==c.preDispatch.call(this,u)){a=S.event.handlers.call(this,u,l),t=0;while((i=a[t++])&&!u.isPropagationStopped()){u.currentTarget=i.elem,n=0;while((o=i.handlers[n++])&&!u.isImmediatePropagationStopped())u.rnamespace&&!1!==o.namespace&&!u.rnamespace.test(o.namespace)||(u.handleObj=o,u.data=o.data,void 0!==(r=((S.event.special[o.origType]||{}).handle||o.handler).apply(i.elem,s))&&!1===(u.result=r)&&(u.preventDefault(),u.stopPropagation()))}return c.postDispatch&&c.postDispatch.call(this,u),u.result}},handlers:function(e,t){var n,r,i,o,a,s=[],u=t.delegateCount,l=e.target;if(u&&l.nodeType&&!("click"===e.type&&1<=e.button))for(;l!==this;l=l.parentNode||this)if(1===l.nodeType&&("click"!==e.type||!0!==l.disabled)){for(o=[],a={},n=0;n<u;n++)void 0===a[i=(r=t[n]).selector+" "]&&(a[i]=r.needsContext?-1<S(i,this).index(l):S.find(i,this,null,[l]).length),a[i]&&o.push(r);o.length&&s.push({elem:l,handlers:o})}return l=this,u<t.length&&s.push({elem:l,handlers:t.slice(u)}),s},addProp:function(t,e){Object.defineProperty(S.Event.prototype,t,{enumerable:!0,configurable:!0,get:m(e)?function(){if(this.originalEvent)return e(this.originalEvent)}:function(){if(this.originalEvent)return this.originalEvent[t]},set:function(e){Object.defineProperty(this,t,{enumerable:!0,configurable:!0,writable:!0,value:e})}})},fix:function(e){return e[S.expando]?e:new S.Event(e)},special:{load:{noBubble:!0},click:{setup:function(e){var t=this||e;return pe.test(t.type)&&t.click&&A(t,"input")&&Se(t,"click",we),!1},trigger:function(e){var t=this||e;return pe.test(t.type)&&t.click&&A(t,"input")&&Se(t,"click"),!0},_default:function(e){var t=e.target;return pe.test(t.type)&&t.click&&A(t,"input")&&Y.get(t,"click")||A(t,"a")}},beforeunload:{postDispatch:function(e){void 0!==e.result&&e.originalEvent&&(e.originalEvent.returnValue=e.result)}}}},S.removeEvent=function(e,t,n){e.removeEventListener&&e.removeEventListener(t,n)},S.Event=function(e,t){if(!(this instanceof S.Event))return new S.Event(e,t);e&&e.type?(this.originalEvent=e,this.type=e.type,this.isDefaultPrevented=e.defaultPrevented||void 0===e.defaultPrevented&&!1===e.returnValue?we:Te,this.target=e.target&&3===e.target.nodeType?e.target.parentNode:e.target,this.currentTarget=e.currentTarget,this.relatedTarget=e.relatedTarget):this.type=e,t&&S.extend(this,t),this.timeStamp=e&&e.timeStamp||Date.now(),this[S.expando]=!0},S.Event.prototype={constructor:S.Event,isDefaultPrevented:Te,isPropagationStopped:Te,isImmediatePropagationStopped:Te,isSimulated:!1,preventDefault:function(){var e=this.originalEvent;this.isDefaultPrevented=we,e&&!this.isSimulated&&e.preventDefault()},stopPropagation:function(){var e=this.originalEvent;this.isPropagationStopped=we,e&&!this.isSimulated&&e.stopPropagation()},stopImmediatePropagation:function(){var e=this.originalEvent;this.isImmediatePropagationStopped=we,e&&!this.isSimulated&&e.stopImmediatePropagation(),this.stopPropagation()}},S.each({altKey:!0,bubbles:!0,cancelable:!0,changedTouches:!0,ctrlKey:!0,detail:!0,eventPhase:!0,metaKey:!0,pageX:!0,pageY:!0,shiftKey:!0,view:!0,"char":!0,code:!0,charCode:!0,key:!0,keyCode:!0,button:!0,buttons:!0,clientX:!0,clientY:!0,offsetX:!0,offsetY:!0,pointerId:!0,pointerType:!0,screenX:!0,screenY:!0,targetTouches:!0,toElement:!0,touches:!0,which:!0},S.event.addProp),S.each({focus:"focusin",blur:"focusout"},function(e,t){S.event.special[e]={setup:function(){return Se(this,e,Ce),!1},trigger:function(){return Se(this,e),!0},_default:function(){return!0},delegateType:t}}),S.each({mouseenter:"mouseover",mouseleave:"mouseout",pointerenter:"pointerover",pointerleave:"pointerout"},function(e,i){S.event.special[e]={delegateType:i,bindType:i,handle:function(e){var t,n=e.relatedTarget,r=e.handleObj;return n&&(n===this||S.contains(this,n))||(e.type=r.origType,t=r.handler.apply(this,arguments),e.type=i),t}}}),S.fn.extend({on:function(e,t,n,r){return Ee(this,e,t,n,r)},one:function(e,t,n,r){return Ee(this,e,t,n,r,1)},off:function(e,t,n){var r,i;if(e&&e.preventDefault&&e.handleObj)return r=e.handleObj,S(e.delegateTarget).off(r.namespace?r.origType+"."+r.namespace:r.origType,r.selector,r.handler),this;if("object"==typeof e){for(i in e)this.off(i,t,e[i]);return this}return!1!==t&&"function"!=typeof t||(n=t,t=void 0),!1===n&&(n=Te),this.each(function(){S.event.remove(this,e,n,t)})}});var ke=/<script|<style|<link/i,Ae=/checked\s*(?:[^=]|=\s*.checked.)/i,Ne=/^\s*<!(?:\[CDATA\[|--)|(?:\]\]|--)>\s*$/g;function je(e,t){return A(e,"table")&&A(11!==t.nodeType?t:t.firstChild,"tr")&&S(e).children("tbody")[0]||e}function De(e){return e.type=(null!==e.getAttribute("type"))+"/"+e.type,e}function qe(e){return"true/"===(e.type||"").slice(0,5)?e.type=e.type.slice(5):e.removeAttribute("type"),e}function Le(e,t){var n,r,i,o,a,s;if(1===t.nodeType){if(Y.hasData(e)&&(s=Y.get(e).events))for(i in Y.remove(t,"handle events"),s)for(n=0,r=s[i].length;n<r;n++)S.event.add(t,i,s[i][n]);Q.hasData(e)&&(o=Q.access(e),a=S.extend({},o),Q.set(t,a))}}function He(n,r,i,o){r=g(r);var e,t,a,s,u,l,c=0,f=n.length,p=f-1,d=r[0],h=m(d);if(h||1<f&&"string"==typeof d&&!y.checkClone&&Ae.test(d))return n.each(function(e){var t=n.eq(e);h&&(r[0]=d.call(this,e,t.html())),He(t,r,i,o)});if(f&&(t=(e=xe(r,n[0].ownerDocument,!1,n,o)).firstChild,1===e.childNodes.length&&(e=t),t||o)){for(s=(a=S.map(ve(e,"script"),De)).length;c<f;c++)u=e,c!==p&&(u=S.clone(u,!0,!0),s&&S.merge(a,ve(u,"script"))),i.call(n[c],u,c);if(s)for(l=a[a.length-1].ownerDocument,S.map(a,qe),c=0;c<s;c++)u=a[c],he.test(u.type||"")&&!Y.access(u,"globalEval")&&S.contains(l,u)&&(u.src&&"module"!==(u.type||"").toLowerCase()?S._evalUrl&&!u.noModule&&S._evalUrl(u.src,{nonce:u.nonce||u.getAttribute("nonce")},l):b(u.textContent.replace(Ne,""),u,l))}return n}function Oe(e,t,n){for(var r,i=t?S.filter(t,e):e,o=0;null!=(r=i[o]);o++)n||1!==r.nodeType||S.cleanData(ve(r)),r.parentNode&&(n&&ie(r)&&ye(ve(r,"script")),r.parentNode.removeChild(r));return e}S.extend({htmlPrefilter:function(e){return e},clone:function(e,t,n){var r,i,o,a,s,u,l,c=e.cloneNode(!0),f=ie(e);if(!(y.noCloneChecked||1!==e.nodeType&&11!==e.nodeType||S.isXMLDoc(e)))for(a=ve(c),r=0,i=(o=ve(e)).length;r<i;r++)s=o[r],u=a[r],void 0,"input"===(l=u.nodeName.toLowerCase())&&pe.test(s.type)?u.checked=s.checked:"input"!==l&&"textarea"!==l||(u.defaultValue=s.defaultValue);if(t)if(n)for(o=o||ve(e),a=a||ve(c),r=0,i=o.length;r<i;r++)Le(o[r],a[r]);else Le(e,c);return 0<(a=ve(c,"script")).length&&ye(a,!f&&ve(e,"script")),c},cleanData:function(e){for(var t,n,r,i=S.event.special,o=0;void 0!==(n=e[o]);o++)if(V(n)){if(t=n[Y.expando]){if(t.events)for(r in t.events)i[r]?S.event.remove(n,r):S.removeEvent(n,r,t.handle);n[Y.expando]=void 0}n[Q.expando]&&(n[Q.expando]=void 0)}}}),S.fn.extend({detach:function(e){return Oe(this,e,!0)},remove:function(e){return Oe(this,e)},text:function(e){return $(this,function(e){return void 0===e?S.text(this):this.empty().each(function(){1!==this.nodeType&&11!==this.nodeType&&9!==this.nodeType||(this.textContent=e)})},null,e,arguments.length)},append:function(){return He(this,arguments,function(e){1!==this.nodeType&&11!==this.nodeType&&9!==this.nodeType||je(this,e).appendChild(e)})},prepend:function(){return He(this,arguments,function(e){if(1===this.nodeType||11===this.nodeType||9===this.nodeType){var t=je(this,e);t.insertBefore(e,t.firstChild)}})},before:function(){return He(this,arguments,function(e){this.parentNode&&this.parentNode.insertBefore(e,this)})},after:function(){return He(this,arguments,function(e){this.parentNode&&this.parentNode.insertBefore(e,this.nextSibling)})},empty:function(){for(var e,t=0;null!=(e=this[t]);t++)1===e.nodeType&&(S.cleanData(ve(e,!1)),e.textContent="");return this},clone:function(e,t){return e=null!=e&&e,t=null==t?e:t,this.map(function(){return S.clone(this,e,t)})},html:function(e){return $(this,function(e){var t=this[0]||{},n=0,r=this.length;if(void 0===e&&1===t.nodeType)return t.innerHTML;if("string"==typeof e&&!ke.test(e)&&!ge[(de.exec(e)||["",""])[1].toLowerCase()]){e=S.htmlPrefilter(e);try{for(;n<r;n++)1===(t=this[n]||{}).nodeType&&(S.cleanData(ve(t,!1)),t.innerHTML=e);t=0}catch(e){}}t&&this.empty().append(e)},null,e,arguments.length)},replaceWith:function(){var n=[];return He(this,arguments,function(e){var t=this.parentNode;S.inArray(this,n)<0&&(S.cleanData(ve(this)),t&&t.replaceChild(e,this))},n)}}),S.each({appendTo:"append",prependTo:"prepend",insertBefore:"before",insertAfter:"after",replaceAll:"replaceWith"},function(e,a){S.fn[e]=function(e){for(var t,n=[],r=S(e),i=r.length-1,o=0;o<=i;o++)t=o===i?this:this.clone(!0),S(r[o])[a](t),u.apply(n,t.get());return this.pushStack(n)}});var Pe=new RegExp("^("+ee+")(?!px)[a-z%]+$","i"),Re=function(e){var t=e.ownerDocument.defaultView;return t&&t.opener||(t=C),t.getComputedStyle(e)},Me=function(e,t,n){var r,i,o={};for(i in t)o[i]=e.style[i],e.style[i]=t[i];for(i in r=n.call(e),t)e.style[i]=o[i];return r},Ie=new RegExp(ne.join("|"),"i");function We(e,t,n){var r,i,o,a,s=e.style;return(n=n||Re(e))&&(""!==(a=n.getPropertyValue(t)||n[t])||ie(e)||(a=S.style(e,t)),!y.pixelBoxStyles()&&Pe.test(a)&&Ie.test(t)&&(r=s.width,i=s.minWidth,o=s.maxWidth,s.minWidth=s.maxWidth=s.width=a,a=n.width,s.width=r,s.minWidth=i,s.maxWidth=o)),void 0!==a?a+"":a}function Fe(e,t){return{get:function(){if(!e())return(this.get=t).apply(this,arguments);delete this.get}}}!function(){function e(){if(l){u.style.cssText="position:absolute;left:-11111px;width:60px;margin-top:1px;padding:0;border:0",l.style.cssText="position:relative;display:block;box-sizing:border-box;overflow:scroll;margin:auto;border:1px;padding:1px;width:60%;top:1%",re.appendChild(u).appendChild(l);var e=C.getComputedStyle(l);n="1%"!==e.top,s=12===t(e.marginLeft),l.style.right="60%",o=36===t(e.right),r=36===t(e.width),l.style.position="absolute",i=12===t(l.offsetWidth/3),re.removeChild(u),l=null}}function t(e){return Math.round(parseFloat(e))}var n,r,i,o,a,s,u=E.createElement("div"),l=E.createElement("div");l.style&&(l.style.backgroundClip="content-box",l.cloneNode(!0).style.backgroundClip="",y.clearCloneStyle="content-box"===l.style.backgroundClip,S.extend(y,{boxSizingReliable:function(){return e(),r},pixelBoxStyles:function(){return e(),o},pixelPosition:function(){return e(),n},reliableMarginLeft:function(){return e(),s},scrollboxSize:function(){return e(),i},reliableTrDimensions:function(){var e,t,n,r;return null==a&&(e=E.createElement("table"),t=E.createElement("tr"),n=E.createElement("div"),e.style.cssText="position:absolute;left:-11111px;border-collapse:separate",t.style.cssText="border:1px solid",t.style.height="1px",n.style.height="9px",n.style.display="block",re.appendChild(e).appendChild(t).appendChild(n),r=C.getComputedStyle(t),a=parseInt(r.height,10)+parseInt(r.borderTopWidth,10)+parseInt(r.borderBottomWidth,10)===t.offsetHeight,re.removeChild(e)),a}}))}();var Be=["Webkit","Moz","ms"],$e=E.createElement("div").style,_e={};function ze(e){var t=S.cssProps[e]||_e[e];return t||(e in $e?e:_e[e]=function(e){var t=e[0].toUpperCase()+e.slice(1),n=Be.length;while(n--)if((e=Be[n]+t)in $e)return e}(e)||e)}var Ue=/^(none|table(?!-c[ea]).+)/,Xe=/^--/,Ve={position:"absolute",visibility:"hidden",display:"block"},Ge={letterSpacing:"0",fontWeight:"400"};function Ye(e,t,n){var r=te.exec(t);return r?Math.max(0,r[2]-(n||0))+(r[3]||"px"):t}function Qe(e,t,n,r,i,o){var a="width"===t?1:0,s=0,u=0;if(n===(r?"border":"content"))return 0;for(;a<4;a+=2)"margin"===n&&(u+=S.css(e,n+ne[a],!0,i)),r?("content"===n&&(u-=S.css(e,"padding"+ne[a],!0,i)),"margin"!==n&&(u-=S.css(e,"border"+ne[a]+"Width",!0,i))):(u+=S.css(e,"padding"+ne[a],!0,i),"padding"!==n?u+=S.css(e,"border"+ne[a]+"Width",!0,i):s+=S.css(e,"border"+ne[a]+"Width",!0,i));return!r&&0<=o&&(u+=Math.max(0,Math.ceil(e["offset"+t[0].toUpperCase()+t.slice(1)]-o-u-s-.5))||0),u}function Je(e,t,n){var r=Re(e),i=(!y.boxSizingReliable()||n)&&"border-box"===S.css(e,"boxSizing",!1,r),o=i,a=We(e,t,r),s="offset"+t[0].toUpperCase()+t.slice(1);if(Pe.test(a)){if(!n)return a;a="auto"}return(!y.boxSizingReliable()&&i||!y.reliableTrDimensions()&&A(e,"tr")||"auto"===a||!parseFloat(a)&&"inline"===S.css(e,"display",!1,r))&&e.getClientRects().length&&(i="border-box"===S.css(e,"boxSizing",!1,r),(o=s in e)&&(a=e[s])),(a=parseFloat(a)||0)+Qe(e,t,n||(i?"border":"content"),o,r,a)+"px"}function Ke(e,t,n,r,i){return new Ke.prototype.init(e,t,n,r,i)}S.extend({cssHooks:{opacity:{get:function(e,t){if(t){var n=We(e,"opacity");return""===n?"1":n}}}},cssNumber:{animationIterationCount:!0,columnCount:!0,fillOpacity:!0,flexGrow:!0,flexShrink:!0,fontWeight:!0,gridArea:!0,gridColumn:!0,gridColumnEnd:!0,gridColumnStart:!0,gridRow:!0,gridRowEnd:!0,gridRowStart:!0,lineHeight:!0,opacity:!0,order:!0,orphans:!0,widows:!0,zIndex:!0,zoom:!0},cssProps:{},style:function(e,t,n,r){if(e&&3!==e.nodeType&&8!==e.nodeType&&e.style){var i,o,a,s=X(t),u=Xe.test(t),l=e.style;if(u||(t=ze(s)),a=S.cssHooks[t]||S.cssHooks[s],void 0===n)return a&&"get"in a&&void 0!==(i=a.get(e,!1,r))?i:l[t];"string"===(o=typeof n)&&(i=te.exec(n))&&i[1]&&(n=se(e,t,i),o="number"),null!=n&&n==n&&("number"!==o||u||(n+=i&&i[3]||(S.cssNumber[s]?"":"px")),y.clearCloneStyle||""!==n||0!==t.indexOf("background")||(l[t]="inherit"),a&&"set"in a&&void 0===(n=a.set(e,n,r))||(u?l.setProperty(t,n):l[t]=n))}},css:function(e,t,n,r){var i,o,a,s=X(t);return Xe.test(t)||(t=ze(s)),(a=S.cssHooks[t]||S.cssHooks[s])&&"get"in a&&(i=a.get(e,!0,n)),void 0===i&&(i=We(e,t,r)),"normal"===i&&t in Ge&&(i=Ge[t]),""===n||n?(o=parseFloat(i),!0===n||isFinite(o)?o||0:i):i}}),S.each(["height","width"],function(e,u){S.cssHooks[u]={get:function(e,t,n){if(t)return!Ue.test(S.css(e,"display"))||e.getClientRects().length&&e.getBoundingClientRect().width?Je(e,u,n):Me(e,Ve,function(){return Je(e,u,n)})},set:function(e,t,n){var r,i=Re(e),o=!y.scrollboxSize()&&"absolute"===i.position,a=(o||n)&&"border-box"===S.css(e,"boxSizing",!1,i),s=n?Qe(e,u,n,a,i):0;return a&&o&&(s-=Math.ceil(e["offset"+u[0].toUpperCase()+u.slice(1)]-parseFloat(i[u])-Qe(e,u,"border",!1,i)-.5)),s&&(r=te.exec(t))&&"px"!==(r[3]||"px")&&(e.style[u]=t,t=S.css(e,u)),Ye(0,t,s)}}}),S.cssHooks.marginLeft=Fe(y.reliableMarginLeft,function(e,t){if(t)return(parseFloat(We(e,"marginLeft"))||e.getBoundingClientRect().left-Me(e,{marginLeft:0},function(){return e.getBoundingClientRect().left}))+"px"}),S.each({margin:"",padding:"",border:"Width"},function(i,o){S.cssHooks[i+o]={expand:function(e){for(var t=0,n={},r="string"==typeof e?e.split(" "):[e];t<4;t++)n[i+ne[t]+o]=r[t]||r[t-2]||r[0];return n}},"margin"!==i&&(S.cssHooks[i+o].set=Ye)}),S.fn.extend({css:function(e,t){return $(this,function(e,t,n){var r,i,o={},a=0;if(Array.isArray(t)){for(r=Re(e),i=t.length;a<i;a++)o[t[a]]=S.css(e,t[a],!1,r);return o}return void 0!==n?S.style(e,t,n):S.css(e,t)},e,t,1<arguments.length)}}),((S.Tween=Ke).prototype={constructor:Ke,init:function(e,t,n,r,i,o){this.elem=e,this.prop=n,this.easing=i||S.easing._default,this.options=t,this.start=this.now=this.cur(),this.end=r,this.unit=o||(S.cssNumber[n]?"":"px")},cur:function(){var e=Ke.propHooks[this.prop];return e&&e.get?e.get(this):Ke.propHooks._default.get(this)},run:function(e){var t,n=Ke.propHooks[this.prop];return this.options.duration?this.pos=t=S.easing[this.easing](e,this.options.duration*e,0,1,this.options.duration):this.pos=t=e,this.now=(this.end-this.start)*t+this.start,this.options.step&&this.options.step.call(this.elem,this.now,this),n&&n.set?n.set(this):Ke.propHooks._default.set(this),this}}).init.prototype=Ke.prototype,(Ke.propHooks={_default:{get:function(e){var t;return 1!==e.elem.nodeType||null!=e.elem[e.prop]&&null==e.elem.style[e.prop]?e.elem[e.prop]:(t=S.css(e.elem,e.prop,""))&&"auto"!==t?t:0},set:function(e){S.fx.step[e.prop]?S.fx.step[e.prop](e):1!==e.elem.nodeType||!S.cssHooks[e.prop]&&null==e.elem.style[ze(e.prop)]?e.elem[e.prop]=e.now:S.style(e.elem,e.prop,e.now+e.unit)}}}).scrollTop=Ke.propHooks.scrollLeft={set:function(e){e.elem.nodeType&&e.elem.parentNode&&(e.elem[e.prop]=e.now)}},S.easing={linear:function(e){return e},swing:function(e){return.5-Math.cos(e*Math.PI)/2},_default:"swing"},S.fx=Ke.prototype.init,S.fx.step={};var Ze,et,tt,nt,rt=/^(?:toggle|show|hide)$/,it=/queueHooks$/;function ot(){et&&(!1===E.hidden&&C.requestAnimationFrame?C.requestAnimationFrame(ot):C.setTimeout(ot,S.fx.interval),S.fx.tick())}function at(){return C.setTimeout(function(){Ze=void 0}),Ze=Date.now()}function st(e,t){var n,r=0,i={height:e};for(t=t?1:0;r<4;r+=2-t)i["margin"+(n=ne[r])]=i["padding"+n]=e;return t&&(i.opacity=i.width=e),i}function ut(e,t,n){for(var r,i=(lt.tweeners[t]||[]).concat(lt.tweeners["*"]),o=0,a=i.length;o<a;o++)if(r=i[o].call(n,t,e))return r}function lt(o,e,t){var n,a,r=0,i=lt.prefilters.length,s=S.Deferred().always(function(){delete u.elem}),u=function(){if(a)return!1;for(var e=Ze||at(),t=Math.max(0,l.startTime+l.duration-e),n=1-(t/l.duration||0),r=0,i=l.tweens.length;r<i;r++)l.tweens[r].run(n);return s.notifyWith(o,[l,n,t]),n<1&&i?t:(i||s.notifyWith(o,[l,1,0]),s.resolveWith(o,[l]),!1)},l=s.promise({elem:o,props:S.extend({},e),opts:S.extend(!0,{specialEasing:{},easing:S.easing._default},t),originalProperties:e,originalOptions:t,startTime:Ze||at(),duration:t.duration,tweens:[],createTween:function(e,t){var n=S.Tween(o,l.opts,e,t,l.opts.specialEasing[e]||l.opts.easing);return l.tweens.push(n),n},stop:function(e){var t=0,n=e?l.tweens.length:0;if(a)return this;for(a=!0;t<n;t++)l.tweens[t].run(1);return e?(s.notifyWith(o,[l,1,0]),s.resolveWith(o,[l,e])):s.rejectWith(o,[l,e]),this}}),c=l.props;for(!function(e,t){var n,r,i,o,a;for(n in e)if(i=t[r=X(n)],o=e[n],Array.isArray(o)&&(i=o[1],o=e[n]=o[0]),n!==r&&(e[r]=o,delete e[n]),(a=S.cssHooks[r])&&"expand"in a)for(n in o=a.expand(o),delete e[r],o)n in e||(e[n]=o[n],t[n]=i);else t[r]=i}(c,l.opts.specialEasing);r<i;r++)if(n=lt.prefilters[r].call(l,o,c,l.opts))return m(n.stop)&&(S._queueHooks(l.elem,l.opts.queue).stop=n.stop.bind(n)),n;return S.map(c,ut,l),m(l.opts.start)&&l.opts.start.call(o,l),l.progress(l.opts.progress).done(l.opts.done,l.opts.complete).fail(l.opts.fail).always(l.opts.always),S.fx.timer(S.extend(u,{elem:o,anim:l,queue:l.opts.queue})),l}S.Animation=S.extend(lt,{tweeners:{"*":[function(e,t){var n=this.createTween(e,t);return se(n.elem,e,te.exec(t),n),n}]},tweener:function(e,t){m(e)?(t=e,e=["*"]):e=e.match(P);for(var n,r=0,i=e.length;r<i;r++)n=e[r],lt.tweeners[n]=lt.tweeners[n]||[],lt.tweeners[n].unshift(t)},prefilters:[function(e,t,n){var r,i,o,a,s,u,l,c,f="width"in t||"height"in t,p=this,d={},h=e.style,g=e.nodeType&&ae(e),v=Y.get(e,"fxshow");for(r in n.queue||(null==(a=S._queueHooks(e,"fx")).unqueued&&(a.unqueued=0,s=a.empty.fire,a.empty.fire=function(){a.unqueued||s()}),a.unqueued++,p.always(function(){p.always(function(){a.unqueued--,S.queue(e,"fx").length||a.empty.fire()})})),t)if(i=t[r],rt.test(i)){if(delete t[r],o=o||"toggle"===i,i===(g?"hide":"show")){if("show"!==i||!v||void 0===v[r])continue;g=!0}d[r]=v&&v[r]||S.style(e,r)}if((u=!S.isEmptyObject(t))||!S.isEmptyObject(d))for(r in f&&1===e.nodeType&&(n.overflow=[h.overflow,h.overflowX,h.overflowY],null==(l=v&&v.display)&&(l=Y.get(e,"display")),"none"===(c=S.css(e,"display"))&&(l?c=l:(le([e],!0),l=e.style.display||l,c=S.css(e,"display"),le([e]))),("inline"===c||"inline-block"===c&&null!=l)&&"none"===S.css(e,"float")&&(u||(p.done(function(){h.display=l}),null==l&&(c=h.display,l="none"===c?"":c)),h.display="inline-block")),n.overflow&&(h.overflow="hidden",p.always(function(){h.overflow=n.overflow[0],h.overflowX=n.overflow[1],h.overflowY=n.overflow[2]})),u=!1,d)u||(v?"hidden"in v&&(g=v.hidden):v=Y.access(e,"fxshow",{display:l}),o&&(v.hidden=!g),g&&le([e],!0),p.done(function(){for(r in g||le([e]),Y.remove(e,"fxshow"),d)S.style(e,r,d[r])})),u=ut(g?v[r]:0,r,p),r in v||(v[r]=u.start,g&&(u.end=u.start,u.start=0))}],prefilter:function(e,t){t?lt.prefilters.unshift(e):lt.prefilters.push(e)}}),S.speed=function(e,t,n){var r=e&&"object"==typeof e?S.extend({},e):{complete:n||!n&&t||m(e)&&e,duration:e,easing:n&&t||t&&!m(t)&&t};return S.fx.off?r.duration=0:"number"!=typeof r.duration&&(r.duration in S.fx.speeds?r.duration=S.fx.speeds[r.duration]:r.duration=S.fx.speeds._default),null!=r.queue&&!0!==r.queue||(r.queue="fx"),r.old=r.complete,r.complete=function(){m(r.old)&&r.old.call(this),r.queue&&S.dequeue(this,r.queue)},r},S.fn.extend({fadeTo:function(e,t,n,r){return this.filter(ae).css("opacity",0).show().end().animate({opacity:t},e,n,r)},animate:function(t,e,n,r){var i=S.isEmptyObject(t),o=S.speed(e,n,r),a=function(){var e=lt(this,S.extend({},t),o);(i||Y.get(this,"finish"))&&e.stop(!0)};return a.finish=a,i||!1===o.queue?this.each(a):this.queue(o.queue,a)},stop:function(i,e,o){var a=function(e){var t=e.stop;delete e.stop,t(o)};return"string"!=typeof i&&(o=e,e=i,i=void 0),e&&this.queue(i||"fx",[]),this.each(function(){var e=!0,t=null!=i&&i+"queueHooks",n=S.timers,r=Y.get(this);if(t)r[t]&&r[t].stop&&a(r[t]);else for(t in r)r[t]&&r[t].stop&&it.test(t)&&a(r[t]);for(t=n.length;t--;)n[t].elem!==this||null!=i&&n[t].queue!==i||(n[t].anim.stop(o),e=!1,n.splice(t,1));!e&&o||S.dequeue(this,i)})},finish:function(a){return!1!==a&&(a=a||"fx"),this.each(function(){var e,t=Y.get(this),n=t[a+"queue"],r=t[a+"queueHooks"],i=S.timers,o=n?n.length:0;for(t.finish=!0,S.queue(this,a,[]),r&&r.stop&&r.stop.call(this,!0),e=i.length;e--;)i[e].elem===this&&i[e].queue===a&&(i[e].anim.stop(!0),i.splice(e,1));for(e=0;e<o;e++)n[e]&&n[e].finish&&n[e].finish.call(this);delete t.finish})}}),S.each(["toggle","show","hide"],function(e,r){var i=S.fn[r];S.fn[r]=function(e,t,n){return null==e||"boolean"==typeof e?i.apply(this,arguments):this.animate(st(r,!0),e,t,n)}}),S.each({slideDown:st("show"),slideUp:st("hide"),slideToggle:st("toggle"),fadeIn:{opacity:"show"},fadeOut:{opacity:"hide"},fadeToggle:{opacity:"toggle"}},function(e,r){S.fn[e]=function(e,t,n){return this.animate(r,e,t,n)}}),S.timers=[],S.fx.tick=function(){var e,t=0,n=S.timers;for(Ze=Date.now();t<n.length;t++)(e=n[t])()||n[t]!==e||n.splice(t--,1);n.length||S.fx.stop(),Ze=void 0},S.fx.timer=function(e){S.timers.push(e),S.fx.start()},S.fx.interval=13,S.fx.start=function(){et||(et=!0,ot())},S.fx.stop=function(){et=null},S.fx.speeds={slow:600,fast:200,_default:400},S.fn.delay=function(r,e){return r=S.fx&&S.fx.speeds[r]||r,e=e||"fx",this.queue(e,function(e,t){var n=C.setTimeout(e,r);t.stop=function(){C.clearTimeout(n)}})},tt=E.createElement("input"),nt=E.createElement("select").appendChild(E.createElement("option")),tt.type="checkbox",y.checkOn=""!==tt.value,y.optSelected=nt.selected,(tt=E.createElement("input")).value="t",tt.type="radio",y.radioValue="t"===tt.value;var ct,ft=S.expr.attrHandle;S.fn.extend({attr:function(e,t){return $(this,S.attr,e,t,1<arguments.length)},removeAttr:function(e){return this.each(function(){S.removeAttr(this,e)})}}),S.extend({attr:function(e,t,n){var r,i,o=e.nodeType;if(3!==o&&8!==o&&2!==o)return"undefined"==typeof e.getAttribute?S.prop(e,t,n):(1===o&&S.isXMLDoc(e)||(i=S.attrHooks[t.toLowerCase()]||(S.expr.match.bool.test(t)?ct:void 0)),void 0!==n?null===n?void S.removeAttr(e,t):i&&"set"in i&&void 0!==(r=i.set(e,n,t))?r:(e.setAttribute(t,n+""),n):i&&"get"in i&&null!==(r=i.get(e,t))?r:null==(r=S.find.attr(e,t))?void 0:r)},attrHooks:{type:{set:function(e,t){if(!y.radioValue&&"radio"===t&&A(e,"input")){var n=e.value;return e.setAttribute("type",t),n&&(e.value=n),t}}}},removeAttr:function(e,t){var n,r=0,i=t&&t.match(P);if(i&&1===e.nodeType)while(n=i[r++])e.removeAttribute(n)}}),ct={set:function(e,t,n){return!1===t?S.removeAttr(e,n):e.setAttribute(n,n),n}},S.each(S.expr.match.bool.source.match(/\w+/g),function(e,t){var a=ft[t]||S.find.attr;ft[t]=function(e,t,n){var r,i,o=t.toLowerCase();return n||(i=ft[o],ft[o]=r,r=null!=a(e,t,n)?o:null,ft[o]=i),r}});var pt=/^(?:input|select|textarea|button)$/i,dt=/^(?:a|area)$/i;function ht(e){return(e.match(P)||[]).join(" ")}function gt(e){return e.getAttribute&&e.getAttribute("class")||""}function vt(e){return Array.isArray(e)?e:"string"==typeof e&&e.match(P)||[]}S.fn.extend({prop:function(e,t){return $(this,S.prop,e,t,1<arguments.length)},removeProp:function(e){return this.each(function(){delete this[S.propFix[e]||e]})}}),S.extend({prop:function(e,t,n){var r,i,o=e.nodeType;if(3!==o&&8!==o&&2!==o)return 1===o&&S.isXMLDoc(e)||(t=S.propFix[t]||t,i=S.propHooks[t]),void 0!==n?i&&"set"in i&&void 0!==(r=i.set(e,n,t))?r:e[t]=n:i&&"get"in i&&null!==(r=i.get(e,t))?r:e[t]},propHooks:{tabIndex:{get:function(e){var t=S.find.attr(e,"tabindex");return t?parseInt(t,10):pt.test(e.nodeName)||dt.test(e.nodeName)&&e.href?0:-1}}},propFix:{"for":"htmlFor","class":"className"}}),y.optSelected||(S.propHooks.selected={get:function(e){var t=e.parentNode;return t&&t.parentNode&&t.parentNode.selectedIndex,null},set:function(e){var t=e.parentNode;t&&(t.selectedIndex,t.parentNode&&t.parentNode.selectedIndex)}}),S.each(["tabIndex","readOnly","maxLength","cellSpacing","cellPadding","rowSpan","colSpan","useMap","frameBorder","contentEditable"],function(){S.propFix[this.toLowerCase()]=this}),S.fn.extend({addClass:function(t){var e,n,r,i,o,a,s,u=0;if(m(t))return this.each(function(e){S(this).addClass(t.call(this,e,gt(this)))});if((e=vt(t)).length)while(n=this[u++])if(i=gt(n),r=1===n.nodeType&&" "+ht(i)+" "){a=0;while(o=e[a++])r.indexOf(" "+o+" ")<0&&(r+=o+" ");i!==(s=ht(r))&&n.setAttribute("class",s)}return this},removeClass:function(t){var e,n,r,i,o,a,s,u=0;if(m(t))return this.each(function(e){S(this).removeClass(t.call(this,e,gt(this)))});if(!arguments.length)return this.attr("class","");if((e=vt(t)).length)while(n=this[u++])if(i=gt(n),r=1===n.nodeType&&" "+ht(i)+" "){a=0;while(o=e[a++])while(-1<r.indexOf(" "+o+" "))r=r.replace(" "+o+" "," ");i!==(s=ht(r))&&n.setAttribute("class",s)}return this},toggleClass:function(i,t){var o=typeof i,a="string"===o||Array.isArray(i);return"boolean"==typeof t&&a?t?this.addClass(i):this.removeClass(i):m(i)?this.each(function(e){S(this).toggleClass(i.call(this,e,gt(this),t),t)}):this.each(function(){var e,t,n,r;if(a){t=0,n=S(this),r=vt(i);while(e=r[t++])n.hasClass(e)?n.removeClass(e):n.addClass(e)}else void 0!==i&&"boolean"!==o||((e=gt(this))&&Y.set(this,"__className__",e),this.setAttribute&&this.setAttribute("class",e||!1===i?"":Y.get(this,"__className__")||""))})},hasClass:function(e){var t,n,r=0;t=" "+e+" ";while(n=this[r++])if(1===n.nodeType&&-1<(" "+ht(gt(n))+" ").indexOf(t))return!0;return!1}});var yt=/\r/g;S.fn.extend({val:function(n){var r,e,i,t=this[0];return arguments.length?(i=m(n),this.each(function(e){var t;1===this.nodeType&&(null==(t=i?n.call(this,e,S(this).val()):n)?t="":"number"==typeof t?t+="":Array.isArray(t)&&(t=S.map(t,function(e){return null==e?"":e+""})),(r=S.valHooks[this.type]||S.valHooks[this.nodeName.toLowerCase()])&&"set"in r&&void 0!==r.set(this,t,"value")||(this.value=t))})):t?(r=S.valHooks[t.type]||S.valHooks[t.nodeName.toLowerCase()])&&"get"in r&&void 0!==(e=r.get(t,"value"))?e:"string"==typeof(e=t.value)?e.replace(yt,""):null==e?"":e:void 0}}),S.extend({valHooks:{option:{get:function(e){var t=S.find.attr(e,"value");return null!=t?t:ht(S.text(e))}},select:{get:function(e){var t,n,r,i=e.options,o=e.selectedIndex,a="select-one"===e.type,s=a?null:[],u=a?o+1:i.length;for(r=o<0?u:a?o:0;r<u;r++)if(((n=i[r]).selected||r===o)&&!n.disabled&&(!n.parentNode.disabled||!A(n.parentNode,"optgroup"))){if(t=S(n).val(),a)return t;s.push(t)}return s},set:function(e,t){var n,r,i=e.options,o=S.makeArray(t),a=i.length;while(a--)((r=i[a]).selected=-1<S.inArray(S.valHooks.option.get(r),o))&&(n=!0);return n||(e.selectedIndex=-1),o}}}}),S.each(["radio","checkbox"],function(){S.valHooks[this]={set:function(e,t){if(Array.isArray(t))return e.checked=-1<S.inArray(S(e).val(),t)}},y.checkOn||(S.valHooks[this].get=function(e){return null===e.getAttribute("value")?"on":e.value})}),y.focusin="onfocusin"in C;var mt=/^(?:focusinfocus|focusoutblur)$/,xt=function(e){e.stopPropagation()};S.extend(S.event,{trigger:function(e,t,n,r){var i,o,a,s,u,l,c,f,p=[n||E],d=v.call(e,"type")?e.type:e,h=v.call(e,"namespace")?e.namespace.split("."):[];if(o=f=a=n=n||E,3!==n.nodeType&&8!==n.nodeType&&!mt.test(d+S.event.triggered)&&(-1<d.indexOf(".")&&(d=(h=d.split(".")).shift(),h.sort()),u=d.indexOf(":")<0&&"on"+d,(e=e[S.expando]?e:new S.Event(d,"object"==typeof e&&e)).isTrigger=r?2:3,e.namespace=h.join("."),e.rnamespace=e.namespace?new RegExp("(^|\\.)"+h.join("\\.(?:.*\\.|)")+"(\\.|$)"):null,e.result=void 0,e.target||(e.target=n),t=null==t?[e]:S.makeArray(t,[e]),c=S.event.special[d]||{},r||!c.trigger||!1!==c.trigger.apply(n,t))){if(!r&&!c.noBubble&&!x(n)){for(s=c.delegateType||d,mt.test(s+d)||(o=o.parentNode);o;o=o.parentNode)p.push(o),a=o;a===(n.ownerDocument||E)&&p.push(a.defaultView||a.parentWindow||C)}i=0;while((o=p[i++])&&!e.isPropagationStopped())f=o,e.type=1<i?s:c.bindType||d,(l=(Y.get(o,"events")||Object.create(null))[e.type]&&Y.get(o,"handle"))&&l.apply(o,t),(l=u&&o[u])&&l.apply&&V(o)&&(e.result=l.apply(o,t),!1===e.result&&e.preventDefault());return e.type=d,r||e.isDefaultPrevented()||c._default&&!1!==c._default.apply(p.pop(),t)||!V(n)||u&&m(n[d])&&!x(n)&&((a=n[u])&&(n[u]=null),S.event.triggered=d,e.isPropagationStopped()&&f.addEventListener(d,xt),n[d](),e.isPropagationStopped()&&f.removeEventListener(d,xt),S.event.triggered=void 0,a&&(n[u]=a)),e.result}},simulate:function(e,t,n){var r=S.extend(new S.Event,n,{type:e,isSimulated:!0});S.event.trigger(r,null,t)}}),S.fn.extend({trigger:function(e,t){return this.each(function(){S.event.trigger(e,t,this)})},triggerHandler:function(e,t){var n=this[0];if(n)return S.event.trigger(e,t,n,!0)}}),y.focusin||S.each({focus:"focusin",blur:"focusout"},function(n,r){var i=function(e){S.event.simulate(r,e.target,S.event.fix(e))};S.event.special[r]={setup:function(){var e=this.ownerDocument||this.document||this,t=Y.access(e,r);t||e.addEventListener(n,i,!0),Y.access(e,r,(t||0)+1)},teardown:function(){var e=this.ownerDocument||this.document||this,t=Y.access(e,r)-1;t?Y.access(e,r,t):(e.removeEventListener(n,i,!0),Y.remove(e,r))}}});var bt=C.location,wt={guid:Date.now()},Tt=/\?/;S.parseXML=function(e){var t,n;if(!e||"string"!=typeof e)return null;try{t=(new C.DOMParser).parseFromString(e,"text/xml")}catch(e){}return n=t&&t.getElementsByTagName("parsererror")[0],t&&!n||S.error("Invalid XML: "+(n?S.map(n.childNodes,function(e){return e.textContent}).join("\n"):e)),t};var Ct=/\[\]$/,Et=/\r?\n/g,St=/^(?:submit|button|image|reset|file)$/i,kt=/^(?:input|select|textarea|keygen)/i;function At(n,e,r,i){var t;if(Array.isArray(e))S.each(e,function(e,t){r||Ct.test(n)?i(n,t):At(n+"["+("object"==typeof t&&null!=t?e:"")+"]",t,r,i)});else if(r||"object"!==w(e))i(n,e);else for(t in e)At(n+"["+t+"]",e[t],r,i)}S.param=function(e,t){var n,r=[],i=function(e,t){var n=m(t)?t():t;r[r.length]=encodeURIComponent(e)+"="+encodeURIComponent(null==n?"":n)};if(null==e)return"";if(Array.isArray(e)||e.jquery&&!S.isPlainObject(e))S.each(e,function(){i(this.name,this.value)});else for(n in e)At(n,e[n],t,i);return r.join("&")},S.fn.extend({serialize:function(){return S.param(this.serializeArray())},serializeArray:function(){return this.map(function(){var e=S.prop(this,"elements");return e?S.makeArray(e):this}).filter(function(){var e=this.type;return this.name&&!S(this).is(":disabled")&&kt.test(this.nodeName)&&!St.test(e)&&(this.checked||!pe.test(e))}).map(function(e,t){var n=S(this).val();return null==n?null:Array.isArray(n)?S.map(n,function(e){return{name:t.name,value:e.replace(Et,"\r\n")}}):{name:t.name,value:n.replace(Et,"\r\n")}}).get()}});var Nt=/%20/g,jt=/#.*$/,Dt=/([?&])_=[^&]*/,qt=/^(.*?):[ \t]*([^\r\n]*)$/gm,Lt=/^(?:GET|HEAD)$/,Ht=/^\/\//,Ot={},Pt={},Rt="*/".concat("*"),Mt=E.createElement("a");function It(o){return function(e,t){"string"!=typeof e&&(t=e,e="*");var n,r=0,i=e.toLowerCase().match(P)||[];if(m(t))while(n=i[r++])"+"===n[0]?(n=n.slice(1)||"*",(o[n]=o[n]||[]).unshift(t)):(o[n]=o[n]||[]).push(t)}}function Wt(t,i,o,a){var s={},u=t===Pt;function l(e){var r;return s[e]=!0,S.each(t[e]||[],function(e,t){var n=t(i,o,a);return"string"!=typeof n||u||s[n]?u?!(r=n):void 0:(i.dataTypes.unshift(n),l(n),!1)}),r}return l(i.dataTypes[0])||!s["*"]&&l("*")}function Ft(e,t){var n,r,i=S.ajaxSettings.flatOptions||{};for(n in t)void 0!==t[n]&&((i[n]?e:r||(r={}))[n]=t[n]);return r&&S.extend(!0,e,r),e}Mt.href=bt.href,S.extend({active:0,lastModified:{},etag:{},ajaxSettings:{url:bt.href,type:"GET",isLocal:/^(?:about|app|app-storage|.+-extension|file|res|widget):$/.test(bt.protocol),global:!0,processData:!0,async:!0,contentType:"application/x-www-form-urlencoded; charset=UTF-8",accepts:{"*":Rt,text:"text/plain",html:"text/html",xml:"application/xml, text/xml",json:"application/json, text/javascript"},contents:{xml:/\bxml\b/,html:/\bhtml/,json:/\bjson\b/},responseFields:{xml:"responseXML",text:"responseText",json:"responseJSON"},converters:{"* text":String,"text html":!0,"text json":JSON.parse,"text xml":S.parseXML},flatOptions:{url:!0,context:!0}},ajaxSetup:function(e,t){return t?Ft(Ft(e,S.ajaxSettings),t):Ft(S.ajaxSettings,e)},ajaxPrefilter:It(Ot),ajaxTransport:It(Pt),ajax:function(e,t){"object"==typeof e&&(t=e,e=void 0),t=t||{};var c,f,p,n,d,r,h,g,i,o,v=S.ajaxSetup({},t),y=v.context||v,m=v.context&&(y.nodeType||y.jquery)?S(y):S.event,x=S.Deferred(),b=S.Callbacks("once memory"),w=v.statusCode||{},a={},s={},u="canceled",T={readyState:0,getResponseHeader:function(e){var t;if(h){if(!n){n={};while(t=qt.exec(p))n[t[1].toLowerCase()+" "]=(n[t[1].toLowerCase()+" "]||[]).concat(t[2])}t=n[e.toLowerCase()+" "]}return null==t?null:t.join(", ")},getAllResponseHeaders:function(){return h?p:null},setRequestHeader:function(e,t){return null==h&&(e=s[e.toLowerCase()]=s[e.toLowerCase()]||e,a[e]=t),this},overrideMimeType:function(e){return null==h&&(v.mimeType=e),this},statusCode:function(e){var t;if(e)if(h)T.always(e[T.status]);else for(t in e)w[t]=[w[t],e[t]];return this},abort:function(e){var t=e||u;return c&&c.abort(t),l(0,t),this}};if(x.promise(T),v.url=((e||v.url||bt.href)+"").replace(Ht,bt.protocol+"//"),v.type=t.method||t.type||v.method||v.type,v.dataTypes=(v.dataType||"*").toLowerCase().match(P)||[""],null==v.crossDomain){r=E.createElement("a");try{r.href=v.url,r.href=r.href,v.crossDomain=Mt.protocol+"//"+Mt.host!=r.protocol+"//"+r.host}catch(e){v.crossDomain=!0}}if(v.data&&v.processData&&"string"!=typeof v.data&&(v.data=S.param(v.data,v.traditional)),Wt(Ot,v,t,T),h)return T;for(i in(g=S.event&&v.global)&&0==S.active++&&S.event.trigger("ajaxStart"),v.type=v.type.toUpperCase(),v.hasContent=!Lt.test(v.type),f=v.url.replace(jt,""),v.hasContent?v.data&&v.processData&&0===(v.contentType||"").indexOf("application/x-www-form-urlencoded")&&(v.data=v.data.replace(Nt,"+")):(o=v.url.slice(f.length),v.data&&(v.processData||"string"==typeof v.data)&&(f+=(Tt.test(f)?"&":"?")+v.data,delete v.data),!1===v.cache&&(f=f.replace(Dt,"$1"),o=(Tt.test(f)?"&":"?")+"_="+wt.guid+++o),v.url=f+o),v.ifModified&&(S.lastModified[f]&&T.setRequestHeader("If-Modified-Since",S.lastModified[f]),S.etag[f]&&T.setRequestHeader("If-None-Match",S.etag[f])),(v.data&&v.hasContent&&!1!==v.contentType||t.contentType)&&T.setRequestHeader("Content-Type",v.contentType),T.setRequestHeader("Accept",v.dataTypes[0]&&v.accepts[v.dataTypes[0]]?v.accepts[v.dataTypes[0]]+("*"!==v.dataTypes[0]?", "+Rt+"; q=0.01":""):v.accepts["*"]),v.headers)T.setRequestHeader(i,v.headers[i]);if(v.beforeSend&&(!1===v.beforeSend.call(y,T,v)||h))return T.abort();if(u="abort",b.add(v.complete),T.done(v.success),T.fail(v.error),c=Wt(Pt,v,t,T)){if(T.readyState=1,g&&m.trigger("ajaxSend",[T,v]),h)return T;v.async&&0<v.timeout&&(d=C.setTimeout(function(){T.abort("timeout")},v.timeout));try{h=!1,c.send(a,l)}catch(e){if(h)throw e;l(-1,e)}}else l(-1,"No Transport");function l(e,t,n,r){var i,o,a,s,u,l=t;h||(h=!0,d&&C.clearTimeout(d),c=void 0,p=r||"",T.readyState=0<e?4:0,i=200<=e&&e<300||304===e,n&&(s=function(e,t,n){var r,i,o,a,s=e.contents,u=e.dataTypes;while("*"===u[0])u.shift(),void 0===r&&(r=e.mimeType||t.getResponseHeader("Content-Type"));if(r)for(i in s)if(s[i]&&s[i].test(r)){u.unshift(i);break}if(u[0]in n)o=u[0];else{for(i in n){if(!u[0]||e.converters[i+" "+u[0]]){o=i;break}a||(a=i)}o=o||a}if(o)return o!==u[0]&&u.unshift(o),n[o]}(v,T,n)),!i&&-1<S.inArray("script",v.dataTypes)&&S.inArray("json",v.dataTypes)<0&&(v.converters["text script"]=function(){}),s=function(e,t,n,r){var i,o,a,s,u,l={},c=e.dataTypes.slice();if(c[1])for(a in e.converters)l[a.toLowerCase()]=e.converters[a];o=c.shift();while(o)if(e.responseFields[o]&&(n[e.responseFields[o]]=t),!u&&r&&e.dataFilter&&(t=e.dataFilter(t,e.dataType)),u=o,o=c.shift())if("*"===o)o=u;else if("*"!==u&&u!==o){if(!(a=l[u+" "+o]||l["* "+o]))for(i in l)if((s=i.split(" "))[1]===o&&(a=l[u+" "+s[0]]||l["* "+s[0]])){!0===a?a=l[i]:!0!==l[i]&&(o=s[0],c.unshift(s[1]));break}if(!0!==a)if(a&&e["throws"])t=a(t);else try{t=a(t)}catch(e){return{state:"parsererror",error:a?e:"No conversion from "+u+" to "+o}}}return{state:"success",data:t}}(v,s,T,i),i?(v.ifModified&&((u=T.getResponseHeader("Last-Modified"))&&(S.lastModified[f]=u),(u=T.getResponseHeader("etag"))&&(S.etag[f]=u)),204===e||"HEAD"===v.type?l="nocontent":304===e?l="notmodified":(l=s.state,o=s.data,i=!(a=s.error))):(a=l,!e&&l||(l="error",e<0&&(e=0))),T.status=e,T.statusText=(t||l)+"",i?x.resolveWith(y,[o,l,T]):x.rejectWith(y,[T,l,a]),T.statusCode(w),w=void 0,g&&m.trigger(i?"ajaxSuccess":"ajaxError",[T,v,i?o:a]),b.fireWith(y,[T,l]),g&&(m.trigger("ajaxComplete",[T,v]),--S.active||S.event.trigger("ajaxStop")))}return T},getJSON:function(e,t,n){return S.get(e,t,n,"json")},getScript:function(e,t){return S.get(e,void 0,t,"script")}}),S.each(["get","post"],function(e,i){S[i]=function(e,t,n,r){return m(t)&&(r=r||n,n=t,t=void 0),S.ajax(S.extend({url:e,type:i,dataType:r,data:t,success:n},S.isPlainObject(e)&&e))}}),S.ajaxPrefilter(function(e){var t;for(t in e.headers)"content-type"===t.toLowerCase()&&(e.contentType=e.headers[t]||"")}),S._evalUrl=function(e,t,n){return S.ajax({url:e,type:"GET",dataType:"script",cache:!0,async:!1,global:!1,converters:{"text script":function(){}},dataFilter:function(e){S.globalEval(e,t,n)}})},S.fn.extend({wrapAll:function(e){var t;return this[0]&&(m(e)&&(e=e.call(this[0])),t=S(e,this[0].ownerDocument).eq(0).clone(!0),this[0].parentNode&&t.insertBefore(this[0]),t.map(function(){var e=this;while(e.firstElementChild)e=e.firstElementChild;return e}).append(this)),this},wrapInner:function(n){return m(n)?this.each(function(e){S(this).wrapInner(n.call(this,e))}):this.each(function(){var e=S(this),t=e.contents();t.length?t.wrapAll(n):e.append(n)})},wrap:function(t){var n=m(t);return this.each(function(e){S(this).wrapAll(n?t.call(this,e):t)})},unwrap:function(e){return this.parent(e).not("body").each(function(){S(this).replaceWith(this.childNodes)}),this}}),S.expr.pseudos.hidden=function(e){return!S.expr.pseudos.visible(e)},S.expr.pseudos.visible=function(e){return!!(e.offsetWidth||e.offsetHeight||e.getClientRects().length)},S.ajaxSettings.xhr=function(){try{return new C.XMLHttpRequest}catch(e){}};var Bt={0:200,1223:204},$t=S.ajaxSettings.xhr();y.cors=!!$t&&"withCredentials"in $t,y.ajax=$t=!!$t,S.ajaxTransport(function(i){var o,a;if(y.cors||$t&&!i.crossDomain)return{send:function(e,t){var n,r=i.xhr();if(r.open(i.type,i.url,i.async,i.username,i.password),i.xhrFields)for(n in i.xhrFields)r[n]=i.xhrFields[n];for(n in i.mimeType&&r.overrideMimeType&&r.overrideMimeType(i.mimeType),i.crossDomain||e["X-Requested-With"]||(e["X-Requested-With"]="XMLHttpRequest"),e)r.setRequestHeader(n,e[n]);o=function(e){return function(){o&&(o=a=r.onload=r.onerror=r.onabort=r.ontimeout=r.onreadystatechange=null,"abort"===e?r.abort():"error"===e?"number"!=typeof r.status?t(0,"error"):t(r.status,r.statusText):t(Bt[r.status]||r.status,r.statusText,"text"!==(r.responseType||"text")||"string"!=typeof r.responseText?{binary:r.response}:{text:r.responseText},r.getAllResponseHeaders()))}},r.onload=o(),a=r.onerror=r.ontimeout=o("error"),void 0!==r.onabort?r.onabort=a:r.onreadystatechange=function(){4===r.readyState&&C.setTimeout(function(){o&&a()})},o=o("abort");try{r.send(i.hasContent&&i.data||null)}catch(e){if(o)throw e}},abort:function(){o&&o()}}}),S.ajaxPrefilter(function(e){e.crossDomain&&(e.contents.script=!1)}),S.ajaxSetup({accepts:{script:"text/javascript, application/javascript, application/ecmascript, application/x-ecmascript"},contents:{script:/\b(?:java|ecma)script\b/},converters:{"text script":function(e){return S.globalEval(e),e}}}),S.ajaxPrefilter("script",function(e){void 0===e.cache&&(e.cache=!1),e.crossDomain&&(e.type="GET")}),S.ajaxTransport("script",function(n){var r,i;if(n.crossDomain||n.scriptAttrs)return{send:function(e,t){r=S("<script>").attr(n.scriptAttrs||{}).prop({charset:n.scriptCharset,src:n.url}).on("load error",i=function(e){r.remove(),i=null,e&&t("error"===e.type?404:200,e.type)}),E.head.appendChild(r[0])},abort:function(){i&&i()}}});var _t,zt=[],Ut=/(=)\?(?=&|$)|\?\?/;S.ajaxSetup({jsonp:"callback",jsonpCallback:function(){var e=zt.pop()||S.expando+"_"+wt.guid++;return this[e]=!0,e}}),S.ajaxPrefilter("json jsonp",function(e,t,n){var r,i,o,a=!1!==e.jsonp&&(Ut.test(e.url)?"url":"string"==typeof e.data&&0===(e.contentType||"").indexOf("application/x-www-form-urlencoded")&&Ut.test(e.data)&&"data");if(a||"jsonp"===e.dataTypes[0])return r=e.jsonpCallback=m(e.jsonpCallback)?e.jsonpCallback():e.jsonpCallback,a?e[a]=e[a].replace(Ut,"$1"+r):!1!==e.jsonp&&(e.url+=(Tt.test(e.url)?"&":"?")+e.jsonp+"="+r),e.converters["script json"]=function(){return o||S.error(r+" was not called"),o[0]},e.dataTypes[0]="json",i=C[r],C[r]=function(){o=arguments},n.always(function(){void 0===i?S(C).removeProp(r):C[r]=i,e[r]&&(e.jsonpCallback=t.jsonpCallback,zt.push(r)),o&&m(i)&&i(o[0]),o=i=void 0}),"script"}),y.createHTMLDocument=((_t=E.implementation.createHTMLDocument("").body).innerHTML="<form></form><form></form>",2===_t.childNodes.length),S.parseHTML=function(e,t,n){return"string"!=typeof e?[]:("boolean"==typeof t&&(n=t,t=!1),t||(y.createHTMLDocument?((r=(t=E.implementation.createHTMLDocument("")).createElement("base")).href=E.location.href,t.head.appendChild(r)):t=E),o=!n&&[],(i=N.exec(e))?[t.createElement(i[1])]:(i=xe([e],t,o),o&&o.length&&S(o).remove(),S.merge([],i.childNodes)));var r,i,o},S.fn.load=function(e,t,n){var r,i,o,a=this,s=e.indexOf(" ");return-1<s&&(r=ht(e.slice(s)),e=e.slice(0,s)),m(t)?(n=t,t=void 0):t&&"object"==typeof t&&(i="POST"),0<a.length&&S.ajax({url:e,type:i||"GET",dataType:"html",data:t}).done(function(e){o=arguments,a.html(r?S("<div>").append(S.parseHTML(e)).find(r):e)}).always(n&&function(e,t){a.each(function(){n.apply(this,o||[e.responseText,t,e])})}),this},S.expr.pseudos.animated=function(t){return S.grep(S.timers,function(e){return t===e.elem}).length},S.offset={setOffset:function(e,t,n){var r,i,o,a,s,u,l=S.css(e,"position"),c=S(e),f={};"static"===l&&(e.style.position="relative"),s=c.offset(),o=S.css(e,"top"),u=S.css(e,"left"),("absolute"===l||"fixed"===l)&&-1<(o+u).indexOf("auto")?(a=(r=c.position()).top,i=r.left):(a=parseFloat(o)||0,i=parseFloat(u)||0),m(t)&&(t=t.call(e,n,S.extend({},s))),null!=t.top&&(f.top=t.top-s.top+a),null!=t.left&&(f.left=t.left-s.left+i),"using"in t?t.using.call(e,f):c.css(f)}},S.fn.extend({offset:function(t){if(arguments.length)return void 0===t?this:this.each(function(e){S.offset.setOffset(this,t,e)});var e,n,r=this[0];return r?r.getClientRects().length?(e=r.getBoundingClientRect(),n=r.ownerDocument.defaultView,{top:e.top+n.pageYOffset,left:e.left+n.pageXOffset}):{top:0,left:0}:void 0},position:function(){if(this[0]){var e,t,n,r=this[0],i={top:0,left:0};if("fixed"===S.css(r,"position"))t=r.getBoundingClientRect();else{t=this.offset(),n=r.ownerDocument,e=r.offsetParent||n.documentElement;while(e&&(e===n.body||e===n.documentElement)&&"static"===S.css(e,"position"))e=e.parentNode;e&&e!==r&&1===e.nodeType&&((i=S(e).offset()).top+=S.css(e,"borderTopWidth",!0),i.left+=S.css(e,"borderLeftWidth",!0))}return{top:t.top-i.top-S.css(r,"marginTop",!0),left:t.left-i.left-S.css(r,"marginLeft",!0)}}},offsetParent:function(){return this.map(function(){var e=this.offsetParent;while(e&&"static"===S.css(e,"position"))e=e.offsetParent;return e||re})}}),S.each({scrollLeft:"pageXOffset",scrollTop:"pageYOffset"},function(t,i){var o="pageYOffset"===i;S.fn[t]=function(e){return $(this,function(e,t,n){var r;if(x(e)?r=e:9===e.nodeType&&(r=e.defaultView),void 0===n)return r?r[i]:e[t];r?r.scrollTo(o?r.pageXOffset:n,o?n:r.pageYOffset):e[t]=n},t,e,arguments.length)}}),S.each(["top","left"],function(e,n){S.cssHooks[n]=Fe(y.pixelPosition,function(e,t){if(t)return t=We(e,n),Pe.test(t)?S(e).position()[n]+"px":t})}),S.each({Height:"height",Width:"width"},function(a,s){S.each({padding:"inner"+a,content:s,"":"outer"+a},function(r,o){S.fn[o]=function(e,t){var n=arguments.length&&(r||"boolean"!=typeof e),i=r||(!0===e||!0===t?"margin":"border");return $(this,function(e,t,n){var r;return x(e)?0===o.indexOf("outer")?e["inner"+a]:e.document.documentElement["client"+a]:9===e.nodeType?(r=e.documentElement,Math.max(e.body["scroll"+a],r["scroll"+a],e.body["offset"+a],r["offset"+a],r["client"+a])):void 0===n?S.css(e,t,i):S.style(e,t,n,i)},s,n?e:void 0,n)}})}),S.each(["ajaxStart","ajaxStop","ajaxComplete","ajaxError","ajaxSuccess","ajaxSend"],function(e,t){S.fn[t]=function(e){return this.on(t,e)}}),S.fn.extend({bind:function(e,t,n){return this.on(e,null,t,n)},unbind:function(e,t){return this.off(e,null,t)},delegate:function(e,t,n,r){return this.on(t,e,n,r)},undelegate:function(e,t,n){return 1===arguments.length?this.off(e,"**"):this.off(t,e||"**",n)},hover:function(e,t){return this.mouseenter(e).mouseleave(t||e)}}),S.each("blur focus focusin focusout resize scroll click dblclick mousedown mouseup mousemove mouseover mouseout mouseenter mouseleave change select submit keydown keypress keyup contextmenu".split(" "),function(e,n){S.fn[n]=function(e,t){return 0<arguments.length?this.on(n,null,e,t):this.trigger(n)}});var Xt=/^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;S.proxy=function(e,t){var n,r,i;if("string"==typeof t&&(n=e[t],t=e,e=n),m(e))return r=s.call(arguments,2),(i=function(){return e.apply(t||this,r.concat(s.call(arguments)))}).guid=e.guid=e.guid||S.guid++,i},S.holdReady=function(e){e?S.readyWait++:S.ready(!0)},S.isArray=Array.isArray,S.parseJSON=JSON.parse,S.nodeName=A,S.isFunction=m,S.isWindow=x,S.camelCase=X,S.type=w,S.now=Date.now,S.isNumeric=function(e){var t=S.type(e);return("number"===t||"string"===t)&&!isNaN(e-parseFloat(e))},S.trim=function(e){return null==e?"":(e+"").replace(Xt,"")},"function"==typeof define&&define.amd&&define("jquery",[],function(){return S});var Vt=C.jQuery,Gt=C.$;return S.noConflict=function(e){return C.$===S&&(C.$=Gt),e&&C.jQuery===S&&(C.jQuery=Vt),S},"undefined"==typeof e&&(C.jQuery=C.$=S),S});
/*!
 * jQuery UI Widget 1.13.2
 * http://jqueryui.com
 *
 * Copyright jQuery Foundation and other contributors
 * Released under the MIT license.
 * http://jquery.org/license
 */

//>>label: Widget
//>>group: Core
//>>description: Provides a factory for creating stateful widgets with a common API.
//>>docs: http://api.jqueryui.com/jQuery.widget/
//>>demos: http://jqueryui.com/widget/

( function( factory ) {
    if ( typeof define === "function" && define.amd ) {

        // AMD. Register as an anonymous module.
        define( [ "jquery" ], factory );
    } else {

        // Browser globals
        factory( jQuery );
    }
}( function( $ ) {
    "use strict";

    $.ui = $.ui || {};

    var version = $.ui.version = "1.13.2";

    var widgetUuid = 0;
    var widgetHasOwnProperty = Array.prototype.hasOwnProperty;
    var widgetSlice = Array.prototype.slice;

    $.cleanData = ( function( orig ) {
        return function( elems ) {
            var events, elem, i;
            for ( i = 0; ( elem = elems[ i ] ) != null; i++ ) {

                // Only trigger remove when necessary to save time
                events = $._data( elem, "events" );
                if ( events && events.remove ) {
                    $( elem ).triggerHandler( "remove" );
                }
            }
            orig( elems );
        };
    } )( $.cleanData );

    $.widget = function( name, base, prototype ) {
        var existingConstructor, constructor, basePrototype;

        // ProxiedPrototype allows the provided prototype to remain unmodified
        // so that it can be used as a mixin for multiple widgets (#8876)
        var proxiedPrototype = {};

        var namespace = name.split( "." )[ 0 ];
        name = name.split( "." )[ 1 ];
        var fullName = namespace + "-" + name;

        if ( !prototype ) {
            prototype = base;
            base = $.Widget;
        }

        if ( Array.isArray( prototype ) ) {
            prototype = $.extend.apply( null, [ {} ].concat( prototype ) );
        }

        // Create selector for plugin
        $.expr.pseudos[ fullName.toLowerCase() ] = function( elem ) {
            return !!$.data( elem, fullName );
        };

        $[ namespace ] = $[ namespace ] || {};
        existingConstructor = $[ namespace ][ name ];
        constructor = $[ namespace ][ name ] = function( options, element ) {

            // Allow instantiation without "new" keyword
            if ( !this || !this._createWidget ) {
                return new constructor( options, element );
            }

            // Allow instantiation without initializing for simple inheritance
            // must use "new" keyword (the code above always passes args)
            if ( arguments.length ) {
                this._createWidget( options, element );
            }
        };

        // Extend with the existing constructor to carry over any static properties
        $.extend( constructor, existingConstructor, {
            version: prototype.version,

            // Copy the object used to create the prototype in case we need to
            // redefine the widget later
            _proto: $.extend( {}, prototype ),

            // Track widgets that inherit from this widget in case this widget is
            // redefined after a widget inherits from it
            _childConstructors: []
        } );

        basePrototype = new base();

        // We need to make the options hash a property directly on the new instance
        // otherwise we'll modify the options hash on the prototype that we're
        // inheriting from
        basePrototype.options = $.widget.extend( {}, basePrototype.options );
        $.each( prototype, function( prop, value ) {
            if ( typeof value !== "function" ) {
                proxiedPrototype[ prop ] = value;
                return;
            }
            proxiedPrototype[ prop ] = ( function() {
                function _super() {
                    return base.prototype[ prop ].apply( this, arguments );
                }

                function _superApply( args ) {
                    return base.prototype[ prop ].apply( this, args );
                }

                return function() {
                    var __super = this._super;
                    var __superApply = this._superApply;
                    var returnValue;

                    this._super = _super;
                    this._superApply = _superApply;

                    returnValue = value.apply( this, arguments );

                    this._super = __super;
                    this._superApply = __superApply;

                    return returnValue;
                };
            } )();
        } );
        constructor.prototype = $.widget.extend( basePrototype, {

            // TODO: remove support for widgetEventPrefix
            // always use the name + a colon as the prefix, e.g., draggable:start
            // don't prefix for widgets that aren't DOM-based
            widgetEventPrefix: existingConstructor ? ( basePrototype.widgetEventPrefix || name ) : name
        }, proxiedPrototype, {
            constructor: constructor,
            namespace: namespace,
            widgetName: name,
            widgetFullName: fullName
        } );

        // If this widget is being redefined then we need to find all widgets that
        // are inheriting from it and redefine all of them so that they inherit from
        // the new version of this widget. We're essentially trying to replace one
        // level in the prototype chain.
        if ( existingConstructor ) {
            $.each( existingConstructor._childConstructors, function( i, child ) {
                var childPrototype = child.prototype;

                // Redefine the child widget using the same prototype that was
                // originally used, but inherit from the new version of the base
                $.widget( childPrototype.namespace + "." + childPrototype.widgetName, constructor,
                    child._proto );
            } );

            // Remove the list of existing child constructors from the old constructor
            // so the old child constructors can be garbage collected
            delete existingConstructor._childConstructors;
        } else {
            base._childConstructors.push( constructor );
        }

        $.widget.bridge( name, constructor );

        return constructor;
    };

    $.widget.extend = function( target ) {
        var input = widgetSlice.call( arguments, 1 );
        var inputIndex = 0;
        var inputLength = input.length;
        var key;
        var value;

        for ( ; inputIndex < inputLength; inputIndex++ ) {
            for ( key in input[ inputIndex ] ) {
                value = input[ inputIndex ][ key ];
                if ( widgetHasOwnProperty.call( input[ inputIndex ], key ) && value !== undefined ) {

                    // Clone objects
                    if ( $.isPlainObject( value ) ) {
                        target[ key ] = $.isPlainObject( target[ key ] ) ?
                            $.widget.extend( {}, target[ key ], value ) :

                            // Don't extend strings, arrays, etc. with objects
                            $.widget.extend( {}, value );

                        // Copy everything else by reference
                    } else {
                        target[ key ] = value;
                    }
                }
            }
        }
        return target;
    };

    $.widget.bridge = function( name, object ) {
        var fullName = object.prototype.widgetFullName || name;
        $.fn[ name ] = function( options ) {
            var isMethodCall = typeof options === "string";
            var args = widgetSlice.call( arguments, 1 );
            var returnValue = this;

            if ( isMethodCall ) {

                // If this is an empty collection, we need to have the instance method
                // return undefined instead of the jQuery instance
                if ( !this.length && options === "instance" ) {
                    returnValue = undefined;
                } else {
                    this.each( function() {
                        var methodValue;
                        var instance = $.data( this, fullName );

                        if ( options === "instance" ) {
                            returnValue = instance;
                            return false;
                        }

                        if ( !instance ) {
                            return $.error( "cannot call methods on " + name +
                                " prior to initialization; " +
                                "attempted to call method '" + options + "'" );
                        }

                        if ( typeof instance[ options ] !== "function" ||
                            options.charAt( 0 ) === "_" ) {
                            return $.error( "no such method '" + options + "' for " + name +
                                " widget instance" );
                        }

                        methodValue = instance[ options ].apply( instance, args );

                        if ( methodValue !== instance && methodValue !== undefined ) {
                            returnValue = methodValue && methodValue.jquery ?
                                returnValue.pushStack( methodValue.get() ) :
                                methodValue;
                            return false;
                        }
                    } );
                }
            } else {

                // Allow multiple hashes to be passed on init
                if ( args.length ) {
                    options = $.widget.extend.apply( null, [ options ].concat( args ) );
                }

                this.each( function() {
                    var instance = $.data( this, fullName );
                    if ( instance ) {
                        instance.option( options || {} );
                        if ( instance._init ) {
                            instance._init();
                        }
                    } else {
                        $.data( this, fullName, new object( options, this ) );
                    }
                } );
            }

            return returnValue;
        };
    };

    $.Widget = function( /* options, element */ ) {};
    $.Widget._childConstructors = [];

    $.Widget.prototype = {
        widgetName: "widget",
        widgetEventPrefix: "",
        defaultElement: "<div>",

        options: {
            classes: {},
            disabled: false,

            // Callbacks
            create: null
        },

        _createWidget: function( options, element ) {
            element = $( element || this.defaultElement || this )[ 0 ];
            this.element = $( element );
            this.uuid = widgetUuid++;
            this.eventNamespace = "." + this.widgetName + this.uuid;

            this.bindings = $();
            this.hoverable = $();
            this.focusable = $();
            this.classesElementLookup = {};

            if ( element !== this ) {
                $.data( element, this.widgetFullName, this );
                this._on( true, this.element, {
                    remove: function( event ) {
                        if ( event.target === element ) {
                            this.destroy();
                        }
                    }
                } );
                this.document = $( element.style ?

                    // Element within the document
                    element.ownerDocument :

                    // Element is window or document
                    element.document || element );
                this.window = $( this.document[ 0 ].defaultView || this.document[ 0 ].parentWindow );
            }

            this.options = $.widget.extend( {},
                this.options,
                this._getCreateOptions(),
                options );

            this._create();

            if ( this.options.disabled ) {
                this._setOptionDisabled( this.options.disabled );
            }

            this._trigger( "create", null, this._getCreateEventData() );
            this._init();
        },

        _getCreateOptions: function() {
            return {};
        },

        _getCreateEventData: $.noop,

        _create: $.noop,

        _init: $.noop,

        destroy: function() {
            var that = this;

            this._destroy();
            $.each( this.classesElementLookup, function( key, value ) {
                that._removeClass( value, key );
            } );

            // We can probably remove the unbind calls in 2.0
            // all event bindings should go through this._on()
            this.element
                .off( this.eventNamespace )
                .removeData( this.widgetFullName );
            this.widget()
                .off( this.eventNamespace )
                .removeAttr( "aria-disabled" );

            // Clean up events and states
            this.bindings.off( this.eventNamespace );
        },

        _destroy: $.noop,

        widget: function() {
            return this.element;
        },

        option: function( key, value ) {
            var options = key;
            var parts;
            var curOption;
            var i;

            if ( arguments.length === 0 ) {

                // Don't return a reference to the internal hash
                return $.widget.extend( {}, this.options );
            }

            if ( typeof key === "string" ) {

                // Handle nested keys, e.g., "foo.bar" => { foo: { bar: ___ } }
                options = {};
                parts = key.split( "." );
                key = parts.shift();
                if ( parts.length ) {
                    curOption = options[ key ] = $.widget.extend( {}, this.options[ key ] );
                    for ( i = 0; i < parts.length - 1; i++ ) {
                        curOption[ parts[ i ] ] = curOption[ parts[ i ] ] || {};
                        curOption = curOption[ parts[ i ] ];
                    }
                    key = parts.pop();
                    if ( arguments.length === 1 ) {
                        return curOption[ key ] === undefined ? null : curOption[ key ];
                    }
                    curOption[ key ] = value;
                } else {
                    if ( arguments.length === 1 ) {
                        return this.options[ key ] === undefined ? null : this.options[ key ];
                    }
                    options[ key ] = value;
                }
            }

            this._setOptions( options );

            return this;
        },

        _setOptions: function( options ) {
            var key;

            for ( key in options ) {
                this._setOption( key, options[ key ] );
            }

            return this;
        },

        _setOption: function( key, value ) {
            if ( key === "classes" ) {
                this._setOptionClasses( value );
            }

            this.options[ key ] = value;

            if ( key === "disabled" ) {
                this._setOptionDisabled( value );
            }

            return this;
        },

        _setOptionClasses: function( value ) {
            var classKey, elements, currentElements;

            for ( classKey in value ) {
                currentElements = this.classesElementLookup[ classKey ];
                if ( value[ classKey ] === this.options.classes[ classKey ] ||
                    !currentElements ||
                    !currentElements.length ) {
                    continue;
                }

                // We are doing this to create a new jQuery object because the _removeClass() call
                // on the next line is going to destroy the reference to the current elements being
                // tracked. We need to save a copy of this collection so that we can add the new classes
                // below.
                elements = $( currentElements.get() );
                this._removeClass( currentElements, classKey );

                // We don't use _addClass() here, because that uses this.options.classes
                // for generating the string of classes. We want to use the value passed in from
                // _setOption(), this is the new value of the classes option which was passed to
                // _setOption(). We pass this value directly to _classes().
                elements.addClass( this._classes( {
                    element: elements,
                    keys: classKey,
                    classes: value,
                    add: true
                } ) );
            }
        },

        _setOptionDisabled: function( value ) {
            this._toggleClass( this.widget(), this.widgetFullName + "-disabled", null, !!value );

            // If the widget is becoming disabled, then nothing is interactive
            if ( value ) {
                this._removeClass( this.hoverable, null, "ui-state-hover" );
                this._removeClass( this.focusable, null, "ui-state-focus" );
            }
        },

        enable: function() {
            return this._setOptions( { disabled: false } );
        },

        disable: function() {
            return this._setOptions( { disabled: true } );
        },

        _classes: function( options ) {
            var full = [];
            var that = this;

            options = $.extend( {
                element: this.element,
                classes: this.options.classes || {}
            }, options );

            function bindRemoveEvent() {
                var nodesToBind = [];

                options.element.each( function( _, element ) {
                    var isTracked = $.map( that.classesElementLookup, function( elements ) {
                        return elements;
                    } )
                        .some( function( elements ) {
                            return elements.is( element );
                        } );

                    if ( !isTracked ) {
                        nodesToBind.push( element );
                    }
                } );

                that._on( $( nodesToBind ), {
                    remove: "_untrackClassesElement"
                } );
            }

            function processClassString( classes, checkOption ) {
                var current, i;
                for ( i = 0; i < classes.length; i++ ) {
                    current = that.classesElementLookup[ classes[ i ] ] || $();
                    if ( options.add ) {
                        bindRemoveEvent();
                        current = $( $.uniqueSort( current.get().concat( options.element.get() ) ) );
                    } else {
                        current = $( current.not( options.element ).get() );
                    }
                    that.classesElementLookup[ classes[ i ] ] = current;
                    full.push( classes[ i ] );
                    if ( checkOption && options.classes[ classes[ i ] ] ) {
                        full.push( options.classes[ classes[ i ] ] );
                    }
                }
            }

            if ( options.keys ) {
                processClassString( options.keys.match( /\S+/g ) || [], true );
            }
            if ( options.extra ) {
                processClassString( options.extra.match( /\S+/g ) || [] );
            }

            return full.join( " " );
        },

        _untrackClassesElement: function( event ) {
            var that = this;
            $.each( that.classesElementLookup, function( key, value ) {
                if ( $.inArray( event.target, value ) !== -1 ) {
                    that.classesElementLookup[ key ] = $( value.not( event.target ).get() );
                }
            } );

            this._off( $( event.target ) );
        },

        _removeClass: function( element, keys, extra ) {
            return this._toggleClass( element, keys, extra, false );
        },

        _addClass: function( element, keys, extra ) {
            return this._toggleClass( element, keys, extra, true );
        },

        _toggleClass: function( element, keys, extra, add ) {
            add = ( typeof add === "boolean" ) ? add : extra;
            var shift = ( typeof element === "string" || element === null ),
                options = {
                    extra: shift ? keys : extra,
                    keys: shift ? element : keys,
                    element: shift ? this.element : element,
                    add: add
                };
            options.element.toggleClass( this._classes( options ), add );
            return this;
        },

        _on: function( suppressDisabledCheck, element, handlers ) {
            var delegateElement;
            var instance = this;

            // No suppressDisabledCheck flag, shuffle arguments
            if ( typeof suppressDisabledCheck !== "boolean" ) {
                handlers = element;
                element = suppressDisabledCheck;
                suppressDisabledCheck = false;
            }

            // No element argument, shuffle and use this.element
            if ( !handlers ) {
                handlers = element;
                element = this.element;
                delegateElement = this.widget();
            } else {
                element = delegateElement = $( element );
                this.bindings = this.bindings.add( element );
            }

            $.each( handlers, function( event, handler ) {
                function handlerProxy() {

                    // Allow widgets to customize the disabled handling
                    // - disabled as an array instead of boolean
                    // - disabled class as method for disabling individual parts
                    if ( !suppressDisabledCheck &&
                        ( instance.options.disabled === true ||
                            $( this ).hasClass( "ui-state-disabled" ) ) ) {
                        return;
                    }
                    return ( typeof handler === "string" ? instance[ handler ] : handler )
                        .apply( instance, arguments );
                }

                // Copy the guid so direct unbinding works
                if ( typeof handler !== "string" ) {
                    handlerProxy.guid = handler.guid =
                        handler.guid || handlerProxy.guid || $.guid++;
                }

                var match = event.match( /^([\w:-]*)\s*(.*)$/ );
                var eventName = match[ 1 ] + instance.eventNamespace;
                var selector = match[ 2 ];

                if ( selector ) {
                    delegateElement.on( eventName, selector, handlerProxy );
                } else {
                    element.on( eventName, handlerProxy );
                }
            } );
        },

        _off: function( element, eventName ) {
            eventName = ( eventName || "" ).split( " " ).join( this.eventNamespace + " " ) +
                this.eventNamespace;
            element.off( eventName );

            // Clear the stack to avoid memory leaks (#10056)
            this.bindings = $( this.bindings.not( element ).get() );
            this.focusable = $( this.focusable.not( element ).get() );
            this.hoverable = $( this.hoverable.not( element ).get() );
        },

        _delay: function( handler, delay ) {
            function handlerProxy() {
                return ( typeof handler === "string" ? instance[ handler ] : handler )
                    .apply( instance, arguments );
            }
            var instance = this;
            return setTimeout( handlerProxy, delay || 0 );
        },

        _hoverable: function( element ) {
            this.hoverable = this.hoverable.add( element );
            this._on( element, {
                mouseenter: function( event ) {
                    this._addClass( $( event.currentTarget ), null, "ui-state-hover" );
                },
                mouseleave: function( event ) {
                    this._removeClass( $( event.currentTarget ), null, "ui-state-hover" );
                }
            } );
        },

        _focusable: function( element ) {
            this.focusable = this.focusable.add( element );
            this._on( element, {
                focusin: function( event ) {
                    this._addClass( $( event.currentTarget ), null, "ui-state-focus" );
                },
                focusout: function( event ) {
                    this._removeClass( $( event.currentTarget ), null, "ui-state-focus" );
                }
            } );
        },

        _trigger: function( type, event, data ) {
            var prop, orig;
            var callback = this.options[ type ];

            data = data || {};
            event = $.Event( event );
            event.type = ( type === this.widgetEventPrefix ?
                type :
                this.widgetEventPrefix + type ).toLowerCase();

            // The original event may come from any element
            // so we need to reset the target on the new event
            event.target = this.element[ 0 ];

            // Copy original event properties over to the new event
            orig = event.originalEvent;
            if ( orig ) {
                for ( prop in orig ) {
                    if ( !( prop in event ) ) {
                        event[ prop ] = orig[ prop ];
                    }
                }
            }

            this.element.trigger( event, data );
            return !( typeof callback === "function" &&
                callback.apply( this.element[ 0 ], [ event ].concat( data ) ) === false ||
                event.isDefaultPrevented() );
        }
    };

    $.each( { show: "fadeIn", hide: "fadeOut" }, function( method, defaultEffect ) {
        $.Widget.prototype[ "_" + method ] = function( element, options, callback ) {
            if ( typeof options === "string" ) {
                options = { effect: options };
            }

            var hasOptions;
            var effectName = !options ?
                method :
                options === true || typeof options === "number" ?
                    defaultEffect :
                    options.effect || defaultEffect;

            options = options || {};
            if ( typeof options === "number" ) {
                options = { duration: options };
            } else if ( options === true ) {
                options = {};
            }

            hasOptions = !$.isEmptyObject( options );
            options.complete = callback;

            if ( options.delay ) {
                element.delay( options.delay );
            }

            if ( hasOptions && $.effects && $.effects.effect[ effectName ] ) {
                element[ method ]( options );
            } else if ( effectName !== method && element[ effectName ] ) {
                element[ effectName ]( options.duration, options.easing, callback );
            } else {
                element.queue( function( next ) {
                    $( this )[ method ]();
                    if ( callback ) {
                        callback.call( element[ 0 ] );
                    }
                    next();
                } );
            }
        };
    } );

    var widget = $.widget;
}));
!function(n,r){"object"==typeof exports&&"undefined"!=typeof module?module.exports=r():"function"==typeof define&&define.amd?define("underscore",r):(n="undefined"!=typeof globalThis?globalThis:n||self,function(){var t=n._,e=n._=r();e.noConflict=function(){return n._=t,e}}())}(this,(function(){
//     Underscore.js 1.13.6
//     https://underscorejs.org
//     (c) 2009-2022 Jeremy Ashkenas, Julian Gonggrijp, and DocumentCloud and Investigative Reporters & Editors
//     Underscore may be freely distributed under the MIT license.
var n="1.13.6",r="object"==typeof self&&self.self===self&&self||"object"==typeof global&&global.global===global&&global||Function("return this")()||{},t=Array.prototype,e=Object.prototype,u="undefined"!=typeof Symbol?Symbol.prototype:null,o=t.push,i=t.slice,a=e.toString,f=e.hasOwnProperty,c="undefined"!=typeof ArrayBuffer,l="undefined"!=typeof DataView,s=Array.isArray,p=Object.keys,v=Object.create,h=c&&ArrayBuffer.isView,y=isNaN,d=isFinite,g=!{toString:null}.propertyIsEnumerable("toString"),b=["valueOf","isPrototypeOf","toString","propertyIsEnumerable","hasOwnProperty","toLocaleString"],m=Math.pow(2,53)-1;function j(n,r){return r=null==r?n.length-1:+r,function(){for(var t=Math.max(arguments.length-r,0),e=Array(t),u=0;u<t;u++)e[u]=arguments[u+r];switch(r){case 0:return n.call(this,e);case 1:return n.call(this,arguments[0],e);case 2:return n.call(this,arguments[0],arguments[1],e)}var o=Array(r+1);for(u=0;u<r;u++)o[u]=arguments[u];return o[r]=e,n.apply(this,o)}}function _(n){var r=typeof n;return"function"===r||"object"===r&&!!n}function w(n){return void 0===n}function A(n){return!0===n||!1===n||"[object Boolean]"===a.call(n)}function x(n){var r="[object "+n+"]";return function(n){return a.call(n)===r}}var S=x("String"),O=x("Number"),M=x("Date"),E=x("RegExp"),B=x("Error"),N=x("Symbol"),I=x("ArrayBuffer"),T=x("Function"),k=r.document&&r.document.childNodes;"function"!=typeof/./&&"object"!=typeof Int8Array&&"function"!=typeof k&&(T=function(n){return"function"==typeof n||!1});var D=T,R=x("Object"),F=l&&R(new DataView(new ArrayBuffer(8))),V="undefined"!=typeof Map&&R(new Map),P=x("DataView");var q=F?function(n){return null!=n&&D(n.getInt8)&&I(n.buffer)}:P,U=s||x("Array");function W(n,r){return null!=n&&f.call(n,r)}var z=x("Arguments");!function(){z(arguments)||(z=function(n){return W(n,"callee")})}();var L=z;function $(n){return O(n)&&y(n)}function C(n){return function(){return n}}function K(n){return function(r){var t=n(r);return"number"==typeof t&&t>=0&&t<=m}}function J(n){return function(r){return null==r?void 0:r[n]}}var G=J("byteLength"),H=K(G),Q=/\[object ((I|Ui)nt(8|16|32)|Float(32|64)|Uint8Clamped|Big(I|Ui)nt64)Array\]/;var X=c?function(n){return h?h(n)&&!q(n):H(n)&&Q.test(a.call(n))}:C(!1),Y=J("length");function Z(n,r){r=function(n){for(var r={},t=n.length,e=0;e<t;++e)r[n[e]]=!0;return{contains:function(n){return!0===r[n]},push:function(t){return r[t]=!0,n.push(t)}}}(r);var t=b.length,u=n.constructor,o=D(u)&&u.prototype||e,i="constructor";for(W(n,i)&&!r.contains(i)&&r.push(i);t--;)(i=b[t])in n&&n[i]!==o[i]&&!r.contains(i)&&r.push(i)}function nn(n){if(!_(n))return[];if(p)return p(n);var r=[];for(var t in n)W(n,t)&&r.push(t);return g&&Z(n,r),r}function rn(n,r){var t=nn(r),e=t.length;if(null==n)return!e;for(var u=Object(n),o=0;o<e;o++){var i=t[o];if(r[i]!==u[i]||!(i in u))return!1}return!0}function tn(n){return n instanceof tn?n:this instanceof tn?void(this._wrapped=n):new tn(n)}function en(n){return new Uint8Array(n.buffer||n,n.byteOffset||0,G(n))}tn.VERSION=n,tn.prototype.value=function(){return this._wrapped},tn.prototype.valueOf=tn.prototype.toJSON=tn.prototype.value,tn.prototype.toString=function(){return String(this._wrapped)};var un="[object DataView]";function on(n,r,t,e){if(n===r)return 0!==n||1/n==1/r;if(null==n||null==r)return!1;if(n!=n)return r!=r;var o=typeof n;return("function"===o||"object"===o||"object"==typeof r)&&function n(r,t,e,o){r instanceof tn&&(r=r._wrapped);t instanceof tn&&(t=t._wrapped);var i=a.call(r);if(i!==a.call(t))return!1;if(F&&"[object Object]"==i&&q(r)){if(!q(t))return!1;i=un}switch(i){case"[object RegExp]":case"[object String]":return""+r==""+t;case"[object Number]":return+r!=+r?+t!=+t:0==+r?1/+r==1/t:+r==+t;case"[object Date]":case"[object Boolean]":return+r==+t;case"[object Symbol]":return u.valueOf.call(r)===u.valueOf.call(t);case"[object ArrayBuffer]":case un:return n(en(r),en(t),e,o)}var f="[object Array]"===i;if(!f&&X(r)){if(G(r)!==G(t))return!1;if(r.buffer===t.buffer&&r.byteOffset===t.byteOffset)return!0;f=!0}if(!f){if("object"!=typeof r||"object"!=typeof t)return!1;var c=r.constructor,l=t.constructor;if(c!==l&&!(D(c)&&c instanceof c&&D(l)&&l instanceof l)&&"constructor"in r&&"constructor"in t)return!1}o=o||[];var s=(e=e||[]).length;for(;s--;)if(e[s]===r)return o[s]===t;if(e.push(r),o.push(t),f){if((s=r.length)!==t.length)return!1;for(;s--;)if(!on(r[s],t[s],e,o))return!1}else{var p,v=nn(r);if(s=v.length,nn(t).length!==s)return!1;for(;s--;)if(p=v[s],!W(t,p)||!on(r[p],t[p],e,o))return!1}return e.pop(),o.pop(),!0}(n,r,t,e)}function an(n){if(!_(n))return[];var r=[];for(var t in n)r.push(t);return g&&Z(n,r),r}function fn(n){var r=Y(n);return function(t){if(null==t)return!1;var e=an(t);if(Y(e))return!1;for(var u=0;u<r;u++)if(!D(t[n[u]]))return!1;return n!==hn||!D(t[cn])}}var cn="forEach",ln="has",sn=["clear","delete"],pn=["get",ln,"set"],vn=sn.concat(cn,pn),hn=sn.concat(pn),yn=["add"].concat(sn,cn,ln),dn=V?fn(vn):x("Map"),gn=V?fn(hn):x("WeakMap"),bn=V?fn(yn):x("Set"),mn=x("WeakSet");function jn(n){for(var r=nn(n),t=r.length,e=Array(t),u=0;u<t;u++)e[u]=n[r[u]];return e}function _n(n){for(var r={},t=nn(n),e=0,u=t.length;e<u;e++)r[n[t[e]]]=t[e];return r}function wn(n){var r=[];for(var t in n)D(n[t])&&r.push(t);return r.sort()}function An(n,r){return function(t){var e=arguments.length;if(r&&(t=Object(t)),e<2||null==t)return t;for(var u=1;u<e;u++)for(var o=arguments[u],i=n(o),a=i.length,f=0;f<a;f++){var c=i[f];r&&void 0!==t[c]||(t[c]=o[c])}return t}}var xn=An(an),Sn=An(nn),On=An(an,!0);function Mn(n){if(!_(n))return{};if(v)return v(n);var r=function(){};r.prototype=n;var t=new r;return r.prototype=null,t}function En(n){return U(n)?n:[n]}function Bn(n){return tn.toPath(n)}function Nn(n,r){for(var t=r.length,e=0;e<t;e++){if(null==n)return;n=n[r[e]]}return t?n:void 0}function In(n,r,t){var e=Nn(n,Bn(r));return w(e)?t:e}function Tn(n){return n}function kn(n){return n=Sn({},n),function(r){return rn(r,n)}}function Dn(n){return n=Bn(n),function(r){return Nn(r,n)}}function Rn(n,r,t){if(void 0===r)return n;switch(null==t?3:t){case 1:return function(t){return n.call(r,t)};case 3:return function(t,e,u){return n.call(r,t,e,u)};case 4:return function(t,e,u,o){return n.call(r,t,e,u,o)}}return function(){return n.apply(r,arguments)}}function Fn(n,r,t){return null==n?Tn:D(n)?Rn(n,r,t):_(n)&&!U(n)?kn(n):Dn(n)}function Vn(n,r){return Fn(n,r,1/0)}function Pn(n,r,t){return tn.iteratee!==Vn?tn.iteratee(n,r):Fn(n,r,t)}function qn(){}function Un(n,r){return null==r&&(r=n,n=0),n+Math.floor(Math.random()*(r-n+1))}tn.toPath=En,tn.iteratee=Vn;var Wn=Date.now||function(){return(new Date).getTime()};function zn(n){var r=function(r){return n[r]},t="(?:"+nn(n).join("|")+")",e=RegExp(t),u=RegExp(t,"g");return function(n){return n=null==n?"":""+n,e.test(n)?n.replace(u,r):n}}var Ln={"&":"&amp;","<":"&lt;",">":"&gt;",'"':"&quot;","'":"&#x27;","`":"&#x60;"},$n=zn(Ln),Cn=zn(_n(Ln)),Kn=tn.templateSettings={evaluate:/<%([\s\S]+?)%>/g,interpolate:/<%=([\s\S]+?)%>/g,escape:/<%-([\s\S]+?)%>/g},Jn=/(.)^/,Gn={"'":"'","\\":"\\","\r":"r","\n":"n","\u2028":"u2028","\u2029":"u2029"},Hn=/\\|'|\r|\n|\u2028|\u2029/g;function Qn(n){return"\\"+Gn[n]}var Xn=/^\s*(\w|\$)+\s*$/;var Yn=0;function Zn(n,r,t,e,u){if(!(e instanceof r))return n.apply(t,u);var o=Mn(n.prototype),i=n.apply(o,u);return _(i)?i:o}var nr=j((function(n,r){var t=nr.placeholder,e=function(){for(var u=0,o=r.length,i=Array(o),a=0;a<o;a++)i[a]=r[a]===t?arguments[u++]:r[a];for(;u<arguments.length;)i.push(arguments[u++]);return Zn(n,e,this,this,i)};return e}));nr.placeholder=tn;var rr=j((function(n,r,t){if(!D(n))throw new TypeError("Bind must be called on a function");var e=j((function(u){return Zn(n,e,r,this,t.concat(u))}));return e})),tr=K(Y);function er(n,r,t,e){if(e=e||[],r||0===r){if(r<=0)return e.concat(n)}else r=1/0;for(var u=e.length,o=0,i=Y(n);o<i;o++){var a=n[o];if(tr(a)&&(U(a)||L(a)))if(r>1)er(a,r-1,t,e),u=e.length;else for(var f=0,c=a.length;f<c;)e[u++]=a[f++];else t||(e[u++]=a)}return e}var ur=j((function(n,r){var t=(r=er(r,!1,!1)).length;if(t<1)throw new Error("bindAll must be passed function names");for(;t--;){var e=r[t];n[e]=rr(n[e],n)}return n}));var or=j((function(n,r,t){return setTimeout((function(){return n.apply(null,t)}),r)})),ir=nr(or,tn,1);function ar(n){return function(){return!n.apply(this,arguments)}}function fr(n,r){var t;return function(){return--n>0&&(t=r.apply(this,arguments)),n<=1&&(r=null),t}}var cr=nr(fr,2);function lr(n,r,t){r=Pn(r,t);for(var e,u=nn(n),o=0,i=u.length;o<i;o++)if(r(n[e=u[o]],e,n))return e}function sr(n){return function(r,t,e){t=Pn(t,e);for(var u=Y(r),o=n>0?0:u-1;o>=0&&o<u;o+=n)if(t(r[o],o,r))return o;return-1}}var pr=sr(1),vr=sr(-1);function hr(n,r,t,e){for(var u=(t=Pn(t,e,1))(r),o=0,i=Y(n);o<i;){var a=Math.floor((o+i)/2);t(n[a])<u?o=a+1:i=a}return o}function yr(n,r,t){return function(e,u,o){var a=0,f=Y(e);if("number"==typeof o)n>0?a=o>=0?o:Math.max(o+f,a):f=o>=0?Math.min(o+1,f):o+f+1;else if(t&&o&&f)return e[o=t(e,u)]===u?o:-1;if(u!=u)return(o=r(i.call(e,a,f),$))>=0?o+a:-1;for(o=n>0?a:f-1;o>=0&&o<f;o+=n)if(e[o]===u)return o;return-1}}var dr=yr(1,pr,hr),gr=yr(-1,vr);function br(n,r,t){var e=(tr(n)?pr:lr)(n,r,t);if(void 0!==e&&-1!==e)return n[e]}function mr(n,r,t){var e,u;if(r=Rn(r,t),tr(n))for(e=0,u=n.length;e<u;e++)r(n[e],e,n);else{var o=nn(n);for(e=0,u=o.length;e<u;e++)r(n[o[e]],o[e],n)}return n}function jr(n,r,t){r=Pn(r,t);for(var e=!tr(n)&&nn(n),u=(e||n).length,o=Array(u),i=0;i<u;i++){var a=e?e[i]:i;o[i]=r(n[a],a,n)}return o}function _r(n){var r=function(r,t,e,u){var o=!tr(r)&&nn(r),i=(o||r).length,a=n>0?0:i-1;for(u||(e=r[o?o[a]:a],a+=n);a>=0&&a<i;a+=n){var f=o?o[a]:a;e=t(e,r[f],f,r)}return e};return function(n,t,e,u){var o=arguments.length>=3;return r(n,Rn(t,u,4),e,o)}}var wr=_r(1),Ar=_r(-1);function xr(n,r,t){var e=[];return r=Pn(r,t),mr(n,(function(n,t,u){r(n,t,u)&&e.push(n)})),e}function Sr(n,r,t){r=Pn(r,t);for(var e=!tr(n)&&nn(n),u=(e||n).length,o=0;o<u;o++){var i=e?e[o]:o;if(!r(n[i],i,n))return!1}return!0}function Or(n,r,t){r=Pn(r,t);for(var e=!tr(n)&&nn(n),u=(e||n).length,o=0;o<u;o++){var i=e?e[o]:o;if(r(n[i],i,n))return!0}return!1}function Mr(n,r,t,e){return tr(n)||(n=jn(n)),("number"!=typeof t||e)&&(t=0),dr(n,r,t)>=0}var Er=j((function(n,r,t){var e,u;return D(r)?u=r:(r=Bn(r),e=r.slice(0,-1),r=r[r.length-1]),jr(n,(function(n){var o=u;if(!o){if(e&&e.length&&(n=Nn(n,e)),null==n)return;o=n[r]}return null==o?o:o.apply(n,t)}))}));function Br(n,r){return jr(n,Dn(r))}function Nr(n,r,t){var e,u,o=-1/0,i=-1/0;if(null==r||"number"==typeof r&&"object"!=typeof n[0]&&null!=n)for(var a=0,f=(n=tr(n)?n:jn(n)).length;a<f;a++)null!=(e=n[a])&&e>o&&(o=e);else r=Pn(r,t),mr(n,(function(n,t,e){((u=r(n,t,e))>i||u===-1/0&&o===-1/0)&&(o=n,i=u)}));return o}var Ir=/[^\ud800-\udfff]|[\ud800-\udbff][\udc00-\udfff]|[\ud800-\udfff]/g;function Tr(n){return n?U(n)?i.call(n):S(n)?n.match(Ir):tr(n)?jr(n,Tn):jn(n):[]}function kr(n,r,t){if(null==r||t)return tr(n)||(n=jn(n)),n[Un(n.length-1)];var e=Tr(n),u=Y(e);r=Math.max(Math.min(r,u),0);for(var o=u-1,i=0;i<r;i++){var a=Un(i,o),f=e[i];e[i]=e[a],e[a]=f}return e.slice(0,r)}function Dr(n,r){return function(t,e,u){var o=r?[[],[]]:{};return e=Pn(e,u),mr(t,(function(r,u){var i=e(r,u,t);n(o,r,i)})),o}}var Rr=Dr((function(n,r,t){W(n,t)?n[t].push(r):n[t]=[r]})),Fr=Dr((function(n,r,t){n[t]=r})),Vr=Dr((function(n,r,t){W(n,t)?n[t]++:n[t]=1})),Pr=Dr((function(n,r,t){n[t?0:1].push(r)}),!0);function qr(n,r,t){return r in t}var Ur=j((function(n,r){var t={},e=r[0];if(null==n)return t;D(e)?(r.length>1&&(e=Rn(e,r[1])),r=an(n)):(e=qr,r=er(r,!1,!1),n=Object(n));for(var u=0,o=r.length;u<o;u++){var i=r[u],a=n[i];e(a,i,n)&&(t[i]=a)}return t})),Wr=j((function(n,r){var t,e=r[0];return D(e)?(e=ar(e),r.length>1&&(t=r[1])):(r=jr(er(r,!1,!1),String),e=function(n,t){return!Mr(r,t)}),Ur(n,e,t)}));function zr(n,r,t){return i.call(n,0,Math.max(0,n.length-(null==r||t?1:r)))}function Lr(n,r,t){return null==n||n.length<1?null==r||t?void 0:[]:null==r||t?n[0]:zr(n,n.length-r)}function $r(n,r,t){return i.call(n,null==r||t?1:r)}var Cr=j((function(n,r){return r=er(r,!0,!0),xr(n,(function(n){return!Mr(r,n)}))})),Kr=j((function(n,r){return Cr(n,r)}));function Jr(n,r,t,e){A(r)||(e=t,t=r,r=!1),null!=t&&(t=Pn(t,e));for(var u=[],o=[],i=0,a=Y(n);i<a;i++){var f=n[i],c=t?t(f,i,n):f;r&&!t?(i&&o===c||u.push(f),o=c):t?Mr(o,c)||(o.push(c),u.push(f)):Mr(u,f)||u.push(f)}return u}var Gr=j((function(n){return Jr(er(n,!0,!0))}));function Hr(n){for(var r=n&&Nr(n,Y).length||0,t=Array(r),e=0;e<r;e++)t[e]=Br(n,e);return t}var Qr=j(Hr);function Xr(n,r){return n._chain?tn(r).chain():r}function Yr(n){return mr(wn(n),(function(r){var t=tn[r]=n[r];tn.prototype[r]=function(){var n=[this._wrapped];return o.apply(n,arguments),Xr(this,t.apply(tn,n))}})),tn}mr(["pop","push","reverse","shift","sort","splice","unshift"],(function(n){var r=t[n];tn.prototype[n]=function(){var t=this._wrapped;return null!=t&&(r.apply(t,arguments),"shift"!==n&&"splice"!==n||0!==t.length||delete t[0]),Xr(this,t)}})),mr(["concat","join","slice"],(function(n){var r=t[n];tn.prototype[n]=function(){var n=this._wrapped;return null!=n&&(n=r.apply(n,arguments)),Xr(this,n)}}));var Zr=Yr({__proto__:null,VERSION:n,restArguments:j,isObject:_,isNull:function(n){return null===n},isUndefined:w,isBoolean:A,isElement:function(n){return!(!n||1!==n.nodeType)},isString:S,isNumber:O,isDate:M,isRegExp:E,isError:B,isSymbol:N,isArrayBuffer:I,isDataView:q,isArray:U,isFunction:D,isArguments:L,isFinite:function(n){return!N(n)&&d(n)&&!isNaN(parseFloat(n))},isNaN:$,isTypedArray:X,isEmpty:function(n){if(null==n)return!0;var r=Y(n);return"number"==typeof r&&(U(n)||S(n)||L(n))?0===r:0===Y(nn(n))},isMatch:rn,isEqual:function(n,r){return on(n,r)},isMap:dn,isWeakMap:gn,isSet:bn,isWeakSet:mn,keys:nn,allKeys:an,values:jn,pairs:function(n){for(var r=nn(n),t=r.length,e=Array(t),u=0;u<t;u++)e[u]=[r[u],n[r[u]]];return e},invert:_n,functions:wn,methods:wn,extend:xn,extendOwn:Sn,assign:Sn,defaults:On,create:function(n,r){var t=Mn(n);return r&&Sn(t,r),t},clone:function(n){return _(n)?U(n)?n.slice():xn({},n):n},tap:function(n,r){return r(n),n},get:In,has:function(n,r){for(var t=(r=Bn(r)).length,e=0;e<t;e++){var u=r[e];if(!W(n,u))return!1;n=n[u]}return!!t},mapObject:function(n,r,t){r=Pn(r,t);for(var e=nn(n),u=e.length,o={},i=0;i<u;i++){var a=e[i];o[a]=r(n[a],a,n)}return o},identity:Tn,constant:C,noop:qn,toPath:En,property:Dn,propertyOf:function(n){return null==n?qn:function(r){return In(n,r)}},matcher:kn,matches:kn,times:function(n,r,t){var e=Array(Math.max(0,n));r=Rn(r,t,1);for(var u=0;u<n;u++)e[u]=r(u);return e},random:Un,now:Wn,escape:$n,unescape:Cn,templateSettings:Kn,template:function(n,r,t){!r&&t&&(r=t),r=On({},r,tn.templateSettings);var e=RegExp([(r.escape||Jn).source,(r.interpolate||Jn).source,(r.evaluate||Jn).source].join("|")+"|$","g"),u=0,o="__p+='";n.replace(e,(function(r,t,e,i,a){return o+=n.slice(u,a).replace(Hn,Qn),u=a+r.length,t?o+="'+\n((__t=("+t+"))==null?'':_.escape(__t))+\n'":e?o+="'+\n((__t=("+e+"))==null?'':__t)+\n'":i&&(o+="';\n"+i+"\n__p+='"),r})),o+="';\n";var i,a=r.variable;if(a){if(!Xn.test(a))throw new Error("variable is not a bare identifier: "+a)}else o="with(obj||{}){\n"+o+"}\n",a="obj";o="var __t,__p='',__j=Array.prototype.join,"+"print=function(){__p+=__j.call(arguments,'');};\n"+o+"return __p;\n";try{i=new Function(a,"_",o)}catch(n){throw n.source=o,n}var f=function(n){return i.call(this,n,tn)};return f.source="function("+a+"){\n"+o+"}",f},result:function(n,r,t){var e=(r=Bn(r)).length;if(!e)return D(t)?t.call(n):t;for(var u=0;u<e;u++){var o=null==n?void 0:n[r[u]];void 0===o&&(o=t,u=e),n=D(o)?o.call(n):o}return n},uniqueId:function(n){var r=++Yn+"";return n?n+r:r},chain:function(n){var r=tn(n);return r._chain=!0,r},iteratee:Vn,partial:nr,bind:rr,bindAll:ur,memoize:function(n,r){var t=function(e){var u=t.cache,o=""+(r?r.apply(this,arguments):e);return W(u,o)||(u[o]=n.apply(this,arguments)),u[o]};return t.cache={},t},delay:or,defer:ir,throttle:function(n,r,t){var e,u,o,i,a=0;t||(t={});var f=function(){a=!1===t.leading?0:Wn(),e=null,i=n.apply(u,o),e||(u=o=null)},c=function(){var c=Wn();a||!1!==t.leading||(a=c);var l=r-(c-a);return u=this,o=arguments,l<=0||l>r?(e&&(clearTimeout(e),e=null),a=c,i=n.apply(u,o),e||(u=o=null)):e||!1===t.trailing||(e=setTimeout(f,l)),i};return c.cancel=function(){clearTimeout(e),a=0,e=u=o=null},c},debounce:function(n,r,t){var e,u,o,i,a,f=function(){var c=Wn()-u;r>c?e=setTimeout(f,r-c):(e=null,t||(i=n.apply(a,o)),e||(o=a=null))},c=j((function(c){return a=this,o=c,u=Wn(),e||(e=setTimeout(f,r),t&&(i=n.apply(a,o))),i}));return c.cancel=function(){clearTimeout(e),e=o=a=null},c},wrap:function(n,r){return nr(r,n)},negate:ar,compose:function(){var n=arguments,r=n.length-1;return function(){for(var t=r,e=n[r].apply(this,arguments);t--;)e=n[t].call(this,e);return e}},after:function(n,r){return function(){if(--n<1)return r.apply(this,arguments)}},before:fr,once:cr,findKey:lr,findIndex:pr,findLastIndex:vr,sortedIndex:hr,indexOf:dr,lastIndexOf:gr,find:br,detect:br,findWhere:function(n,r){return br(n,kn(r))},each:mr,forEach:mr,map:jr,collect:jr,reduce:wr,foldl:wr,inject:wr,reduceRight:Ar,foldr:Ar,filter:xr,select:xr,reject:function(n,r,t){return xr(n,ar(Pn(r)),t)},every:Sr,all:Sr,some:Or,any:Or,contains:Mr,includes:Mr,include:Mr,invoke:Er,pluck:Br,where:function(n,r){return xr(n,kn(r))},max:Nr,min:function(n,r,t){var e,u,o=1/0,i=1/0;if(null==r||"number"==typeof r&&"object"!=typeof n[0]&&null!=n)for(var a=0,f=(n=tr(n)?n:jn(n)).length;a<f;a++)null!=(e=n[a])&&e<o&&(o=e);else r=Pn(r,t),mr(n,(function(n,t,e){((u=r(n,t,e))<i||u===1/0&&o===1/0)&&(o=n,i=u)}));return o},shuffle:function(n){return kr(n,1/0)},sample:kr,sortBy:function(n,r,t){var e=0;return r=Pn(r,t),Br(jr(n,(function(n,t,u){return{value:n,index:e++,criteria:r(n,t,u)}})).sort((function(n,r){var t=n.criteria,e=r.criteria;if(t!==e){if(t>e||void 0===t)return 1;if(t<e||void 0===e)return-1}return n.index-r.index})),"value")},groupBy:Rr,indexBy:Fr,countBy:Vr,partition:Pr,toArray:Tr,size:function(n){return null==n?0:tr(n)?n.length:nn(n).length},pick:Ur,omit:Wr,first:Lr,head:Lr,take:Lr,initial:zr,last:function(n,r,t){return null==n||n.length<1?null==r||t?void 0:[]:null==r||t?n[n.length-1]:$r(n,Math.max(0,n.length-r))},rest:$r,tail:$r,drop:$r,compact:function(n){return xr(n,Boolean)},flatten:function(n,r){return er(n,r,!1)},without:Kr,uniq:Jr,unique:Jr,union:Gr,intersection:function(n){for(var r=[],t=arguments.length,e=0,u=Y(n);e<u;e++){var o=n[e];if(!Mr(r,o)){var i;for(i=1;i<t&&Mr(arguments[i],o);i++);i===t&&r.push(o)}}return r},difference:Cr,unzip:Hr,transpose:Hr,zip:Qr,object:function(n,r){for(var t={},e=0,u=Y(n);e<u;e++)r?t[n[e]]=r[e]:t[n[e][0]]=n[e][1];return t},range:function(n,r,t){null==r&&(r=n||0,n=0),t||(t=r<n?-1:1);for(var e=Math.max(Math.ceil((r-n)/t),0),u=Array(e),o=0;o<e;o++,n+=t)u[o]=n;return u},chunk:function(n,r){if(null==r||r<1)return[];for(var t=[],e=0,u=n.length;e<u;)t.push(i.call(n,e,e+=r));return t},mixin:Yr,default:tn});return Zr._=Zr,Zr}));
/**
 *    xbe4x is javascript implementation of the original ECMAScript for XML (E4X)
 *    Specification (ECMA-357) December 2005. This implementation is designed to emulate
 *    the implementation that is used in SpiderMonkey (Mozilla's JavaScript(TM) Engine)
 *    and therefore Firefox, Thunderbird, and most other Gecko based applications.
 *    Because the Mozilla implementation leaves out certain features of the
 *    specification, so does xbe4x. Please read the README file for a further
 *    explanation of these issues.
 *
 *
 *    @author Sam Shull <http://samshull.blogspot.com/>
 *    @version 0.1
 *
 *    @copyright Copyright (c) 2009 Sam Shull <http://samshull.blogspot.com/>
 *    @license <http://www.opensource.org/licenses/mit-license.html>
 *
 *    Permission is hereby granted, free of charge, to any person obtaining a copy
 *    of this software and associated documentation files (the "Software"), to deal
 *    in the Software without restriction, including without limitation the rights
 *    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *    copies of the Software, and to permit persons to whom the Software is
 *    furnished to do so, subject to the following conditions:
 *
 *    The above copyright notice and this permission notice shall be included in
 *    all copies or substantial portions of the Software.
 *
 *    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *    THE SOFTWARE.
 *
 *
 *    CHANGES:
 */

//this doesn't load if window.XML is already defined
if (!this.XML)
{
    (function ()
    {
        /*
         *
         *
         */
        var undefined, p,
            window                       = this,
            dns                          = [],
            defaultNamespace             = "",
            ELEMENT_NODE                 = 1,
            ATTRIBUTE_NODE               = 2,
            TEXT_NODE                    = 3,
            CDATA_SECTION_NODE           = 4,
            ENTITY_REFERENCE_NODE        = 5,
            ENTITY_NODE                  = 6,
            PROCESSING_INSTRUCTION_NODE  = 7,
            COMMENT_NODE                 = 8,
            DOCUMENT_NODE                = 9,
            DOCUMENT_TYPE_NODE           = 10,
            DOCUMENT_FRAGMENT_NODE       = 11,
            NOTATION_NODE                = 12,
            isNSDef                      = /^xmlns:([\w\-]+)/i,
            toString                     = ({}).toString,
            propertyIsEnumerable         = ({}).propertyIsEnumerable,
            hasOwnProperty               = ({}).hasOwnProperty,
            defaultXMLProperties         = ",prototype,ignoreComments,ignoreProcessingInstructions,ignoreWhitespace," +
                "prettyPrinting,prettyIndent,settings,defaultSettings,setSettings,settings," +
                "propertyIsEnumerable,hasOwnProperty,_setDefaultNamespace,",
            defaultXMLPrototype          = ",_Class,_Name,_Parent,_Value,_InScopeNamespaces,_Attributes,_Children,_Node",
            defaultXMLListPrototype      = ",_Class,_Value,_Children,_TargetObject,_TargetProperty",
            xmlDoc                       = parse("<x/>"),
            piName                       = /^[\w\-]+\s*/,
            XSLT_NS                      = "http://www.w3.org/1999/XSL/Transform";

        /**
         *
         *
         *    @param String | XML $string
         *    @returns XML
         *    @throws SyntaxError
         */
        function XML ($string)
        {
            if (!(this instanceof XML))
            {
                return ToXML($string);
            }

            var x, i, l;

            this._Class = "text";

            this._Name = null;

            this._Value = null;

            this._Parent = null;

            this._InScopeNamespaces = {};

            this._DefaultNamespace = null;

            this._Attributes = {};

            this._Children = [];

            this[0] = this;

            /**
             *
             *
             *
             */
            switch (typeof($string))
            {
                case "undefined":
                case "null":
                    break;
                case "number":
                case "boolean":    $string = ToString($string);
                case "string":

                    x = ToXML(trim($string));
                    if (x)
                    {
                        if (x.length() ===1)
                        {
                            this._Class = x._Class;
                            this._Name = x._Name;
                            this._Value = x._Value;
                            this._InScopeNamespaces = x._InScopeNamespaces;
                            this._DefaultNamespace = x._DefaultNamespace;
                            this._Attributes = x._Attributes;

                            for (i = 0, l = x._Children.length; i < l; ++i)
                            {
                                this._Children[i] = x._Children[i];
                                this._Children[i]._Parent = this;
                            }

                            break;
                        }
                    }

                    throw new SyntaxError();
                    break;
                default:
                    if ($string instanceof XML)
                    {
                        if ($string.length() ===1)
                        {
                            x = $string;
                            this._Class = x._Class;
                            this._Name = x._Name;
                            this._Value = x._Value;
                            this._InScopeNamespaces = x._InScopeNamespaces;
                            this._DefaultNamespace = x._DefaultNamespace;
                            this._Attributes = x._Attributes;

                            for (i = 0, l = x._Children.length; i < l; ++i)
                            {
                                this._Children[i] = x._Children[i];
                                this._Children[i]._Parent = this;
                            }
                        }
                    }
                    break;
            }
        }

        /**
         *    Ignore XML comments. (Default: true.)
         *
         *    @static
         *    @param Namespace ns
         *    @returns void
         */
        XML.setDefaultNamespace = function (ns)
        {
            dns.unshift(defaultNamespace || "");
            defaultNamespace = Namespace(ns);
            return null;
        };

        /**
         *  Use this function to restore the default namespace
         *  to the previous namespace
         *
         */
        XML.restoreDefaultNamespace = function ()
        {
            defaultNamespace = dns.shift() || "";
            return null;
        };

        /**
         *
         *
         *
         */
        XML.load = function (pathToFile, onload)
        {
            var xhr = isActiveXSupported("Microsoft.XMLHTTP") && new ActiveXObject("Microsoft.XMLHTTP") || new XMLHttpRequest(),
                async = ({}).toString.call(onload || {}) == "[object Function]";

            xhr.open("GET", pathToFile, async);

            if (async)
            {
                if (!!xhr.addEventListener)
                {
                    xhr.addEventListener("load", loaded, false);
                }
                else
                {
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState == 4 && xhr.status == 200)
                        {
                            loaded();
                        }
                    };
                }
            }

            xhr.send(null);

            return async ? xhr : loaded(1);

            function loaded (ret)
            {
                var x = new XML((xhr.responseText||"").replace(/\s*<\?xml.*?\?>/,""));
                return ret ? x : onload(x);
            }
        };

        /**
         *    Ignore XML comments. (Default: true.)
         *
         *    @static
         *    @var Boolean
         */
        XML.ignoreComments = true;

        /**
         *    Ignore XML processing instructions. (Default: true.)
         *
         *    @static
         *    @var Boolean
         */
        XML.ignoreProcessingInstructions = true;

        /**
         *    Ignore whitespace. (Default: true.)
         *
         *    @static
         *    @var Boolean
         */
        XML.ignoreWhitespace = true;

        /**
         *    Pretty-print XML output with toXMLString() etc. (Default: true.)
         *
         *    @static
         *    @var Boolean
         */
        XML.prettyPrinting = true;

        /**
         *    Pretty indent level for child nodes. (Default: 2.)
         *
         *    @static
         *    @var Number
         */
        XML.prettyIndent = 2;

        //There are also three methods to more easily apply and restore settings for use, say, within a function.

        /**
         *    Get an Object containing the above settings.
         *
         *    @static
         *    @returns Object
         */
        XML.settings = function ()
        {
            return {
                ignoreComments:                 XML.ignoreComments,
                ignoreProcessingInstructions:   XML.ignoreProcessingInstructions,
                ignoreWhitespace:               XML.ignoreWhitespace,
                prettyPrinting:                 XML.prettyPrinting,
                prettyIndent:                   XML.prettyIndent
            };
        };

        /**
         *    Get an object containing the default settings.
         *
         *    @static
         *    @returns Object
         */
        XML.defaultSettings = function ()
        {
            return {
                ignoreComments:                 true,
                ignoreProcessingInstructions:   true,
                ignoreWhitespace:               true,
                prettyPrinting:                 true,
                prettyIndent:                   2
            };
        };

        /**
         *    Set XML settings from, e.g., an object returned by XML.settings().
         *
         *
         *    @static
         *    @param Object settings
         *    @returns void
         */
        XML.setSettings = function (settings)
        {
            var p;
            settings = settings || XML.settings();
            for (p in settings)
            {
                switch (p)
                {
                    case "ignoreComments":                   XML.ignoreComments = !!settings[p];
                    case "ignoreProcessingInstructions":     XML.ignoreProcessingInstructions = !!settings[p];
                    case "ignoreWhitespace":                 XML.ignoreWhitespace = !!settings[p];
                    case "prettyPrinting":                   XML.prettyPrinting = !!settings[p];
                    case "prettyIndent":                     XML.prettyIndent = parseInt(settings[p]) || 0;
                }
            }
            return null;
        };

        /**
         *
         *
         *    @static
         *    @param String name
         *    @returns Boolean
         */
        XML.hasOwnProperty = function (name)
        {
            return defaultXMLProperties.indexOf("," + name + ",") ===-1
                && hasOwnProperty.call(XML, name);
        };

        /**
         *
         *
         *    @static
         *    @param String name
         *    @returns Boolean
         */
        XML.propertyIsEnumerable = function (name)
        {
            return name !== "prototype"
                && name in XML
                && toString.call(XML[name]) != "[object Function]"
                && propertyIsEnumerable.call(XML, name);
        };

        /**
         *
         *
         *    @static
         *    @returns String
         */
        XML.toString = function ()
        {
            return "function XML() {\n [native code] \n}";
        };

        /**
         *
         *
         *    @param String | Namespace namespace
         *    @returns XML
         */
        XML.prototype.addNamespace = function (namespace)
        {
            AddInScopeNamespace.call(this, Namespace(namespace));
            return this;
        };

        /**
         *
         *
         *    @param String child
         *    @returns XML
         */
        XML.prototype.appendChild = function (child,isChildElement)
        {
            isChildElement = isChildElement !== undefined ? isChildElement : false;
            var children = Get.call(this, "*");
            children.Put(children.length(), child,isChildElement);
            return this;
        };

        /**
         *
         *
         *    @param String | AttributeName | QName attributeName
         *    @returns XML
         */
        XML.prototype.attribute = function (attributeName)
        {
            return Get.call(this, ToAttributeName(attributeName), true);
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XML.prototype.attributes = function ()
        {
            return Get.call(this, ToAttributeName("*"));
        };

        /**
         *
         *
         *    @param String propertyName
         *    @returns XMLList
         */
        XML.prototype.child = function (propertyName)
        {
            var temporary;

            if (parseInt(propertyName)+"" == propertyName)
            {
                temporary = Get.call(this, "*");
                temporary = GetList.call(temporary, propertyName);
                return temporary || new XMLList();
            }

            temporary = ToXMLList( Get.call(this, propertyName) );

            return temporary;
        };

        /**
         *
         *
         *    @returns Number
         */
        XML.prototype.childIndex = function ()
        {
            var parent = this._Parent, q, l;

            if (!parent || this._Class === "attribute")
            {
                return -1;
            }

            for (q = 0, l = parent._Children.length; q < l; ++q)
            {
                if (parent._Children[q] === this)
                {
                    return q;
                }
            }

            return -1;
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XML.prototype.children = function ()
        {
            return Get.call(this, "*");
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XML.prototype.comments = function ()
        {
            var list = new XMLList(), i = 0, l = this._Children.length;
            list._TargetObject = this;
            list._TargetProperty = null;

            for (; i < l; ++i)
            {
                if (this._Children[i]._Class === "comment")
                {
                    list.Append(this._Children[i]);
                }
            }

            return list;
        };

        /**
         *
         *
         *    @param XML value
         *    @returns Boolean
         */
        XML.prototype.contains = function (value)
        {
            return this == value;
        };

        /**
         *
         *
         *    @returns XML
         */
        XML.prototype.copy = function ()
        {
            return DeepCopy.call(this);
        };

        /**
         *
         *
         *    @param String | QName name
         *    @returns XMLList
         */
        XML.prototype.descendants = function (name)
        {
            return Descendants.call(this, name || "*");
        };

        /**
         *
         *
         *    @param String | QName | AttributeName name
         *    @returns XMLList
         */
        XML.prototype.elements = function (name)
        {
            name = ToXMLName(name || "*");
            var list = new XMLList(), i = 0, l = this._Children.length;
            list._TargetObject = this;
            list._TargetProperty = name;

            for (; i < l; ++i)
            {
                if (
                    this._Children[i]._Class === "element"
                        && (name.localName === "*" || name.localName === this._Children[i]._Name.localName)
                        && (name.uri == null || name.uri === this._Children[i]._Name.uri)
                    )
                {
                    list.Append(this._Children[i]);
                }
            }

            return list;
        };

        /**
         *
         *
         *    @param String name
         *    @returns Boolean
         */
        XML.prototype.hasOwnProperty = function (name)
        {
            return HasProperty.call(this, name) || (defaultXMLPrototype.indexOf("," + name +",") === -1 && hasOwnProperty.call(this, name));
        };

        /**
         *
         *
         *    @returns Boolean
         */
        XML.prototype.hasComplexContent = function ()
        {
            if ((",attribute,comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
            {
                return false;
            }

            for (var i = 0, l = this._Children.length; i < l; ++i)
            {
                if (this._Children[i]._Class === "element")
                {
                    return true;
                }
            }

            return false;
        };

        /**
         *
         *
         *    @returns Boolean
         */
        XML.prototype.hasSimpleContent = function ()
        {
            if ((",comment,processing-instruction,").indexOf("," + this._Class + ",") > -1)
            {
                return false;
            }

            for (var i = 0, l = this._Children.length; i < l; ++i)
            {
                if (this._Children[i]._Class === "element")
                {
                    return false;
                }
            }

            return true;
        };

        /**
         *
         *
         *    @returns Array
         */
        XML.prototype.inScopeNamespaces = function ()
        {
            var y = this, inScopeNS = {}, p, a = [];

            while (y)
            {
                for (p in y._InScopeNamespaces)
                {
                    if (!inScopeNS[p])
                    {
                        inScopeNS[p] = y._InScopeNamespaces[p];
                    }
                }

                y = y.parent();
            }

            if (this._DefaultNamespace)
            {
                inScopeNS[""] = this._DefaultNamespace;
            }

            for (p in inScopeNS)
            {
                a[a.length] = inScopeNS[p];
            }

            return a;
        };

        /**
         *
         *
         *    @param XML child1
         *    @param XML child2
         *    @returns XML | null
         */
        XML.prototype.insertChildAfter = function (child1, child2)
        {
            if ((",attribute,comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            /*
             //this is disabled, because it doesn't work in
             //Firefox according to the spec
             if (!child2)
             {
             Insert.call(this, 0, child1);
             return this;
             }
             else if (!child1)
             {
             Insert.call(this, 0, child2);
             return this;
             }
             else
             */

            if (!child1){
                Insert.call(this, 0, child2);
                return this;
            }
            if (!child2){
                Insert.call(this, 0, child1);
                return this;
            }

            if (child1 instanceof XML)
            {
                Insert.call(this, child1.childIndex() + 1, child2);
                return this;
            }

            return null;
        };

        /**
         *
         *
         *
         *    @param XML child1
         *    @param XML child2
         *    @returns XML | null
         */
        XML.prototype.insertChildBefore = function (child1, child2)
        {
            if ((",attribute,comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            /*
             //this is disabled, because it doesn't work in
             //Firefox according to the spec
             if (!child1)
             {
             Insert.call(this, this._Children.length, child2);
             return this;
             }
             else if (!child2)
             {
             Insert.call(this, this._Children.length, child1);
             return this;
             }
             else
             */

            if (child1 instanceof XML)
            {
                Insert.call(this, child1.childIndex(), child2);
                return this;
            }

            return null;
        };

        /**
         *
         *
         *    @returns Number
         */
        XML.prototype.length = function ()
        {
            return 1;
        };

        /**
         *
         *
         *    @returns String | null
         */
        XML.prototype.localName = function ()
        {
            return this._Name === null ? null : this._Name.localName;
        };

        /**
         *
         *
         *    return QName
         */
        XML.prototype.name = function ()
        {
            return this._Name;
        };

        /**
         *
         *
         *    @param String prefix
         *    @returns Namespace
         */
        XML.prototype.namespace = function (prefix)
        {
            var y = this, inScopeNS = {}, p;

            while (y)
            {
                for (p in y._InScopeNamespaces)
                {
                    if (!inScopeNS[p])
                    {
                        inScopeNS[p] = y._InScopeNamespaces[p];
                    }
                }

                y = y.parent();
            }

            if (prefix === undefined)
            {
                if ((",comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
                {
                    return null;
                }

                return GetNamespace(this._Name, inScopeNS);
            }

            prefix = ToString(prefix);

            for (p in inScopeNS)
            {
                if (inScopeNS[p].prefix === prefix)
                {
                    return inScopeNS[p];
                }
            }

            return null;
        };

        /**
         *
         *
         *    @returns Array
         */
        XML.prototype.namespaceDeclarations = function ()
        {
            if ((",attribute,comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
            {
                return [];
            }

            var a = [], y = this._Parent, ancestorNS = {}, p;

            while (y)
            {
                for (p in y._InScopeNamespaces)
                {
                    if (!ancestorNS[p])
                    {
                        ancestorNS[p] = y._InScopeNamespaces[p];
                    }
                }

                y = y._Parent;
            }

            for (p in this._InScopeNamespaces)
            {
                if (p != "" && (!ancestorNS[p] || ancestorNS[p].uri != this._InScopeNamespaces[p]))
                {
                    a[a.length] = this._InScopeNamespaces[p];
                }
                else if(p === "" && !this._Parent)
                {
                    a[a.length] = this._InScopeNamespaces[p];
                }
            }

            return a;
        };

        /**
         *
         *
         *    @returns String
         */
        XML.prototype.nodeKind = function ()
        {
            return this._Class;
        };

        /**
         *
         *
         *    @returns XML
         */
        XML.prototype.normalize = function ()
        {
            for (var i = 0, l = this._Children.length; i < l;)
            {
                if (this._Children[i]._Class === "element")
                {
                    this._Children[i].normalize();
                    ++i;
                }
                else if (this._Children[i]._Class === "text")
                {
                    while (i+1 < this._Children.length && this._Children[i+1]._Class === "text")
                    {
                        this._Children[i]._Value = (this._Children[i]._Value || "") + (this._Children[i+1]._Value || "");
                        DeleteByIndex.call(this, i+1);
                    }

                    if (this._Children[i]._Value.length === 0)
                    {
                        DeleteByIndex.call(this, i);
                    }
                    else
                    {
                        ++i;
                    }
                }
                else
                {
                    ++i;
                }
            }

            return this;
        };

        /**
         *
         *
         *    @returns XML | null
         */
        XML.prototype.parent = function ()
        {
            return this._Parent;
        };

        /**
         *
         *
         *    @param String name
         *    @returns XMLList
         */
        XML.prototype.processingInstructions = function (name)
        {
            name = ToXMLName(name || "*");

            var list = new XMLList(), i = 0, l = this._Children.length;
            list._TargetObject = this;
            list._TargetProperty = null;

            for (; i < l; ++i)
            {
                if (this._Children[i]._Class === "processing-instruction"
                    && (name.localName === "*" || name.localName === this._Children[i]._Name.localName)
                    )
                {
                    list.Append(this._Children[i]);
                }
            }

            return list;
        };

        /**
         *
         *
         *    @param XML value
         *    @returns XML
         */
        XML.prototype.prependChild = function (value)
        {
            Insert.call(this, 0, value);
            return this;
        };


        XML.prototype.findFirstElement = function (value)
        {
            var list = [];
            list = this.elements(value)._Children;
            if(list.length == 0){
                var children = this.children();
                var xml;
                for(var i=0;i<children.length();i++){
                    xml = children[i];
                    var sublist = xml.findFirstElement(value);
                    if(sublist.length>0)
                        return sublist;
                }
            }
            return list;
        };


        /**
         *
         *
         *    @param String name
         *    @returns Boolean
         */
        XML.prototype.propertyIsEnumerable = function (name)
        {
            return name == "0";
        };

        /**
         *
         *
         *    @param Namespace | String namespace
         *    @returns XML
         */
        XML.prototype.removeNamespace = function (namespace)
        {
            if ((",attribute,comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
            {
                return this;
            }

            var ns = Namespace(namespace), thisNS = GetNamespace(this._Name, this._InScopeNamespaces), p, l;

            if (thisNS == ns)
            {
                return this;
            }

            /*
             //firefox does not remove the references to the
             //namespaces in attributes -- so we wont either
             for (p in this._Attributes)
             {
             if (GetNamespace(this._Attributes[p]._Name, this._InScopeNamespaces).uri == ns.uri)
             {
             this._Attributes[p]._Name = new QName(ns, this._Attributes[p].localName());
             }
             }
             //*/

            if (ns.prefix == undefined)
            {
                for (p in this._InScopeNamespaces)
                {
                    if (this._InScopeNamespaces[p].uri === ns.uri)
                    {
                        try{
                            this._InScopeNamespaces[p] = null;
                            delete this._InScopeNamespaces[p];
                        }catch(e){}
                    }
                }
            }
            else if (this._InScopeNamespaces[ns.prefix] && this._InScopeNamespaces[ns.prefix].uri === ns.uri)
            {
                try{
                    this._InScopeNamespaces[ns.prefix] = null;
                    delete this._InScopeNamespaces[ns.prefix];
                }catch(e){}
            }

            for (p = 0, l = this._Children.length; p < l; ++p)
            {
                if (this._Children[p]._Class === "element")
                {
                    this._Children[p].removeNamespace(ns);
                }
            }

            return this;
        };

        /**
         *
         *
         *    @param String propertyName
         *    @param XML value
         *    @returns XML
         */
        XML.prototype.replace = function (propertyName, value)
        {
            if ((",attribute,comment,processing-instruction,text,").indexOf("," + this._Class + ",") > -1)
            {
                return this;
            }

            var c = value instanceof XML ? DeepCopy.call(value) : ToString(value), n, i, k;

            if (parseInt(propertyName)+"" == propertyName)
            {
                Replace.call(this, propertyName, c);
                return this;
            }

            /*
             Basically Firefox does not appear to follow the rules set forth in the spec
             so, we are just going to fix this so that we do what firefox does
             if the propertyName is not an integer:
             if value is a XMLList setChildren
             otherwise do nothing
             */

            if (c instanceof XMLList)
            {
                this.setChildren(c);
            }

            return this;

            /*
             Leave the rest of these rules in place, just in case
             */

            n = QName(propertyName);
            k = this._Children.length;

            while (--k > -1)
            {
                if (
                    (n.localName === "*" || (this._Children[k]._Class === "element" && this._Children[k]._Name.localName===n.localName))
                        && (n.uri == null || (this._Children[k]._Class === "element" && n.uri === this._Children[k]._Name.uri ))
                    )
                {
                    if (i !== undefined)
                    {
                        DeleteByIndex.call(this, i);
                    }

                    i = k;
                }
            }

            if (i !== undefined)
            {
                Replace.call(this, i, c);
            }

            return this;
        };

        /**
         *
         *
         *    @param XML value
         *    @returns XML
         */
        XML.prototype.setChildren = function (value)
        {
            this.Put("*", value);
            return this;
        };

        /**
         *
         *
         *    @param String name
         *    @returns void
         */
        XML.prototype.setLocalName = function (name)
        {
            if ((",comment,text,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            this._Name.localName = name instanceof QName ? name.localName : ToString(name);
        };

        /**
         *
         *
         *    @param QName | String name
         *    @returns null
         */
        XML.prototype.setName = function (name)
        {
            if ((",comment,text,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            if (name instanceof QName && name.uri == null)
            {
                name = name.localName;
            }

            var n = QName(name);

            if (this._Class === "processing-instruction")
            {
                n.uri = "";
            }

            this._DefaultNamespace = new Namespace(n.prefix, n.uri);

            this._Name = n;

            if (this._Class === "attribute")
            {
                if (this._Parent)
                {
                    AddInScopeNamespace.call(this._Parent, this._DefaultNamespace);
                }
            }
            else if (this._Class === "element")
            {
                AddInScopeNamespace.call(this, this._DefaultNamespace);
            }
            else if ((",comment,text,processing-instruction,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            this._Name = new QName(this._DefaultNamespace, this._Name.localName);

            return null;
        };

        /**
         *
         *
         *    @param Namespace | String ns
         *    @returns null
         */
        XML.prototype.setNamespace = function (ns)
        {
            //processing-instruction,
            if ((",comment,text,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            this._DefaultNamespace = Namespace(ns);

            this._Name = new QName(this._DefaultNamespace, this._Name.localName);

            if (this._Class === "attribute")
            {
                if (this._Parent)
                {
                    AddInScopeNamespace.call(this._Parent, this._DefaultNamespace);
                }
            }
            else if (this._Class === "element")
            {
                AddInScopeNamespace.call(this, this._DefaultNamespace);
            }

            return null;
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XML.prototype.text = function ()
        {
            var list = new XMLList(), i = 0, l = this._Children.length;
            list._TargetObject = this;
            list._TargetProperty = null;

            for (; i < l; ++i)
            {
                if (this._Children[i]._Class === "text")
                {
                    list.Append(this._Children[i]);
                }
            }

            return list;
        };

        /**
         *
         *
         *    @returns String
         */
        XML.prototype.toString = function ()
        {
            return ToString(this);
        };

        /**
         *
         *
         *    @returns String
         */
        XML.prototype.toXMLString = function ()
        {
            return ToXMLString(this);
        };

        /**
         *
         *
         *    @returns XML
         */
        XML.prototype.valueOf = function ()
        {
            return this;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @param XML | String Value
         *    @returns null
         *    @throws TypeError
         */
        XML.prototype.Put = function (PropertyName, Value)
        {
            if (parseInt(PropertyName)+"" == PropertyName)
            {
                throw new TypeError();
            }

            if ((",text,comment,processing-instruction,attribute,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            var c = (!(Value instanceof XML) || (",text,attribute,").indexOf("," + Value._Class+",") > -1)
                    ? ToString(Value)
                    : DeepCopy.call(Value),
                n = ToXMLName(PropertyName),
                s, i, l, a = null, primitiveAssign, k;

            if (n instanceof AttributeName)
            {
                if (!isXMLName(n._Name))
                {
                    return false;
                }

                if (c instanceof XMLList)
                {
                    if (c._Children.length === 0)
                    {
                        c = "";
                    }
                    else
                    {
                        s = ToString(c[0]);

                        for (i = 1, l = c._Children.length; i < l; ++i)
                        {
                            s += " " + ToString(c[i]);
                        }

                        c = s;
                    }
                }
                else
                {
                    c = ToString(c);
                }

                for (i in this._Attributes)
                {
                    if (
                        (n._Name.localName === this._Attributes[i]._Name.localName)
                            && (n._Name.uri === null || n._Name.uri === this._Attributes[i]._Name.uri)
                        )
                    {
                        if (a == null)
                        {
                            a = this._Attributes[i];
                        }
                        else
                        {
                            this.Delete(this._Attributes[i]._Name);
                        }
                    }
                }

                if (a == null)
                {
                    a = new XML();
                    a._Parent = this;
                    a._Class = "attribute";
                    a._Name = n._Name.uri == null
                        ? new QName(new Namespace(), n._Name)
                        : new QName(new Namespace(n._Name.uri), n._Name.localName);

                    this._Attributes[(a._Name._Prefix ? a._Name._Prefix + ":" : "") + a._Name.localName] = a;

                    AddInScopeNamespace.call(this, GetNamespace(a._Name));
                }

                a._Value = c;

                return null;
            }

            if (!isXMLName(n) && n.localName != "*")
            {
                return null;
            }

            i = undefined;

            primitiveAssign = !(c instanceof XML) && n.localName != "*";

            for (k = 0, l = this._Children.length; k < l; ++k)
            {
                if (
                    (n.localName === "*" || (this._Children[k]._Class === "element" && this._Children[k]._Name.localName===n.localName))
                        &&
                        (n.uri == null || (this._Children[k]._Class === "element" && n.uri === this._Children[k]._Name.uri))
                    )
                {
                    if (i != undefined)
                    {
                        DeleteByIndex.call(this, ToString(i));
                    }
                    else
                    {
                        i = k;
                    }
                }
            }

            if (i == undefined)
            {
                i = this._Children.length;

                if (primitiveAssign)
                {
                    a = new XML();
                    a._Class = "element";
                    a._Parent = this;
                    a._Name = n.uri == null
                        ? new QName(GetDefaultNamespace(), n)
                        : new QName(n);

                    Replace.call(this, ToString(i), a);

                    AddInScopeNamespace.call(a, GetNamespace(a._Name));
                }
            }

            if (primitiveAssign)
            {
                s = ToString(c);

                if (s != "")
                {
                    Replace.call(this._Children[i], "0", s);
                }
            }
            else
            {
                Replace.call(this, ToString(i), c);
            }

            return null;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @returns null
         *    @throws TypeError
         */
        XML.prototype.Delete = function (PropertyName)
        {
            if (parseInt(PropertyName)+"" == PropertyName)
            {
                throw new TypeError();
            }

            var n = ToXMLName(PropertyName), k, dp = 0, q = 0, l;

            if (n instanceof AttributeName)
            {
                for (k in this._Attributes)
                {
                    if (
                        (n._Name.localName === "*" || n._Name.localName === this._Attributes[k]._Name.localName)
                            &&
                            (n._Name.uri == null || n._Name.uri === this._Attributes[k]._Name.uri)
                        )
                    {
                        this._Attributes[k]._Parent = null;
                        try{
                            delete this._Attributes[k];
                        }catch(e){}
                    }
                }

                return true;
            }

            for (l = this._Children.length; q < l; ++q)
            {
                if (
                    (n.localName === "*" || (this._Children[q]._Class === "element" && this._Children[q]._Name.localName === n.localName))
                        &&
                        (n.uri == null || (this._Children[q]._Class === "element" && n.uri === this._Children[q]._Name.uri))
                    )
                {
                    DeleteByIndex.call(this, q);
                    ++dp;
                }
                else if (dp > 0)
                {
                    this._Children[q - dp] = this._Children[q];
                }
            }


            return true;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param XML Value
         *    @returns Boolean
         */
        XML.prototype.Equals = function (Value)
        {
            if (!(Value instanceof XML))
            {
                return false;
            }
            if (this._Class !== Value._Class)
            {
                return false;
            }
            if (this._Children.length !== Value._Children.length)
            {
                return false;
            }
            if (this._Value !== Value._Value)
            {
                return false;
            }
            if (this._Name !== null)
            {
                if (Value._Name === null)
                {
                    return false;
                }
                if (Value._Name.localName !== this._Name.localName)
                {
                    return false;
                }
                if (Value._Name.uri !== this._Name.uri)
                {
                    return false;
                }
            }
            else if (Value._Name !== null)
            {
                return false;
            }

            if (count(this._Attributes) !== count(Value._Attributes))
            {
                return false;
            }

            var a, b, k, l;

            for (k in this._Attributes)
            {
                a = this._Attributes[k];

                b = Value._Attributes[k];

                if (!b || b._Name.localName !== a._Name.localName || b._Name.uri !== a._Name.uri || b._Value !== a._Value)
                {
                    return false;
                }
            }

            for (k = 0, l = this._Children.length; k < l; ++k)
            {
                a = this._Children[k];

                b = Value._Children[k];

                if (!arguments.callee.call(a, b))
                {
                    return false;
                }
            }

            return true;
        };

        //extensions

        /*
         * e4x.js
         *
         * A JavaScript library that implements the optional E4X features described in
         * ECMA-357 2nd Edition Annex A if they are not already implemented.
         *
         * 2010-03-13
         *
         * By Elijah Grey, http://eligrey.com
         * License: The X11/MIT license (see COPYING.md)
         *
         * Changes:
         *    By Sam Shull, http://samshull.blogspot.com
         *    Just a litlle simplifying for implementation
         */

        /*global document, XML, XMLList, DOMParser, XMLSerializer, XPathResult */

        /*jslint undef: true, nomen: true, eqeqeq: true, bitwise: true, regexp: true,
         newcap: true, immed: true, maxerr: 1000, maxlen: 90 */

        /**
         *
         *
         *
         */
        XML.prototype.domNode = function ()
        {
            return adoptNode(document, xmlToDomNode(this));
        };

        /**
         *
         *
         *
         */
        XML.prototype.domNodeList = function ()
        {
            if (this.length() < 0)
            {
                throw new Error();
            }

            return adoptNode(document, createDocumentFrom(this).documentElement).childNodes;
        };

        /**
         *
         *
         *
         */
        XML.prototype.xpath = function (xpathExp)
        {
            var res = new XMLList,
                i = 0, l = this.length(),
                xpr;

            if (l !== 1)
            {
                for (; i < l; ++i)
                {
                    res.Append(this[i].xpath(xpathExp));
                }

                return res;
            }

            xpr = evaluate(createDocumentFrom(this), xpathExp, this);

            for (l=xpr.length; i < l; ++i)
            {
                res.Append(ToXML(xpr[i]));
            }

            return res;
        };

        /**
         *
         *
         *
         */
        XML.prototype.transform = function (xslt, params)
        {
            if (!xslt instanceof XML)
            {
                throw new TypeError();
            }

            var doc, res, i, l = this.length(), c;

            if (l > 1)
            {
                res = new XMLList();
                for (i = 0; i < l; ++i)
                {
                    res.Append(this[i].transform(xslt, params));
                }
                return res;
            }

            return transform(this, xslt, params);
        };

        /**
         *
         *
         *    @returns XMLList
         */
        function XMLList ($string)
        {
            if (!(this instanceof XMLList))
            {
                return ToXMLList($string || "");
            }

            this._Class = "XMLList";

            this._Value = undefined;


            this._TargetObject = null;

            this._TargetProperty = null;

            this._Children = [];

            this[0] = null;

            if ($string)
            {
                var list = ToXMLList($string), i = 0, l = list._Children.length;
                this._Value = list._Value;

                for (;i < l; ++i)
                {
                    this._Children[i] = this[i] = list._Children[i];
                }
            }
        }

        /**
         *
         *
         *    @static
         *    @returns String
         *    @throws TypeError
         */
        XMLList.toString = function ()
        {
            return "function XMLList() {\n [native code] \n}";
        };

        XMLList.prototype = new XML();

        var ignore = {xpath:1,domNodeList:1,transform:1};

        for (p in XMLList.prototype)
        {
            if (ignore[p])
            {
                continue;
            }

            XMLList.prototype[p] = (function(p)
            {
                return function ()
                {
                    if (this._Children.length != 1)
                    {
                        throw new TypeError("cannot call " + p + " method on an XML list with " + this._Children.length + " elements");
                    }

                    return XML.prototype[p].apply(this[0], arguments);
                };
            })(p);
        }

        try{
            delete XMLList.prototype._Attributes;
            delete XMLList.prototype._InScopeNamespaces;
        }catch(e){}

        /**
         *
         *
         *    @param String | AttributeName attributeName
         *    @returns XMLList
         */
        XMLList.prototype.attribute = function (attributeName)
        {
            return GetList.call(this, ToAttributeName(attributeName));
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.attributes = function ()
        {
            return GetList.call(this, ToAttributeName("*"));
        };

        /**
         *
         *
         *    @param String | QName propertyName
         *    @returns XMLList
         */
        XMLList.prototype.child = function (propertyName)
        {
            var list = new XMLList(), i = 0, l = this._Children.length, r;
            list._TargetObject = this;

            for (; i < l; ++i)
            {
                r = this[i].child(propertyName);

                if (r._Children.length > 0)
                {
                    list.Append(r);
                }
            }

            return list;
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.children = function ()
        {
            return GetList.call(this, "*");
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.comments = function ()
        {
            var list = new XMLList(), i = 0, l = this._Children.length, r;
            list._TargetObject = this;

            for (; i < l; ++i)
            {
                if (this[i]._Class === "element")
                {
                    r = this[i].comments();

                    if (r._Children.length > 0)
                    {
                        list.Append(r);
                    }
                }
            }

            return list;
        };

        /**
         *
         *
         *    @param XML value
         *    @returns Boolean
         */
        XMLList.prototype.contains = function (value)
        {
            for (var i = 0, l = this._Children.length; i < l; ++i)
            {
                if (this[i] == value)
                {
                    return true;
                }
            }

            return false;
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.copy = function ()
        {
            return DeepCopyList.call(this);
        };

        /**
         *
         *
         *    @param String | QName name
         *    @returns XMLList
         */
        XMLList.prototype.descendants = function (name)
        {
            return DescendantsList.call(this, name || "*");
        };

        /**
         *
         *
         *    @param String | QName name
         *    @returns XMLList
         */
        XMLList.prototype.elements = function (name)
        {
            name = ToXMLName(name || "*");
            var list = new XMLList(), i = 0, l = this._Children.length, r;
            list._TargetObject = this;
            list._TargetProperty = name;

            for (; i < l; ++i)
            {
                if (this[i]._Class === "element")
                {
                    r = this[i].elements(name);

                    if (r._Children.length > 0)
                    {
                        list.Append(r);
                    }
                }
            }

            return list;
        };

        /**
         *
         *
         *    @param String name
         *    @returns Boolean
         */
        XMLList.prototype.hasOwnProperty = function (name)
        {
            return HasProperty.call(this, name)
                || (defaultXMLListProperties.indexOf("," + name + ",") === -1 && hasOwnProperty.call(this, name));
        };

        /**
         *
         *
         *    @returns Boolean
         */
        XMLList.prototype.hasComplexContent = function ()
        {
            if (this._Children.length === 0)
            {
                return false;
            }

            if (this._Children.length === 1)
            {
                return this[0].hasComplexContent();
            }

            for (var i = 0, l = this._Children.length; i < l; ++i)
            {
                if (this._Children[i]._Class === "element")
                {
                    return true;
                }
            }

            return false;
        };

        /**
         *
         *
         *    @returns Boolean
         */
        XMLList.prototype.hasSimpleContent = function ()
        {
            if (this._Children.length === 1)
            {
                return this[0].hasSimpleContent();
            }

            for (var i = 0, l = this._Children.length; i < l; ++i)
            {
                if (this._Children[i]._Class === "element")
                {
                    return false;
                }
            }

            return true;
        };

        /**
         *
         *
         *    @returns Number
         */
        XMLList.prototype.length = function ()
        {
            return this._Children.length;
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.normalize = function ()
        {
            for (var i = 0, l = this._Children.length; i < l;)
            {
                if (this[i]._Class === "element")
                {
                    this[i].normalize();
                    ++i;
                }
                else if (this[i]._Class === "text")
                {
                    while (i+1 < this._Children.length && this[i+1]._Class === "text")
                    {
                        this[i]._Value = (this[i]._Value || "") + (this[i+1]._Value || "");
                        this.Delete(i+1);
                    }

                    if (this[i]._Value.length === 0)
                    {
                        this.Delete(i);
                    }
                    else
                    {
                        ++i;
                    }
                }
                else
                {
                    ++i;
                }
            }

            return this;
        };

        /**
         *
         *
         *    @returns XML | undefined
         */
        XMLList.prototype.parent = function ()
        {
            if (this._Children.length === 0)
            {
                return undefined;
            }

            for (var parent = this[0]._Parent, i = 1, l = this._Children.length; i < l; ++i)
            {
                if (this[i]._Parent != parent)
                {
                    return undefined;
                }
            }

            return parent;
        };

        /**
         *
         *
         *    @param String | QName name
         *    @returns XMLList
         */
        XMLList.prototype.processingInstructions = function (name)
        {
            name = ToXMLName(name || "*");
            var list = new XMLList(), i = 0, l = this._Children.length, r;
            list._TargetObject = this;

            for (; i < l; ++i)
            {
                if (this[i]._Class === "element")
                {
                    r = this[i].processingInstructions(name);

                    if (r._Children.length > 0)
                    {
                        list.Append(r);
                    }
                }
            }

            return list;
        };

        /**
         *
         *
         *    @param String | Number name
         *    @returns Boolean
         */
        XMLList.prototype.propertyIsEnumerable = function (name)
        {
            return parseInt(name) > 0 && parseInt(name) < this._Children.length;
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.text = function ()
        {
            var list = new XMLList(), i = 0, l = this._Children.length, r;
            list._TargetObject = this;

            for (; i < l; ++i)
            {
                if (this[i]._Class === "element")
                {
                    r = this[i].text();

                    if (r._Children.length > 0)
                    {
                        list.Append(r);
                    }
                }
            }

            return list;
        };

        /**
         *
         *
         *    @returns String
         */
        XMLList.prototype.toString = function ()
        {
            return ToString(this);
        };

        /**
         *
         *
         *    @returns String
         */
        XMLList.prototype.toXMLString = function ()
        {
            return ToXMLString(this);
        };

        /**
         *
         *
         *    @returns XMLList
         */
        XMLList.prototype.valueOf = function ()
        {
            return this;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param String | Number | QName PropertyName
         *    @param XML Value
         *    @param isElement
         *    @returns null
         */
        XMLList.prototype.Put = function (PropertyName, Value,isChildElement)
        {
            isChildElement = isChildElement !== undefined ? isChildElement : false;
            var i = parseInt(PropertyName), r, y, l, z, parent, c, j = 0, q, t;

            if (i+"" == PropertyName)
            {
                r = ResolveValue.call(this._TargetObject);
                /* Firefox doesn't do this
                 if (r == null)
                 {
                 return null;
                 }
                 */
                if (i >= this._Children.length)
                {
                    if (r instanceof XMLList)
                    {
                        if (r.length() != 1)
                        {
                            return null;
                        }

                        r = r[0];
                    }

                    /* Firefox doesn't do this
                     if (r._Class != "element")
                     {
                     return null;
                     }
                     */
                    y = new XML();
                    y._Parent = r;
                    y._Name = this._TargetProperty;
                    y._Attributes = {};

                    if (this._TargetProperty instanceof AttributeName)
                    {
                        if (!!r && Get.call(r, y._Name).length() > 0)
                        {
                            return null;
                        }

                        y._Class = "attribute";
                    }
                    else if (!isChildElement && (this._TargetProperty == null || this._TargetProperty.localName === "*"))
                    {
                        y._Name = null;
                        y._Class = "text";
                    }
                    else
                    {
                        y._Class = "element";
                    }

                    if (y._Class != "attribute")
                    {
                        if (r)
                        {
                            j = 0;

                            if (i > 0)
                            {
                                while (j < r._Children.length-1 && r[j] !== this[i-1])
                                {
                                    ++j;
                                }
                            }
                            else
                            {
                                j = r._Children.length - 1;
                            }

                            Insert.call(r, j+1, y);
                        }

                        if (Value instanceof XMLList)
                        {
                            y._Name = Value._TargetProperty;
                        }
                        else if (Value instanceof XML)
                        {
                            y._Name = Value._Name;
                        }
                    }

                    this.Append(y);
                }

                if (!(Value instanceof XML) || Value._Class === "text" || Value._Class === "attribute")
                {
                    Value = ToString(Value);
                }

                if (this[i]._Class === "attribute")
                {
                    z = ToAttributeName(this[i]._Name);
                    this[i]._Parent.Put(z, Value);
                    this[i] = this[i]._Parent.attribute(z)[0];
                }
                else if (Value instanceof XMLList)
                {
                    //shallow copy?
                    c = Value;
                    parent = this[i]._Parent;

                    if (parent)
                    {
                        q = this[i].childIndex();
                        Replace.call(parent, q, c);
                        for (j = 0, l = c._Children.length; j < l; ++j)
                        {
                            c._Children[j] = c[j] = parent._Children[q+j];
                        }
                    }

                    if (c._Children.length === 0)
                    {
                        for (j = i + 1, l = this._Children.length; j < l; ++j)
                        {
                            this._Children[j-1] = this[j-1] = this[j]
                        }
                    }
                    else
                    {
                        for (j = this._Children.length; j > i; --j)
                        {
                            z = ToString(j + c._Children.length - 1);
                            this._Children[z] = this[z] = this[j];
                        }
                    }

                    for (j = 0, l = c._Children.length; j < l; ++j)
                    {
                        this._Children[i+j] = this[i+j] = c[j];
                    }

                }
                else if (Value instanceof XML || (",text,comment,processing-instruction").indexOf("," + this[i]._Class+",") > -1)
                {
                    parent = !!this[i] && this[i]._Parent;

                    if(parent)
                    {
                        q = this[i].childIndex();
                        Replace.call(parent, q, Value);
                        Value = parent._Children[q];
                    }

                    if (toString.call(Value) === "[object String]")
                    {
                        t = ToXML(Value);
                        t._Parent = this;
                        this._Children[i] = this[i] = t;
                    }
                    else
                    {

                    }
                }
                else
                {
                    this.Append(XMLList(Value));
                }
            }
            /* Firefox doesn't do this
             else if (this.length() <= 1)
             {
             if (this.length() === 0)
             {
             r = ResolveValueList.call(this);

             if (r == null || r.length() != 1)
             {
             return null;
             }

             this.Append(r);
             }
             else
             {
             this[0].Put(PropertyName, Value);
             }
             }*/

            return null;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param String | Number | QName PropertyName
         *    @returns null
         */
        XMLList.prototype.Delete = function (PropertyName)
        {
            var i = parseInt(PropertyName), parent, q, l;

            if (i+"" == PropertyName)
            {
                if (i >= this._Children.length)
                {
                    return true;
                }

                parent = this[i]._Parent;

                if (parent)
                {
                    if (this[i]._Class = "attribute")
                    {
                        parent.Delete(ToAttributeName(this[i]._Name));
                    }
                    else
                    {
                        DeleteByIndex.call(parent, this[i].childIndex());
                    }
                }

                try{
                    this._Children.splice(PropertyName,1);
                    delete this[PropertyName];
                }catch(e){}

                for (q = i + 1, l = this._Children.length; q < l; ++q)
                {
                    this._Children[q-1] = this[q-1] = this[q];
                }
                return true;
            }
            /* Firefox won't do this
             for (q = 0, l = this._Children.length; q < l; ++q)
             {
             if (this[q]._Class === "element")
             {
             this[q].Delete(PropertyName);
             }
             }
             */
            return true;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param XML Value
         *    @returns null
         */
        XMLList.prototype.Append = function (Value)
        {
            if (!(Value instanceof XML))
            {
                return null;
            }

            var i = this._Children.length, n = 1, j = 0;

            if (Value instanceof XMLList)
            {
                n = Value._Children.length;

                if (n == 0)
                {
                    return null;
                }

                this._TargetObject = Value._TargetObject;
                this._TargetProperty = Value._TargetProperty;

                for (;j < n; ++j)
                {
                    this._Children[i+j] = this[i+j] = Value[j];
                }
            }
            else
            {
                this._Children[i] = this[i] = Value;
            }

            return null;
        };

        /**
         *
         *
         *
         *    @access private
         *    @param XML Value
         *    @returns Boolean
         */
        XMLList.prototype.Equals = function (Value)
        {
            if (Value == undefined && this._Children.length === 0)
            {
                return true;
            }
            else if (Value instanceof XMLList && Value._Children.length === this._Children.length)
            {
                for (var i = 0, l = this._Children.length; i < l; ++i)
                {
                    if (!this[i].Equals(Value[i]))
                    {
                        return false;
                    }
                }
            }
            else if (this._Children.length === 1)
            {
                return this[0].Equals(Value);
            }

            return false;
        };

        /**
         *
         *
         *
         *    @access private
         *    @returns XMLList
         */
        function ResolveValueList ()
        {
            if (this._Children.length > 0)
            {
                return this;
            }

            if (this._TargetObject == null
                || this._TargetProperty == null
                || this._TargetProperty instanceof AttributeName
                || this._TargetProperty.localName === "*"
                )
            {
                return null;
            }

            var base = ResolveValue.call(this._TargetObject), target;

            if (base == null)
            {
                return null;
            }

            target = Get.call(base, this._TargetProperty);

            if (target._Children.length === 0)
            {
                if (base instanceof XMLList && base._Children.length > 1)
                {
                    return null;
                }

                base.Put(this._TargetProperty, "");

                target = Get.call(base, this._TargetProperty);
            }

            return target;
        };

        /**
         *
         *
         *    @param String | Namespace | QName prefix
         *    @param String uri
         *    @returns Namespace
         *    @throws TypeError
         */
        function Namespace (prefix, uri)
        {
            if (!(this instanceof Namespace))
            {
                return prefix && prefix instanceof Namespace
                    ? prefix
                    : new Namespace(prefix, uri);
            }

            if (uri === undefined && prefix === undefined)
            {
                this.prefix = "";
                this.uri = "";
            }
            else if (uri === undefined)
            {
                uri = prefix;
                prefix = undefined;

                if (uri instanceof Namespace)
                {
                    this.prefix = uri.prefix;
                    this.uri = uri.uri;
                }
                else if (uri instanceof QName && uri.uri !== null)
                {
                    this.uri = uri.uri;
                }
                else
                {
                    this.uri = ToString(uri);

                    if (this.uri == "")
                    {
                        this.prefix = "";
                    }
                }
            }
            else
            {
                if (uri instanceof QName)
                {
                    this.uri = uri.uri;
                }
                else
                {
                    this.uri = ToString(uri);
                }

                if (this.uri === "")
                {
                    if (prefix === undefined || ToString(prefix) === "")
                    {
                        this.prefix = "";
                    }
                    else
                    {
                        throw new TypeError("cannot define the prefix for an empty uri");
                    }
                }
                else if (prefix === undefined)
                {
                    this.prefix = undefined;
                }
                else
                {
                    this.prefix = ToString(prefix);
                }
            }
        }

        /**
         *
         *
         *    @var String
         */
        Namespace.prototype.prefix = undefined;

        /**
         *
         *
         *    @var String
         */
        Namespace.prototype.uri = undefined;

        /**
         *
         *
         *    @returns String
         */
        Namespace.prototype.toString = function ()
        {
            return this.uri;
        };

        /**
         *
         *
         *    @param Namespace | String | QName NameSpace
         *    @param String
         *    @returns QName
         */
        function QName (NameSpace, Name)
        {
            if (!(this instanceof QName))
            {
                return NameSpace instanceof QName
                    ? NameSpace
                    : new QName(NameSpace, Name);
            }

            if (Name === undefined)
            {
                Name = NameSpace;
                NameSpace = undefined;
            }

            if (Namespace instanceof QName)
            {
                if (Name === undefined)
                {
                    Name = Name.localName;
                }
            }

            Name = Name === undefined || Name === null
                ? ""
                : ToString(Name);

            if (NameSpace === undefined)
            {
                NameSpace = Name === "*" ? null : GetDefaultNamespace();
            }

            this.localName = Name;

            if (NameSpace == null)
            {
                this.uri = null;
            }
            else
            {
                NameSpace = Namespace(NameSpace);
                this.uri = NameSpace.uri;
                this._Prefix = NameSpace.prefix;
            }
        }

        /**
         *
         *
         *    @var String
         */
        QName.prototype.localName = undefined;

        /**
         *
         *
         *    @var String
         */
        QName.prototype.uri = undefined;

        /**
         *
         *
         *    @param Object InScopeNamespaces
         *    @returns Namespace
         *    @throws TypeError
         */
        function GetNamespace (q, InScopeNamespaces)
        {
            if(!q)
                 return new Namespace();
            if (q.uri === null)
            {
                throw new TypeError();
            }

            InScopeNamespaces = InScopeNamespaces || {};

            var ns, p;

            for (p in InScopeNamespaces)
            {
                if (q.uri === InScopeNamespaces[p].uri)
                {
                    ns = InScopeNamespaces[p];

                    if (!!q._Prefix && q._Prefix === ns.prefix)
                    {
                        return ns;
                    }
                }
            }

            if (!ns)
            {
                ns = !!q._Prefix
                    ? new Namespace(q._Prefix, q.uri)
                    : new Namespace(q.uri);
            }

            return ns;
        };

        /**
         *
         *
         *    @returns String
         */
        QName.prototype.toString = function ()
        {
            return !!this.uri
                ? this.uri + "::" + this.localName
                : this.localName;
        };

        /**
         *
         *
         *    @param AttributeName | QName | String name
         *    @returns AttributeName
         */
        function AttributeName (name)
        {
            if (!(this instanceof AttributeName))
            {
                return name && (name instanceof AttributeName || name instanceof QName)
                    ? name
                    : new AttributeName(name);
            }

            this._Name = name instanceof QName
                ? name
                : new QName(new Namespace(GetDefaultNamespace()||undefined), name);
        }

        /**
         *
         *
         *    @var String
         */
        AttributeName.prototype.localName = undefined;

        /**
         *
         *
         *    @var String
         */
        AttributeName.prototype.uri = undefined;

        /**
         *
         *
         *    @returns String
         */
        AttributeName.prototype.toString = function ()
        {
            return "@" + (!!this._Name.uri
                ? this._Name.uri + "::" + this._Name.localName
                : this._Name.localName
                );
        };

        /**
         *
         *
         *
         */
        function AnyName ()
        {

        }

        /**
         *
         *
         *    @param mixed value
         *    @returns Boolean
         */
        function isXMLName (value)
        {
            if (value instanceof AttributeName)
            {
                return true;
            }

            try{
                var q = QName(value);
            }
            catch (e)
            {
                return false;
            }

            return !!q.localName && (!!q.localName.match(/^[\w\-]+$/i) || !!q.localName.match(/^[\w\-\:]+$/i));
        }

        /**
         *
         *
         *    @param mixed value
         *    @returns String
         *    @throws TypeError
         */
        function ToString (value)
        {
            var i = 0, l, s;

            if (value instanceof XMLList)
            {
                if (value.hasSimpleContent())
                {
                    s = "";

                    for (l = value.length(); i < l; ++i)
                    {
                        if (value[i]._Class != "comment" && value[i]._Class != "processing-instruction")
                        {
                            s += ToString(value[i]);
                        }
                    }

                    return s;
                }

                return ToXMLString(value);
            }
            else if (value instanceof XML)
            {
                if (value._Class === "attribute" || value._Class === "text")
                {
                    return value._Value;
                }

                if (value.hasSimpleContent())
                {
                    s = "";

                    for (l = value.length(); i < l; ++i)
                    {
                        if (value.child(i)._Class != "comment" && value.child(i)._Class != "processing-instruction")
                        {
                            s += ToString(value.child(i));
                        }
                    }

                    return s;
                }

                return ToXMLString(value);
            }
            else if (value instanceof AttributeName)
            {
                return "@" + ToString(value._Name);
            }

            return value === null || value === undefined
                ? ""
                : "" + value;
        }

        /**
         *
         *
         *    @param XML input
         *    @param Object AncestorNamespaces
         *    @param Number IndentLevel
         *    @returns String
         */
        function ToXMLString (input, AncestorNamespaces, IndentLevel)
        {
            var s = "", p = 0, temp, temp2, namespace, namespaceUnion,
                namespaceDeclarations = {}, attrAndNamespaces, prefixes, defaultSet;

            AncestorNamespaces = AncestorNamespaces || {};

            IndentLevel = Number(IndentLevel || 0);

            if (input instanceof XMLList)
            {
                temp = input.hasSimpleContent();

                temp2 = input.length();

                for (; p < temp2; ++p)
                {
                    if (p > 0)
                    {
                        s += "\r\n";
                    }

                    s += ToXMLString(input[p], AncestorNamespaces);
                }

                return s;
            }
            else if (input instanceof XML)
            {
                if (XML.prettyPrinting)
                {
                    //s += new Array(IndentLevel+1).join(" ");
                    for (; p < IndentLevel; ++p)
                    {
                        s += " ";
                    }
                }

                switch (input._Class)
                {
                    case "text":
                        return s + EscapeElementValue(XML.prettyPrinting ? trim(input._Value) : input._Value);

                    case "attribute":
                        return s + EscapeAttributeValue(input._Value);

                    case "comment":
                        return s + "<!--" + input._Value + "-->";

                    case "processing-instruction":
                        return s + "<?" + input._Name.localName + " " + input._Value + "?>";

                    default:
                        namespaceUnion = extend({}, AncestorNamespaces);

                        for (p in input._InScopeNamespaces)
                        {
                            temp = input._InScopeNamespaces[p];

                            if (!AncestorNamespaces[(temp.prefix||"")] || AncestorNamespaces[(temp.prefix||"")].uri != temp.uri)
                            {
                                namespaceUnion[(temp.prefix||"")] = namespaceDeclarations[(temp.prefix||"")] = new Namespace(temp);
                            }
                        }

                        if (!input._Parent)
                        {
                            namespaceUnion[(input._DefaultNamespace.prefix||"")] =
                                namespaceDeclarations[(input._DefaultNamespace.prefix||"")] = new Namespace(input._DefaultNamespace);
                        }
                        /*
                         //firefox doesn't do this
                         for (p in input._Attributes)
                         {
                         namespace = GetNamespace(input._Attributes[p]._Name, namespaceUnion);

                         if (namespace.prefix === undefined)
                         {
                         do {
                         namespace.prefix = !namespaceUnion[""] ? "" : newPrefix();
                         }
                         while(!!namespaceUnion[namespace.prefix]);
                         }

                         namespaceUnion[namespace.prefix] = namespaceDeclarations[namespace.prefix] = namespace;
                         }
                         */

                        s += "<";

                        namespace = GetNamespace(input._Name, namespaceDeclarations);

                        if (namespace.prefix)
                        {
                            s += namespace.prefix + ":";
                        }

                        s += input._Name ? input._Name.localName : "";

                        attrAndNamespaces = extend({}, input._Attributes, namespaceDeclarations);

                        defaultSet = false;

                        for (p in attrAndNamespaces)
                        {
                            s += " ";

                            if (attrAndNamespaces[p] instanceof XML)
                            {
                                temp = GetNamespace(attrAndNamespaces[p]._Name, AncestorNamespaces);

                                if (temp.prefix === undefined && !namespaceUnion[""])
                                {
                                    do{
                                        temp.prefix = !namespaceUnion[""] ? "" : newPrefix();
                                    }
                                    while(namespaceUnion[temp.prefix]);

                                    namespaceUnion[temp.prefix] = namespaceDeclarations[temp.prefix] = new Namespace(temp);
                                }

                                if (temp.prefix)
                                {
                                    s += temp.prefix + ":";
                                }

                                s += attrAndNamespaces[p].localName() + '="' + EscapeAttributeValue(attrAndNamespaces[p]._Value) + '"';
                            }
                            else
                            {
                                s += "xmlns";

                                if (!attrAndNamespaces[p].prefix && defaultSet)
                                {
                                    do{
                                        attrAndNamespaces[p].prefix = newPrefix();
                                    }
                                    while(!!namespaceUnion[attrAndNamespaces[p].prefix]);

                                    namespaceUnion[attrAndNamespaces[p].prefix] =
                                        namespaceDeclarations[attrAndNamespaces[p].prefix] =
                                            new Namespace(attrAndNamespaces[p]);

                                    s += ":" + attrAndNamespaces[p].prefix;
                                }
                                else if (!attrAndNamespaces[p].prefix && !defaultSet)
                                {
                                    defaultSet = true;
                                }
                                else if (attrAndNamespaces[p].prefix)
                                {
                                    s += ":" + attrAndNamespaces[p].prefix;
                                }

                                s += '="' + EscapeAttributeValue(attrAndNamespaces[p].uri) + '"';
                            }
                        }

                        temp = input._Children.length;

                        if (!temp)
                        {
                            return s + "/>";
                        }

                        s += ">";

                        temp2 = temp > 1 || (temp == 1 && input._Class !== "text");

                        names = (!!XML.prettyPrinting && !!temp2) ? IndentLevel + Number(XML.prettyIndent) : 0;

                        prefixes = !!XML.prettyPrinting && !!temp2;

                        for (p = 0; p < temp; ++p)
                        {
                            if (prefixes)
                            {
                                s += "\r\n";
                            }

                            if (input._Children[p])
                            {
                                s += ToXMLString(input._Children[p], namespaceDeclarations, names);
                            }
                        }

                        if (prefixes)
                        {
                            s += "\r\n";

                            for (p = 0; p < IndentLevel; ++p)
                            {
                                s += " ";
                            }
                        }

                        return s + "</" + (namespace.prefix ? namespace.prefix + ":" : "") + input._Name.localName + ">";
                }

                throw new TypeError();
            }
            else if (input === undefined || input === null)
            {
                throw new TypeError();
            }
            else if (toString.call(input) === "[object Object]")
            {
                return EscapeElementValue( input.valueOf().toString() );
            }

            return ToString(input);
        }

        /**
         *
         *
         *    @param mixed s
         *    @returns XML
         *    @throws SyntaxError | TypeError
         */
        function ToXML (s)
        {
            var x, div;

            if (s instanceof XMLList)
            {
                if (s.length() == 1)
                {
                    return s[0];
                }
            }
            else if (s instanceof XML)
            {
                return s;
            }
            else if ((",string,number,boolean,").indexOf("," + typeof(s)+",") > -1)
            {

                div = parse('<parent xmlns="' + GetDefaultNamespace() + '">' + s + '</parent>');

                x = ToXML(div.documentElement)

                if (x)
                {
                    if (x.length() == 0)
                    {
                        return new XML();
                    }
                    else if (x.length() == 1)
                    {
                        x.child(0)._Parent = null;
                        return x.child(0);
                    }
                }


                throw new SyntaxError("Failed to convert DOM object to XML");
            }
            else if (s.nodeType && !isNaN(s.nodeType))
            {
                return MapInfoItemToXML(s);
            }

            throw new TypeError();
        }

        /**
         *
         *
         *    @param DOMNode i
         *    @returns XML
         *    @throws TypeError
         */
        function MapInfoItemToXML (i,n)
        {
            var x = new XML(), temp, temp2, temp3, isNScheck = isNSDef, j, l, xmlChild;

            x._Parent = null;

            switch (i.nodeType)
            {
                case TEXT_NODE:
                case CDATA_SECTION_NODE:
                    x._Class = "text";
                    x._Value = "";
                    temp = i;

                    while (temp && (temp.nodeType === TEXT_NODE || temp.nodeType === CDATA_SECTION_NODE))
                    {
                        x._Value += temp.textContent || temp.text || temp.data;
                        temp = temp.nextSibling;
                        if (n && (n.n || n.n == 0))
                        {
                            ++n.n;
                        }
                    }


                    if (XML.ignoreWhitespace && !x._Value.match(/\S+/))
                    {
                        return null;
                    }

                    return x;

                    break;
                case COMMENT_NODE:
                    if (XML.ignoreComments)
                    {
                        return null;
                    }

                    x._Class = "comment";
                    x._Value = i.data || i.textContent || i.text || "";

                    return x;

                    break;
                case PROCESSING_INSTRUCTION_NODE:
                    if (XML.ignoreProcessingInstructions)
                    {
                        return null;
                    }

                    x._Class = "processing-instruction";
                    x._Name = new QName("", i.target);
                    x._Value = i.data || i.textContent || i.text || "";

                    return x;

                    break;
                case ATTRIBUTE_NODE:
                    x._Class = "attribute";

                    temp = i.nodeName.match(/(([\w\-]+):)?([\w\-]+)/);

                    if ( temp[1] )
                    {
                        temp2 = undefined;

                        if (!!i.lookupNamespace)
                        {
                            temp2 = i.lookupNamespace(temp[2]);
                        }
                        else
                        {
                            temp3 = n;//hack for ie -- stupid ie

                            while (!temp2 && !!temp3 && !!temp3.attributes)
                            {
                                for (j = 0, l = temp3.attributes.length; j < l; ++j)
                                {
                                    if (temp3.attributes[j].nodeName == ("xmlns:" + temp[2]))
                                    {
                                        temp2 = temp3.attributes[j].value || temp3.attributes[j].nodeValue;
                                        break;
                                    }
                                }

                                temp3 = temp3.parentNode;
                            }
                        }
                        x._DefaultNamespace = new Namespace( temp[2], temp2 );
                        x._Name = new QName( x._DefaultNamespace, temp[3] );
                    }
                    else
                    {
                        temp2 = undefined;

                        if (!!i.lookupNamespace)
                        {
                            temp2 = i.lookupNamespace("");
                        }
                        else
                        {
                            temp3 = i.parentNode;

                            while (!temp2 && !!temp3 && !!temp3.attributes)
                            {
                                for (j = 0, l = temp3.attributes.length; j < l; ++j)
                                {
                                    if (temp3.attributes[j].nodeName == "xmlns")
                                    {
                                        temp2 = temp3.attributes[j].value || temp3.attributes[j].nodeValue;
                                        break;
                                    }
                                }

                                temp3 = temp3.parentNode;
                            }
                        }

                        x._DefaultNamespace = new Namespace("", temp2);
                        x._Name = new QName( x._DefaultNamespace, temp[3] );
                    }

                    x._Value = i.value || null;

                    return x;

                    break;
                case ELEMENT_NODE:
                    x._Class = "element";
                    temp = i.nodeName.match(/(([\w\-]+):)?([\w\-]+)/);

                    if ( temp[1] )
                    {
                        temp2 = undefined;

                        if (!!i.lookupNamespace)
                        {
                            temp2 = i.lookupNamespace(temp[2]);
                        }
                        else
                        {
                            temp3 = i;

                            while (!temp2 && !!temp3 && !!temp3.attributes)
                            {
                                for (j = 0, l = temp3.attributes.length; j < l; ++j)
                                {
                                    if (temp3.attributes[j].nodeName == ("xmlns:" + temp[2]))
                                    {
                                        temp2 = temp3.attributes[j].value || temp3.attributes[j].nodeValue;
                                        break;
                                    }
                                }

                                temp3 = temp3.parentNode;
                            }
                        }
                        x._DefaultNamespace = new Namespace( temp[2], temp2 );
                        x._Name = new QName( x._DefaultNamespace, temp[3] );
                    }
                    else
                    {
                        temp2 = undefined;

                        if (!!i.lookupNamespace)
                        {
                            temp2 = i.lookupNamespace("");
                        }
                        else
                        {
                            temp3 = i;

                            while (!temp2 && !!temp3 && !!temp3.attributes)
                            {
                                for (j = 0, l = temp3.attributes.length; j < l; ++j)
                                {
                                    if (temp3.attributes[j].nodeName == "xmlns")
                                    {
                                        temp2 = temp3.attributes[j].value || temp3.attributes[j].nodeValue;
                                        break;
                                    }
                                }

                                temp3 = temp3.parentNode;
                            }
                        }

                        x._DefaultNamespace = new Namespace("", temp2);

                        x._Name = new QName( x._DefaultNamespace, temp[3] );
                    }

                    for (temp = 0, temp2 = i.attributes.length; temp < temp2; ++temp)
                    {
                        if (temp3 = isNScheck.exec(i.attributes[temp].nodeName))
                        {
                            x._InScopeNamespaces[temp3[1]] = new Namespace(temp3[1], i.attributes[temp].value);
                        }
                        else if (i.attributes[temp].nodeName === "xmlns")
                        {
                            x._InScopeNamespaces[""] = new Namespace(i.attributes[temp].value);
                        }
                        else
                        {
                            x._Attributes[i.attributes[temp].nodeName] = MapInfoItemToXML(i.attributes[temp], i);
                        }
                    }

                    j = 0;
                    xmlChild = 0;
                    temp = i.childNodes.length;

                    while (j < temp)
                    {
                        n = {n:-1};
                        if (temp3 = MapInfoItemToXML(i.childNodes[j], n))
                        {
                            //even though it is not written this way in the spec
                            //this is how it works in Firefox
                            x._Children[xmlChild] = temp3;
                            x._Children[xmlChild]._Parent = x;

                            if (temp3._Class === "text" && n.n > 0)
                            {
                                j = j + n.n;
                            }

                            ++xmlChild;
                        }

                        ++j;
                    }

                    x._Value = i.textContent || i.text || i.data || "";

                    x._Length = xmlChild;

                    return x;

                    break;
                case DOCUMENT_NODE:
                //firefox won't do this
                //return MapInfoItemToXML(document.documentElement);
                //break;
                case ENTITY_REFERENCE_NODE:
                    throw new TypeError();
                    break;
                default:
                    return null;
                    break;
            }
        }

        /**
         *
         *
         *    @param mixed s
         *    @returns XML
         *    @throws TypeError
         */
        function ToXMLList (s)
        {
            var e,x,list,i,l;

            if (s instanceof XMLList)
            {
                return s;
            }
            else if (s instanceof XML)
            {
                list = new XMLList();
                list._Children[0] = list[0] = s;
                list._TargetObject = x._Parent;
                list._TargetProperty = x._Name;

                return list;
            }
            else if ((",string,boolean,number,").indexOf("," + typeof(s)+",") === -1)
            {
                throw new TypeError();
            }

            e = parse('<parent xmlns="' + GetDefaultNamespace() + '">' + s + '</parent>');
            x = ToXML(e.documentElement);
            list = new XMLList();
            i = 0;
            l = x._Children.length;

            list._TargetObject = null;

            for (;i < l; ++i)
            {
                x._Children[i]._Parent = null;
                list._Children[i] = list[i] = x._Children[i];
            }


            return list;
        }

        /**
         *
         *
         *    @param mixed s
         *    @returns XMLList
         *    @throws TypeError
         */
        function ToAttributeName (s)
        {
            if (s === "*")
            {
                return new AttributeName(new QName(null, "*"));
            }
            else if (s instanceof QName)
            {
                return new AttributeName(s);
            }
            else if (s instanceof AttributeName)
            {
                return s;
            }

            switch (typeof(s))
            {
                case "undefined":
                case "null":
                case "boolean":
                case "number":
                    throw new TypeError();
                    break;
                case "string":
                    return new AttributeName(new QName(null, (s + "").replace(/^@/,"")));
                    break;
                case "object":
                    return new AttributeName(new QName(null, ToString(s)));
                    break;
            }
        }

        /**
         *
         *
         *    @param mixed s
         *    @returns QName | AttributeName
         *    @throws TypeError
         */
        function ToXMLName (s)
        {
            if (s instanceof QName || s instanceof AttributeName)
            {
                return s;
            }
            else if (s === "*")
            {
                return new QName("*");
            }

            switch (typeof(s))
            {
                case "undefined":
                case "null":
                case "boolean":
                case "number":
                    throw new TypeError();
                    break;
                case "string":
                    if (s.charAt(0) === "@")
                    {
                        return ToAttributeName( s.substr(0) );
                    }

                    return new QName(s);

                    break;
                case "object":
                    return ToXMLName( ToString(s) );
                    break;
            }
        }

        /**
         *
         *
         *    @returns String
         */
        function GetDefaultNamespace ()
        {
            return !!defaultNamespace && defaultNamespace.uri || "";
        }

        /**
         *
         *
         *    @param String s
         *    @returns String
         */
        function EscapeElementValue (s)
        {
            return ((s||"")+"").replace(/./g, function (c)
            {
                switch (c)
                {
                    case "<":
                        return "&lt;";
                    case ">":
                        return "&gt;";
                    case "&":
                        return "&amp;";
                    default:
                        return c;
                }
            });
        }

        /**
         *
         *
         *
         *    @param String s
         *    @returns String
         */
        function EscapeAttributeValue (s)
        {
            return ((s||"")+"").replace(/./g, function (c)
            {
                switch (c)
                {
                    case '"':
                        return "&quot;";
                    case "<":
                        return "&lt;";
                    case ">":
                        return "&gt;";
                    case "&":
                        return "&amp;";
                    case "\r":
                        return "&#xA;";
                    case "\n":
                        return "&#xD;";
                    case "\t":
                        return "&#x9;";
                    default:
                        return c;
                }
            });
        }

        /**
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @returns XMLList
         */
        function Get (PropertyName)
        {
            if (this instanceof XMLList)
            {
                return GetList.call(this, PropertyName);
            }

            if (parseInt(PropertyName)+"" == PropertyName)
            {
                return GetList.call(ToXMLList(this), PropertyName );
            }

            var n = ToXMLName(PropertyName),
                list = new XMLList(), p, l;

            list._TargetObject = this;
            list._TargetProperty = n;

            if (n instanceof AttributeName)
            {
                for (p in this._Attributes)
                {
                    if (
                        (n._Name.localName === "*" || n._Name.localName === this._Attributes[p]._Name.localName)
                            &&
                            (n._Name.uri == null || n._Name.uri === this._Attributes[p]._Name.uri)
                        )
                    {
                        list.Append(this._Attributes[p]);
                    }
                }
            }
            else
            {
                for (p = 0, l = this._Children.length; p < l; ++p)
                {
                    if (
                        (n.localName === "*" || (this._Children[p]._Class === "element" && this._Children[p]._Name.localName === n.localName))
                            &&
                            (n.uri == null || (this._Children[p]._Class === "element" && n.uri === this._Children[p]._Name.uri))
                        )
                    {
                        list.Append(this._Children[p]);
                    }
                }
            }

            return list;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName P
         *    @returns Boolean
         */
        function HasProperty (P)
        {
            if (this instanceof XMLList)
            {
                return HasPropertyList.call(this, P);
            }

            if (parseInt(P) == P)
            {
                return P == "0";
            }

            var n = ToXMLName(P), k, l;

            if (n instanceof AttributeName)
            {
                for (k in this._Attributes)
                {
                    if (
                        (
                            n._Name.localName === "*" || n._Name.localName === this._Attributes[k]._Name.localName
                            ) &&
                            (
                                n._Name.uri == null || n._Name.uri === this._Attributes[k]._Name.uri
                                )
                        )
                    {
                        return true;
                    }
                }

                return false;
            }

            for (k = 0, l = this._Children.length; k < l; ++k)
            {
                if (
                    (n.localName === "*" || (this._Children[k]._Class === "element" && this._Children[k]._Name.localName === n.localName))
                        &&
                        (n.uri == null || (this._Children[k]._Class === "element" && n.uri === this._Children[k]._Name.uri))
                    )
                {
                    return true;
                }
            }

            return false;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @returns Boolean
         *    @throws TypeError
         */
        function DeleteByIndex (PropertyName)
        {
            var i = parseInt(PropertyName);//, q = i + 1, l = this._Children.length;

            if (i == PropertyName)
            {
                if (!!this._Children[i])
                {
                    this._Children[i]._Parent = null;

                    this._Children[i] = null;

                    this._Children.splice(i, 1);

                    /*
                     for (;q < l;++q)
                     {
                     this._Children[q-1] = this._Children[q];
                     }
                     */
                }

                return true;
            }

            throw new TypeError();
        }

        /**
         *
         *
         *
         *    @access private
         *    @returns XML
         */
        function DeepCopy ()
        {
            if (this instanceof XMLList)
            {
                return DeepCopyList.call(this);
            }

            var y = new XML(), i, l;//, c, t;

            y._Class = this._Class;
            y._Name = this._Name;
            y._DefaultNamespace = this._DefaultNamespace ? new Namespace(this._DefaultNamespace) : null;
            y._Value = this._Value;
            y._Parent = null;

            for (i in this._InScopeNamespaces)
            {
                y._InScopeNamespaces[i] = new Namespace(this._InScopeNamespaces.prefix, this._InScopeNamespaces.uri);
            }

            for (l in this._Attributes)
            {
                //y._Attributes[i] = arguments.callee.call(this._Attributes[i]);
                //not part of the spec
                y._Attributes[i] = this._Attributes[l].copy();
                y._Attributes[i]._Parent = y;
            }

            for (i = 0, l = this._Children.length; i < l; ++i)
            {
                y._Children[i] = this._Children[i].copy();
                y._Children[i]._Parent = y;
            }

            return y;
        }

        /**
         *
         *
         *
         *    @access private
         *    @returns XML
         */
        function ResolveValue ()
        {
            if (this instanceof XMLList)
            {
                return ResolveValueList.call(this);
            }
            return this instanceof XML ? this : null;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @returns XMLList
         */
        function Descendants (PropertyName)
        {
            if (this instanceof XMLList)
            {
                return DescendantsList.call(this, PropertyName);
            }

            var n = ToXMLName(PropertyName),
                list = new XMLList(),
                k, l, dq;

            list._TargetObject = null;

            if (n instanceof AttributeName)
            {
                for (k in this._Attributes)
                {
                    if (
                        (n._Name.localName === "*" || n._Name.localName === this._Attributes[k]._Name.localName)
                            &&
                            (n._Name.uri == null || n._Name.uri === this._Attributes[k]._Name.uri)
                        )
                    {
                        list.Append(this._Attributes[k]);
                    }
                }
            }

            for (k = 0, l = this._Children.length; k < l; ++k)
            {
                if (
                    (n.localName === "*" || (this._Children[k]._Class === "element" && this._Children[k]._Name.localName === n.localName))
                        &&
                        (n.uri == null || (this._Children[k]._Class === "element" && n.uri === this._Children[k]._Name.uri))
                    )
                {
                    list.Append(this._Children[k]);
                }

                dq = this._Children[k].descendants(n);

                if (dq.length() > 0)
                {
                    list.Append(dq);
                }
            }

            return list;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @param XML Value
         *    @returns null
         *    @throws TypeError | Error
         */
        function Insert (PropertyName, Value)
        {
            if ((",text,comment,processing-instruction,attribute,").indexOf("," + this._Class + ",") > -1)
            {
                return false;
            }

            var i = parseInt(PropertyName), n, j;

            if (i+"" != PropertyName)
            {
                throw new TypeError("'" + i + "' != '" + PropertyName + "'");
            }

            if (Value === this || indexOf("," + this, Value.descendants("*")) > -1)
            {
                throw new Error();
            }

            n = Value.length();

            for (j = this._Children.length - 1; j >= i; --j)
            {
                this._Children[ j + n ] = this._Children[j];
            }


            if (Value instanceof XMLList)
            {
                for (j = 0; j < n; ++j)
                {
                    Value[j]._Parent = this;
                    this._Children[i + j] = Value[j];
                }
            }
            else
            {
                Replace.call(this, i, Value);
            }

            return null;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @param XML Value
         *    @returns null
         *    @throws TypeError
         */
        function Replace (PropertyName, Value)
        {
            if ((",text,comment,processing-instruction,attribute,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            var i = parseInt(PropertyName), t;

            if (i+"" != PropertyName)
            {
                throw new TypeError("'" + i + "' != '" + PropertyName + "'");
            }

            if (i >= this._Children.length)
            {
                PropertyName = this._Children.length;
            }

            if (Value instanceof XMLList)
            {
                DeleteByIndex.call(this, PropertyName);
                Insert.call(this, PropertyName, Value);
            }
            else if (Value instanceof XML
                && Value._Class === "element"
                && (",element,comment,processing-instruction,text").indexOf("," + Value._Class + ",") > -1
                )
            {
                Value._Parent = this;

                if (this._Children[PropertyName])
                {
                    this._Children[PropertyName]._Parent = null;
                }

                this._Children[PropertyName] = Value;
            }
            else
            {
                t = new XML();
                t._Parent = this;
                t._Value = ToString(Value);

                if (this._Children[PropertyName])
                {
                    this._Children[PropertyName]._Parent = null;
                }

                this._Children[PropertyName] = t;
            }
        };

        /**
         *
         *
         *
         *    @access private
         *    @param String | Namespace NameSpace
         *    @returns null
         */
        function AddInScopeNamespace (NameSpace)
        {
            if ((",text,comment,processing-instruction,attribute,").indexOf("," + this._Class + ",") > -1)
            {
                return null;
            }

            var match = null, p;

            if (NameSpace.prefix == "" && this._Name.uri == "")
            {
                return null;
            }

            for (p in this._InScopeNamespaces)
            {
                if (NameSpace.prefix === this._InScopeNamespaces[p].prefix)
                {
                    match = this._InScopeNamespaces[p];
                }
            }

            if (match && match.uri != NameSpace.uri)
            {
                this._InScopeNamespaces[match.prefix] = null;
                try{
                    delete this._InScopeNamespaces[match.prefix];
                }catch(e){}
            }

            this._InScopeNamespaces[NameSpace.prefix] = NameSpace;

            if (this._Name.prefix === NameSpace.prefix)
            {
                this._Name.prefix = undefined;
            }

            for (p in this._Attributes)
            {
                if (this._Attributes[p]._Name.prefix = NameSpace.prefix)
                {
                    this._Attributes[p]._Name.prefix = undefined;
                }
            }

            //do this in order to ensure namespace integrity
            /*match = parse(this.toXMLString());
             this._Node = !!this._Node.parentNode
             ? this._Node.parentNode.replaceChild(match.documentElement, this._Node)
             : match;*/
        }

        /**
         *
         *
         *    @access private
         *    @param String | Number name
         *    @returns Boolean
         */
        function HasPropertyList (name)
        {
            if (ToString( parseInt(name) ) === name)
            {
                return parseInt(name) < this._Children.length;
            }

            for (var i = 0, l = this._Children.length; i < l; ++i)
            {
                if (this[i]._Class === "element" && this[i].hasOwnProperty(name))
                {
                    return true;
                }
            }

            return false;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | Number | QName PropertyName
         *    @returns XMLList
         */
        function GetList (PropertyName)
        {
            if (parseInt(PropertyName)+"" == PropertyName)
            {
                return this[PropertyName];
            }

            var list = new XMLList(), i = 0, l = this._Children.length, temp;
            list._TargetObject = this;
            list._TargetProperty = PropertyName;

            for (;i < l; ++i)
            {
                if (this._Children[i]._Class === "element")
                {
                    temp = Get.call(this._Children[i], PropertyName);

                    if (temp._Children.length > 0)
                    {
                        list.Append(temp);
                    }
                }
            }

            return list;
        }

        /**
         *
         *
         *
         *    @access private
         *    @returns XMLList
         */
        function DeepCopyList ()
        {
            var list = new XMLList(), i = 0, l = this._Children.length;

            list._TargetObject = this._TargetObject;
            list._TargetProperty = this._TargetProperty;
            list._Class = this._Class;
            list._Value = this._Value;

            for (;i < l; ++i)
            {
                list.Append(DeepCopy.call(this[i]));
            }

            return list;
        }

        /**
         *
         *
         *
         *    @access private
         *    @param String | QName PropertyName
         *    @returns XMLList
         */
        function DescendantsList (PropertyName)
        {
            var list = new XMLList(), i = 0, l = this._Children.length, temp;

            for (; i < l; ++i)
            {
                if (this[i]._Class === "element")
                {
                    if ((temp = Descendants.call(this[i], "*")) && temp.length() > 0)
                    {
                        list.Append(temp);
                    }
                }
            }

            return list;
        }

        /**
         *    http://blog.stevenlevithan.com/archives/faster-trim-javascript
         *
         *
         *    @param String s
         *    @returns String
         */
        function trim (str)
        {
            if(!str)
                return str;
            var    str = str.replace(/^\s\s*/, ""),
                ws = /\s/,
                i = str.length;
            while (ws.test(str.charAt(--i)));
            return str.slice(0, i + 1);
        }

        /**
         *    Generates a prefix for a QName that is not already
         *    a property of the optional argument
         *
         *    @param Object prefixes
         *    @returns String
         */
        function newPrefix (prefixes)
        {
            prefixes = prefixes || {};

            var num = Math.random()
                .toString()
                .substr(2)
                .replace(/.{2}/g, function (a)
                {
                    a = Number(a);
                    return (a > 90 ? 90 : (a < 65 ? 65 : a)) + "";
                });

            num = String.fromCharCode(
                Number(num.substr(0, 2)) & 0xFF,
                Number(num.substr(2, 2)) & 0xFF,
                Number(num.substr(4, 2)) & 0xFF,
                Number(num.substr(6, 2)) & 0xFF,
                Number(num.substr(8, 2)) & 0xFF,
                Number(num.substr(10, 2)) & 0xFF
            ).toLowerCase();

            while (num in prefixes)
            {
                num = arguments.callee(prefixes);
            }

            return num;
        }

        /**
         *
         *
         *    @param String str
         *    @returns DOMNode
         *    @throws SyntaxError
         */
        function parse (str)
        {
            var xmlDoc, success = true;

            if (isActiveXSupported("Microsoft.XMLDOM")) //Internet Explorer
            {
                try{
                    xmlDoc                      = new ActiveXObject("Microsoft.XMLDOM");
                    xmlDoc.async                = 'false';
                    xmlDoc.preserveWhiteSpace   = true;
                    xmlDoc.resolveExternals     = false;
                    xmlDoc.validateOnParse         = false;
                    xmlDoc.setProperty('ProhibitDTD', false);
                    success = xmlDoc.loadXML(str);
                }catch(e){}
            }
            else
            {
                try{//Firefox, Mozilla, Opera, etc.
                    xmlDoc = new DOMParser();
                    xmlDoc = xmlDoc.parseFromString(str, "text/xml");
                }catch(e){}
            }

            if (!success || !xmlDoc || xmlDoc.documentElement.nodeName == "parsererror")
            {
                throw new SyntaxError(!!xmlDoc && xmlDoc.documentElement.childNodes[0].nodeValue);
            }

            return xmlDoc;
        }

        /**
         *
         *
         *    @param Object obj
         *    @returns Number
         */
        function count (obj)
        {
            if ("__count__" in obj)
            {
                return obj.__count__;
            }

            var i = 0, k;

            for (k in obj)
            {
                if (obj.hasOwnProperty(k))
                {
                    ++i;
                }
            }

            return i;
        }

        /**
         *
         *
         *    @param Object obj
         *    @param XMLList list
         *    @returns Number
         */
        function indexOf (obj, list)
        {
            for (var i = 0, l = list.length(); i < l; ++i)
            {
                if (list[i].Equals(obj))
                {
                    return i;
                }
            }

            return -1;
        }

        /**
         *
         *
         *    @param mixed obj
         *    @param mixed ...
         *    @returns mixed
         */
        function extend (obj)
        {
            for (var p, i = 1, l = arguments.length; i < l; ++i)
            {
                for (p in arguments[i])
                {
                    obj[p] = arguments[i][p];
                }
            }

            return obj;
        }

        /**
         *
         *
         *
         */
        function createDocumentFrom (xml)
        {
            return parse(xml.length() == 1 ? xml.toXMLString() : "<x>" + xml.toXMLString() + "</x>");
        }

        /**
         *
         *
         *
         */
        function xmlToDomNode (xml)
        {
            switch (xml.nodeKind())
            {
                case "element":
                    return createDocumentFrom(xml).documentElement;

                case "text":
                    return xmlDoc.createTextNode(xml.toString());

                case "comment":
                    return xmlDoc.createComment(xml.toString().slice(4, -3));

                case "processing-instruction":
                    return xmlDoc.createProcessingInstruction(
                        xml.localName(),
                        xml.toString().slice(2, -2).replace(piName, "")
                    );

                case "attribute":
                    return createAttributeNS(xml);
            }
            return null;
        }

        function adoptNode (doc, node)
        {
            if (!!doc.adoptNode)
            {
                return doc.adoptNode(node);
            }

            var b = doc.documentElement || doc.body;
            return b.removeChild(b.appendChild(node));
        }

        function evaluate (doc, expr, xml)
        {
            var res, l, n = "";

            if (!!doc.evaluate)
            {
                res = doc.evaluate(
                    expr,
                    doc,
                    doc.createNSResolver(doc),
                    XPathResult.ORDERED_NODE_ITERATOR_TYPE,
                    null
                );

                l = [];

                while(n = res.iterateNext())
                {
                    l[l.length] = n;
                }

                return l;
            }

            if ("setProperty" in doc){

                res = allNamespaces(xml);

                if (count(res))
                {
                    for (l in res)
                    {
                        n += " xmlns:" + l + '="' + EscapeAttributeValue(res[l]) + '"';
                    }

                    doc.setProperty('SelectionNamespaces', n.substr(1));
                }

                doc.setProperty("SelectionLanguage", "XPath");
            }

            return isActiveXSupported("Microsoft.XMLDOM") && doc.selectNodes(expr);
        }

        function isActiveXSupported(type) {
            try {
                new ActiveXObject(type);
                return true;
            } catch (e) {
                return false;
            }
        }

        function allNamespaces (xml, un)
        {
            var ns = un || {},
                i = 0,
                c = xml.children(),
                l = c.length(),
                n = un == undefined
                    ? inscope(xml)
                    : xml._InScopeNamespaces,
                p;

            for (;i < l; ++i)
            {
                ns = arguments.callee(c[i], ns);
            }

            for (p in n)
            {
                if (n[p].prefix)
                {
                    ns[n[p].prefix] = n[p].uri;
                }
            }

            return ns;
        }

        function inscope (xml)
        {
            var ns = {},
                i = 0,
                n = xml.inScopeNamespaces(),
                l = n.length;

            for (;i < l; ++i)
            {
                if (n[i].prefix)
                {
                    ns[n[i].prefix] = n[i].uri;
                }
            }

            return ns;
        }

        function createAttributeNS (xml)
        {
            var ns = xml.namespace(),
                node = !!xmlDoc.createAttributeNS
                    ? xmlDoc.createAttributeNS(ns.uri, xml.localName())
                    : xmlDoc.createAttribute((ns.prefix ? ns.prefix + ":" : "" ) + xml.localName());

            node.nodeValue = xml.toString();
            return node;
        }

        function transform (xml, style, params)
        {
            var xsl, res, i = 0, l = (params||[]).length;

            if (!window.XSLTProcessor)
            {
                //TODO: Need to create a way to set parameters on an IE stylesheet
                //XSLProcessor
                //http://msdn.microsoft.com/en-us/library/ms757015%28v=VS.85%29.aspx
                //http://msdn.microsoft.com/en-us/library/ms763679%28VS.85%29.aspx
                //http://msdn.microsoft.com/en-us/library/ms754594%28v=VS.85%29.aspx

                res = createDocumentFrom(xml).transformNode(createDocumentFrom(style));

                return !!res && ToXML(res) || null;
            }

            xsl = new XSLTProcessor();

            xsl.importStyleSheet(createDocumentFrom(style));

            for (; i < l; ++i)
            {
                res = params[i];
                xsl.setParameter(res.namespaceURI, res.localName, res.value);
            }

            res = xsl.transformToDocument(createDocumentFrom(doc))

            return !!res && ToXML(res) || null;
        }

        for (p in XML.prototype)
        {
            defaultXMLPrototype += p + ",";
        }

        for (p in XMLList.prototype)
        {
            defaultXMLListPrototype += p + ",";
        }

        /**
         *
         *
         *
         */
        window.XML              = XML;
        window.XMLList          = XMLList;
        window.QName            = QName;
        window.Namespace        = Namespace;
        window.isXMLName        = isXMLName;
        window.AttributeName    = AttributeName;

    })();
}
(function(){var h=this;
function aa(a){var b=typeof a;if("object"==b)if(a){if(a instanceof Array)return"array";if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if("[object Window]"==c)return"object";if("[object Array]"==c||"number"==typeof a.length&&"undefined"!=typeof a.splice&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("splice"))return"array";if("[object Function]"==c||"undefined"!=typeof a.call&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("call"))return"function"}else return"null";else if("function"==
b&&"undefined"==typeof a.call)return"object";return b}function k(a){return"string"==typeof a}function ba(a,b,c){return a.call.apply(a.bind,arguments)}function ca(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var c=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arguments)}}
function da(a,b,c){da=Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?ba:ca;return da.apply(null,arguments)}function ea(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}
function m(a){var b=n;function c(){}c.prototype=b.prototype;a.u=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.t=function(a,c,f){return b.prototype[c].apply(a,Array.prototype.slice.call(arguments,2))}};var fa=String.prototype.trim?function(a){return a.trim()}:function(a){return a.replace(/^[\s\xa0]+|[\s\xa0]+$/g,"")};function ga(a,b){return a<b?-1:a>b?1:0};var q;a:{var ha=h.navigator;if(ha){var ia=ha.userAgent;if(ia){q=ia;break a}}q=""}function r(a){return-1!=q.indexOf(a)};var s=Array.prototype,ja=s.indexOf?function(a,b,c){return s.indexOf.call(a,b,c)}:function(a,b,c){c=null==c?0:0>c?Math.max(0,a.length+c):c;if(k(a))return k(b)&&1==b.length?a.indexOf(b,c):-1;for(;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},t=s.forEach?function(a,b,c){s.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=k(a)?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},ka=s.filter?function(a,b,c){return s.filter.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=[],f=0,g=k(a)?
a.split(""):a,l=0;l<d;l++)if(l in g){var p=g[l];b.call(c,p,l,a)&&(e[f++]=p)}return e},u=s.reduce?function(a,b,c,d){d&&(b=da(b,d));return s.reduce.call(a,b,c)}:function(a,b,c,d){var e=c;t(a,function(c,g){e=b.call(d,e,c,g,a)});return e},la=s.some?function(a,b,c){return s.some.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=k(a)?a.split(""):a,f=0;f<d;f++)if(f in e&&b.call(c,e[f],f,a))return!0;return!1};
function ma(a,b){var c;a:{c=a.length;for(var d=k(a)?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?null:k(a)?a.charAt(c):a[c]}function na(a){return s.concat.apply(s,arguments)}function oa(a,b,c){return 2>=arguments.length?s.slice.call(a,b):s.slice.call(a,b,c)};var pa=r("Opera")||r("OPR"),v=r("Trident")||r("MSIE"),qa=r("Gecko")&&-1==q.toLowerCase().indexOf("webkit")&&!(r("Trident")||r("MSIE")),ra=-1!=q.toLowerCase().indexOf("webkit");function sa(){var a=h.document;return a?a.documentMode:void 0}
var ta=function(){var a="",b;if(pa&&h.opera)return a=h.opera.version,"function"==aa(a)?a():a;qa?b=/rv\:([^\);]+)(\)|;)/:v?b=/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/:ra&&(b=/WebKit\/(\S+)/);b&&(a=(a=b.exec(q))?a[1]:"");return v&&(b=sa(),b>parseFloat(a))?String(b):a}(),ua={};
function va(a){if(!ua[a]){for(var b=0,c=fa(String(ta)).split("."),d=fa(String(a)).split("."),e=Math.max(c.length,d.length),f=0;0==b&&f<e;f++){var g=c[f]||"",l=d[f]||"",p=RegExp("(\\d*)(\\D*)","g"),x=RegExp("(\\d*)(\\D*)","g");do{var C=p.exec(g)||["","",""],X=x.exec(l)||["","",""];if(0==C[0].length&&0==X[0].length)break;b=ga(0==C[1].length?0:parseInt(C[1],10),0==X[1].length?0:parseInt(X[1],10))||ga(0==C[2].length,0==X[2].length)||ga(C[2],X[2])}while(0==b)}ua[a]=0<=b}}
var wa=h.document,xa=wa&&v?sa()||("CSS1Compat"==wa.compatMode?parseInt(ta,10):5):void 0;!qa&&!v||v&&v&&9<=xa||qa&&va("1.9.1");v&&va("9");function ya(a,b){if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if("undefined"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.compareDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}
function za(a,b){if(a==b)return 0;if(a.compareDocumentPosition)return a.compareDocumentPosition(b)&2?1:-1;if(v&&!(v&&9<=xa)){if(9==a.nodeType)return-1;if(9==b.nodeType)return 1}if("sourceIndex"in a||a.parentNode&&"sourceIndex"in a.parentNode){var c=1==a.nodeType,d=1==b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.parentNode,f=b.parentNode;return e==f?Aa(a,b):!c&&ya(e,b)?-1*Ba(a,b):!d&&ya(f,a)?Ba(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)}d=9==a.nodeType?a:
a.ownerDocument||a.document;c=d.createRange();c.selectNode(a);c.collapse(!0);d=d.createRange();d.selectNode(b);d.collapse(!0);return c.compareBoundaryPoints(h.Range.START_TO_END,d)}function Ba(a,b){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;)d=d.parentNode;return Aa(d,a)}function Aa(a,b){for(var c=b;c=c.previousSibling;)if(c==a)return-1;return 1};function w(a,b,c){this.a=a;this.b=b||1;this.d=c||1};function Ca(a){this.b=a;this.a=0}function Da(a){a=a.match(Ea);for(var b=0;b<a.length;b++)Fa.test(a[b])&&a.splice(b,1);return new Ca(a)}var Ea=RegExp("\\$?(?:(?![0-9-])[\\w-]+:)?(?![0-9-])[\\w-]+|\\/\\/|\\.\\.|::|\\d+(?:\\.\\d*)?|\\.\\d+|\"[^\"]*\"|'[^']*'|[!<>]=|\\s+|.","g"),Fa=/^\s/;function y(a,b){return a.b[a.a+(b||0)]}function z(a){return a.b[a.a++]}function Ga(a){return a.b.length<=a.a};function A(a,b){this.h=a.toLowerCase();this.c=b?b.toLowerCase():"http://www.w3.org/1999/xhtml"}A.prototype.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:"*"!=this.h&&this.h!=a.nodeName.toLowerCase()?!1:this.c==(a.namespaceURI?a.namespaceURI.toLowerCase():"http://www.w3.org/1999/xhtml")};A.prototype.d=function(){return this.h};A.prototype.toString=function(){return"Name Test: "+("http://www.w3.org/1999/xhtml"==this.c?"":this.c+":")+this.h};function B(a,b){this.f=a;this.c=void 0!==b?b:null;this.b=null;switch(a){case "comment":this.b=8;break;case "text":this.b=3;break;case "processing-instruction":this.b=7;break;case "node":break;default:throw Error("Unexpected argument");}}function Ha(a){return"comment"==a||"text"==a||"processing-instruction"==a||"node"==a}B.prototype.a=function(a){return null===this.b||this.b==a.nodeType};B.prototype.d=function(){return this.f};
B.prototype.toString=function(){var a="Kind Test: "+this.f;null===this.c||(a+=D(this.c));return a};function Ia(a){switch(a.nodeType){case 1:return ea(Ja,a);case 9:return Ia(a.documentElement);case 11:case 10:case 6:case 12:return Ka;default:return a.parentNode?Ia(a.parentNode):Ka}}function Ka(){return null}function Ja(a,b){if(a.prefix==b)return a.namespaceURI||"http://www.w3.org/1999/xhtml";var c=a.getAttributeNode("xmlns:"+b);return c&&c.specified?c.value||null:a.parentNode&&9!=a.parentNode.nodeType?Ja(a.parentNode,b):null};var E=v&&!(v&&9<=xa),La=v&&!(v&&8<=xa);function F(a,b,c,d){this.a=a;this.nodeName=c;this.nodeValue=d;this.nodeType=2;this.parentNode=this.ownerElement=b}function Ma(a,b){var c=La&&"href"==b.nodeName?a.getAttribute(b.nodeName,2):b.nodeValue;return new F(b,a,b.nodeName,c)};function G(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?"":b);if("string"!=typeof b)if(E&&"title"==a.nodeName.toLowerCase()&&1==c)b=a.text;else if(9==c||1==c){a=9==c?a.documentElement:a.firstChild;for(var c=0,d=[],b="";a;){do 1!=a.nodeType&&(b+=a.nodeValue),E&&"title"==a.nodeName.toLowerCase()&&(b+=a.text),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}else b=a.nodeValue;return""+b}
function H(a,b,c){if(null===b)return!0;try{if(!a.getAttribute)return!1}catch(d){return!1}La&&"class"==b&&(b="className");return null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function I(a,b,c,d,e){return(E?Na:Oa).call(null,a,b,k(c)?c:null,k(d)?d:null,e||new J)}
function Na(a,b,c,d,e){if(a instanceof A||8==a.b||c&&null===a.b){var f=b.all;if(!f)return e;a=Pa(a);if("*"!=a&&(f=b.getElementsByTagName(a),!f))return e;if(c){for(var g=[],l=0;b=f[l++];)H(b,c,d)&&g.push(b);f=g}for(l=0;b=f[l++];)"*"==a&&"!"==b.tagName||K(e,b);return e}Qa(a,b,c,d,e);return e}
function Oa(a,b,c,d,e){b.getElementsByName&&d&&"name"==c&&!v?(b=b.getElementsByName(d),t(b,function(b){a.a(b)&&K(e,b)})):b.getElementsByClassName&&d&&"class"==c?(b=b.getElementsByClassName(d),t(b,function(b){b.className==d&&a.a(b)&&K(e,b)})):a instanceof B?Qa(a,b,c,d,e):b.getElementsByTagName&&(b=b.getElementsByTagName(a.d()),t(b,function(a){H(a,c,d)&&K(e,a)}));return e}
function Ra(a,b,c,d,e){var f;if((a instanceof A||8==a.b||c&&null===a.b)&&(f=b.childNodes)){var g=Pa(a);if("*"!=g&&(f=ka(f,function(a){return a.tagName&&a.tagName.toLowerCase()==g}),!f))return e;c&&(f=ka(f,function(a){return H(a,c,d)}));t(f,function(a){"*"==g&&("!"==a.tagName||"*"==g&&1!=a.nodeType)||K(e,a)});return e}return Sa(a,b,c,d,e)}function Sa(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)H(b,c,d)&&a.a(b)&&K(e,b);return e}
function Qa(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)H(b,c,d)&&a.a(b)&&K(e,b),Qa(a,b,c,d,e)}function Pa(a){if(a instanceof B){if(8==a.b)return"!";if(null===a.b)return"*"}return a.d()};function J(){this.b=this.a=null;this.i=0}function Ta(a){this.d=a;this.a=this.b=null}function Ua(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=null,f=null,g=0;c&&d;){var f=c.d,l=d.d;f==l||f instanceof F&&l instanceof F&&f.a==l.a?(f=c,c=c.a,d=d.a):0<za(c.d,d.d)?(f=d,d=d.a):(f=c,c=c.a);(f.b=e)?e.a=f:a.a=f;e=f;g++}for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.i=g;return a}function Va(a,b){var c=new Ta(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.i++}
function K(a,b){var c=new Ta(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.i++}function Wa(a){return(a=a.a)?a.d:null}function Xa(a){return(a=Wa(a))?G(a):""}function L(a,b){return new Ya(a,!!b)}function Ya(a,b){this.d=a;this.b=(this.c=b)?a.b:a.a;this.a=null}function M(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;return c.d};function n(a){this.g=a;this.b=this.e=!1;this.d=null}function D(a){return"\n  "+a.toString().split("\n").join("\n  ")}function Za(a,b){a.e=b}function $a(a,b){a.b=b}function N(a,b){var c=a.a(b);return c instanceof J?+Xa(c):+c}function O(a,b){var c=a.a(b);return c instanceof J?Xa(c):""+c}function P(a,b){var c=a.a(b);return c instanceof J?!!c.i:!!c};function Q(a,b,c){n.call(this,a.g);this.c=a;this.f=b;this.k=c;this.e=b.e||c.e;this.b=b.b||c.b;this.c==ab&&(c.b||c.e||4==c.g||0==c.g||!b.d?b.b||b.e||4==b.g||0==b.g||!c.d||(this.d={name:c.d.name,l:b}):this.d={name:b.d.name,l:c})}m(Q);
function R(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b instanceof J&&c instanceof J){e=L(b);for(d=M(e);d;d=M(e))for(b=L(c),f=M(b);f;f=M(b))if(a(G(d),G(f)))return!0;return!1}if(b instanceof J||c instanceof J){b instanceof J?e=b:(e=c,c=b);e=L(e);b=typeof c;for(d=M(e);d;d=M(e)){switch(b){case "number":d=+G(d);break;case "boolean":d=!!G(d);break;case "string":d=G(d);break;default:throw Error("Illegal primitive type for comparison.");}if(a(d,c))return!0}return!1}return e?"boolean"==typeof b||"boolean"==typeof c?
a(!!b,!!c):"number"==typeof b||"number"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}Q.prototype.a=function(a){return this.c.j(this.f,this.k,a)};Q.prototype.toString=function(){var a="Binary Expression: "+this.c,a=a+D(this.f);return a+=D(this.k)};function bb(a,b,c,d){this.a=a;this.p=b;this.g=c;this.j=d}bb.prototype.toString=function(){return this.a};var cb={};function S(a,b,c,d){if(cb.hasOwnProperty(a))throw Error("Binary operator already created: "+a);a=new bb(a,b,c,d);return cb[a.toString()]=a}
S("div",6,1,function(a,b,c){return N(a,c)/N(b,c)});S("mod",6,1,function(a,b,c){return N(a,c)%N(b,c)});S("*",6,1,function(a,b,c){return N(a,c)*N(b,c)});S("+",5,1,function(a,b,c){return N(a,c)+N(b,c)});S("-",5,1,function(a,b,c){return N(a,c)-N(b,c)});S("<",4,2,function(a,b,c){return R(function(a,b){return a<b},a,b,c)});S(">",4,2,function(a,b,c){return R(function(a,b){return a>b},a,b,c)});S("<=",4,2,function(a,b,c){return R(function(a,b){return a<=b},a,b,c)});
S(">=",4,2,function(a,b,c){return R(function(a,b){return a>=b},a,b,c)});var ab=S("=",3,2,function(a,b,c){return R(function(a,b){return a==b},a,b,c,!0)});S("!=",3,2,function(a,b,c){return R(function(a,b){return a!=b},a,b,c,!0)});S("and",2,2,function(a,b,c){return P(a,c)&&P(b,c)});S("or",1,2,function(a,b,c){return P(a,c)||P(b,c)});function db(a,b){if(b.a.length&&4!=a.g)throw Error("Primary expression must evaluate to nodeset if filter has predicate(s).");n.call(this,a.g);this.c=a;this.f=b;this.e=a.e;this.b=a.b}m(db);db.prototype.a=function(a){a=this.c.a(a);return eb(this.f,a)};db.prototype.toString=function(){var a;a="Filter:"+D(this.c);return a+=D(this.f)};function fb(a,b){if(b.length<a.o)throw Error("Function "+a.h+" expects at least"+a.o+" arguments, "+b.length+" given");if(null!==a.n&&b.length>a.n)throw Error("Function "+a.h+" expects at most "+a.n+" arguments, "+b.length+" given");a.s&&t(b,function(b,d){if(4!=b.g)throw Error("Argument "+d+" to function "+a.h+" is not of type Nodeset: "+b);});n.call(this,a.g);this.f=a;this.c=b;Za(this,a.e||la(b,function(a){return a.e}));$a(this,a.r&&!b.length||a.q&&!!b.length||la(b,function(a){return a.b}))}m(fb);
fb.prototype.a=function(a){return this.f.j.apply(null,na(a,this.c))};fb.prototype.toString=function(){var a="Function: "+this.f;if(this.c.length)var b=u(this.c,function(a,b){return a+D(b)},"Arguments:"),a=a+D(b);return a};function gb(a,b,c,d,e,f,g,l,p){this.h=a;this.g=b;this.e=c;this.r=d;this.q=e;this.j=f;this.o=g;this.n=void 0!==l?l:g;this.s=!!p}gb.prototype.toString=function(){return this.h};var hb={};
function T(a,b,c,d,e,f,g,l){if(hb.hasOwnProperty(a))throw Error("Function already created: "+a+".");hb[a]=new gb(a,b,c,d,!1,e,f,g,l)}T("boolean",2,!1,!1,function(a,b){return P(b,a)},1);T("ceiling",1,!1,!1,function(a,b){return Math.ceil(N(b,a))},1);T("concat",3,!1,!1,function(a,b){return u(oa(arguments,1),function(b,d){return b+O(d,a)},"")},2,null);T("contains",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.indexOf(a)},2);T("count",1,!1,!1,function(a,b){return b.a(a).i},1,1,!0);
T("false",2,!1,!1,function(){return!1},0);T("floor",1,!1,!1,function(a,b){return Math.floor(N(b,a))},1);T("id",4,!1,!1,function(a,b){function c(a){if(E){var b=e.all[a];if(b){if(b.nodeType&&a==b.id)return b;if(b.length)return ma(b,function(b){return a==b.id})}return null}return e.getElementById(a)}var d=a.a,e=9==d.nodeType?d:d.ownerDocument,d=O(b,a).split(/\s+/),f=[];t(d,function(a){a=c(a);!a||0<=ja(f,a)||f.push(a)});f.sort(za);var g=new J;t(f,function(a){K(g,a)});return g},1);
T("lang",2,!1,!1,function(){return!1},1);T("last",1,!0,!1,function(a){if(1!=arguments.length)throw Error("Function last expects ()");return a.d},0);T("local-name",3,!1,!0,function(a,b){var c=b?Wa(b.a(a)):a.a;return c?c.localName||c.nodeName.toLowerCase():""},0,1,!0);T("name",3,!1,!0,function(a,b){var c=b?Wa(b.a(a)):a.a;return c?c.nodeName.toLowerCase():""},0,1,!0);T("namespace-uri",3,!0,!1,function(){return""},0,1,!0);
T("normalize-space",3,!1,!0,function(a,b){return(b?O(b,a):G(a.a)).replace(/[\s\xa0]+/g," ").replace(/^\s+|\s+$/g,"")},0,1);T("not",2,!1,!1,function(a,b){return!P(b,a)},1);T("number",1,!1,!0,function(a,b){return b?N(b,a):+G(a.a)},0,1);T("position",1,!0,!1,function(a){return a.b},0);T("round",1,!1,!1,function(a,b){return Math.round(N(b,a))},1);T("starts-with",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return 0==b.lastIndexOf(a,0)},2);T("string",3,!1,!0,function(a,b){return b?O(b,a):G(a.a)},0,1);
T("string-length",1,!1,!0,function(a,b){return(b?O(b,a):G(a.a)).length},0,1);T("substring",3,!1,!1,function(a,b,c,d){c=N(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)return"";d=d?N(d,a):Infinity;if(isNaN(d)||-Infinity===d)return"";c=Math.round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)return a.substring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);T("substring-after",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf(a);return-1==c?"":b.substring(c+a.length)},2);
T("substring-before",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);return-1==a?"":b.substring(0,a)},2);T("sum",1,!1,!1,function(a,b){for(var c=L(b.a(a)),d=0,e=M(c);e;e=M(c))d+=+G(e);return d},1,1,!0);T("translate",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c="";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);T("true",2,!1,!1,function(){return!0},0);function ib(a){n.call(this,3);this.c=a.substring(1,a.length-1)}m(ib);ib.prototype.a=function(){return this.c};ib.prototype.toString=function(){return"Literal: "+this.c};function jb(a){n.call(this,1);this.c=a}m(jb);jb.prototype.a=function(){return this.c};jb.prototype.toString=function(){return"Number: "+this.c};function kb(a,b){n.call(this,a.g);this.f=a;this.c=b;this.e=a.e;this.b=a.b;if(1==this.c.length){var c=this.c[0];c.m||c.c!=lb||(c=c.k,"*"!=c.d()&&(this.d={name:c.d(),l:null}))}}m(kb);function U(){n.call(this,4)}m(U);U.prototype.a=function(a){var b=new J;a=a.a;9==a.nodeType?K(b,a):K(b,a.ownerDocument);return b};U.prototype.toString=function(){return"Root Helper Expression"};function mb(){n.call(this,4)}m(mb);mb.prototype.a=function(a){var b=new J;K(b,a.a);return b};mb.prototype.toString=function(){return"Context Helper Expression"};
function nb(a){return"/"==a||"//"==a}kb.prototype.a=function(a){var b=this.f.a(a);if(!(b instanceof J))throw Error("Filter expression must evaluate to nodeset.");a=this.c;for(var c=0,d=a.length;c<d&&b.i;c++){var e=a[c],f=L(b,e.c.a),g;if(e.e||e.c!=ob)if(e.e||e.c!=pb)for(g=M(f),b=e.a(new w(g));null!=(g=M(f));)g=e.a(new w(g)),b=Ua(b,g);else g=M(f),b=e.a(new w(g));else{for(g=M(f);(b=M(f))&&(!g.contains||g.contains(b))&&b.compareDocumentPosition(g)&8;g=b);b=e.a(new w(g))}}return b};
kb.prototype.toString=function(){var a;a="Path Expression:"+D(this.f);if(this.c.length){var b=u(this.c,function(a,b){return a+D(b)},"Steps:");a+=D(b)}return a};function qb(a,b){this.a=a;this.b=!!b}
function eb(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=L(b),f=b.i,g,l=0;g=M(e);l++){var p=a.b?f-l:l+1;g=d.a(new w(g,p,f));if("number"==typeof g)p=p==g;else if("string"==typeof g||"boolean"==typeof g)p=!!g;else if(g instanceof J)p=0<g.i;else throw Error("Predicate.evaluate returned an unexpected type.");if(!p){p=e;g=p.d;var x=p.a;if(!x)throw Error("Next must be called at least once before remove.");var C=x.b,x=x.a;C?C.a=x:g.a=x;x?x.b=C:g.b=C;g.i--;p.a=null}}return b}
qb.prototype.toString=function(){return u(this.a,function(a,b){return a+D(b)},"Predicates:")};function V(a,b,c,d){n.call(this,4);this.c=a;this.k=b;this.f=c||new qb([]);this.m=!!d;b=this.f;b=0<b.a.length?b.a[0].d:null;a.b&&b&&(a=b.name,a=E?a.toLowerCase():a,this.d={name:a,l:b.l});a:{a=this.f;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.e||1==c.g||0==c.g){a=!0;break a}a=!1}this.e=a}m(V);
V.prototype.a=function(a){var b=a.a,c=null,c=this.d,d=null,e=null,f=0;c&&(d=c.name,e=c.l?O(c.l,a):null,f=1);if(this.m)if(this.e||this.c!=rb)if(a=L((new V(sb,new B("node"))).a(a)),b=M(a))for(c=this.j(b,d,e,f);null!=(b=M(a));)c=Ua(c,this.j(b,d,e,f));else c=new J;else c=I(this.k,b,d,e),c=eb(this.f,c,f);else c=this.j(a.a,d,e,f);return c};V.prototype.j=function(a,b,c,d){a=this.c.d(this.k,a,b,c);return a=eb(this.f,a,d)};
V.prototype.toString=function(){var a;a="Step:"+D("Operator: "+(this.m?"//":"/"));this.c.h&&(a+=D("Axis: "+this.c));a+=D(this.k);if(this.f.a.length){var b=u(this.f.a,function(a,b){return a+D(b)},"Predicates:");a+=D(b)}return a};function tb(a,b,c,d){this.h=a;this.d=b;this.a=c;this.b=d}tb.prototype.toString=function(){return this.h};var ub={};function W(a,b,c,d){if(ub.hasOwnProperty(a))throw Error("Axis already created: "+a);b=new tb(a,b,c,!!d);return ub[a]=b}
W("ancestor",function(a,b){for(var c=new J,d=b;d=d.parentNode;)a.a(d)&&Va(c,d);return c},!0);W("ancestor-or-self",function(a,b){var c=new J,d=b;do a.a(d)&&Va(c,d);while(d=d.parentNode);return c},!0);
var lb=W("attribute",function(a,b){var c=new J,d=a.d();if("style"==d&&b.style&&E)return K(c,new F(b.style,b,"style",b.style.cssText)),c;var e=b.attributes;if(e)if(a instanceof B&&null===a.b||"*"==d)for(var d=0,f;f=e[d];d++)E?f.nodeValue&&K(c,Ma(b,f)):K(c,f);else(f=e.getNamedItem(d))&&(E?f.nodeValue&&K(c,Ma(b,f)):K(c,f));return c},!1),rb=W("child",function(a,b,c,d,e){return(E?Ra:Sa).call(null,a,b,k(c)?c:null,k(d)?d:null,e||new J)},!1,!0);W("descendant",I,!1,!0);
var sb=W("descendant-or-self",function(a,b,c,d){var e=new J;H(b,c,d)&&a.a(b)&&K(e,b);return I(a,b,c,d,e)},!1,!0),ob=W("following",function(a,b,c,d){var e=new J;do for(var f=b;f=f.nextSibling;)H(f,c,d)&&a.a(f)&&K(e,f),e=I(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);W("following-sibling",function(a,b){for(var c=new J,d=b;d=d.nextSibling;)a.a(d)&&K(c,d);return c},!1);W("namespace",function(){return new J},!1);
var vb=W("parent",function(a,b){var c=new J;if(9==b.nodeType)return c;if(2==b.nodeType)return K(c,b.ownerElement),c;var d=b.parentNode;a.a(d)&&K(c,d);return c},!1),pb=W("preceding",function(a,b,c,d){var e=new J,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1,l=f.length;g<l;g++){var p=[];for(b=f[g];b=b.previousSibling;)p.unshift(b);for(var x=0,C=p.length;x<C;x++)b=p[x],H(b,c,d)&&a.a(b)&&K(e,b),e=I(a,b,c,d,e)}return e},!0,!0);
W("preceding-sibling",function(a,b){for(var c=new J,d=b;d=d.previousSibling;)a.a(d)&&Va(c,d);return c},!0);var wb=W("self",function(a,b){var c=new J;a.a(b)&&K(c,b);return c},!1);function xb(a){n.call(this,1);this.c=a;this.e=a.e;this.b=a.b}m(xb);xb.prototype.a=function(a){return-N(this.c,a)};xb.prototype.toString=function(){return"Unary Expression: -"+D(this.c)};function yb(a){n.call(this,4);this.c=a;Za(this,la(this.c,function(a){return a.e}));$a(this,la(this.c,function(a){return a.b}))}m(yb);yb.prototype.a=function(a){var b=new J;t(this.c,function(c){c=c.a(a);if(!(c instanceof J))throw Error("Path expression must evaluate to NodeSet.");b=Ua(b,c)});return b};yb.prototype.toString=function(){return u(this.c,function(a,b){return a+D(b)},"Union Expression:")};function zb(a,b){this.a=a;this.b=b}function Ab(a){for(var b,c=[];;){Y(a,"Missing right hand side of binary expression.");b=Bb(a);var d=z(a.a);if(!d)break;var e=(d=cb[d]||null)&&d.p;if(!e){a.a.a--;break}for(;c.length&&e<=c[c.length-1].p;)b=new Q(c.pop(),c.pop(),b);c.push(b,d)}for(;c.length;)b=new Q(c.pop(),c.pop(),b);return b}function Y(a,b){if(Ga(a.a))throw Error(b);}function Cb(a,b){var c=z(a.a);if(c!=b)throw Error("Bad token, expected: "+b+" got: "+c);}
function Db(a){a=z(a.a);if(")"!=a)throw Error("Bad token: "+a);}function Eb(a){a=z(a.a);if(2>a.length)throw Error("Unclosed literal string");return new ib(a)}function Fb(a){var b=z(a.a),c=b.indexOf(":");if(-1==c)return new A(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error("Namespace prefix not declared: "+d);b=b.substr(c+1);return new A(b,a)}
function Gb(a){var b,c=[],d;if(nb(y(a.a))){b=z(a.a);d=y(a.a);if("/"==b&&(Ga(a.a)||"."!=d&&".."!=d&&"@"!=d&&"*"!=d&&!/(?![0-9])[\w]/.test(d)))return new U;d=new U;Y(a,"Missing next location step.");b=Hb(a,b);c.push(b)}else{a:{b=y(a.a);d=b.charAt(0);switch(d){case "$":throw Error("Variable reference not allowed in HTML XPath");case "(":z(a.a);b=Ab(a);Y(a,'unclosed "("');Cb(a,")");break;case '"':case "'":b=Eb(a);break;default:if(isNaN(+b))if(!Ha(b)&&/(?![0-9])[\w]/.test(d)&&"("==y(a.a,1)){b=z(a.a);b=
hb[b]||null;z(a.a);for(d=[];")"!=y(a.a);){Y(a,"Missing function argument list.");d.push(Ab(a));if(","!=y(a.a))break;z(a.a)}Y(a,"Unclosed function argument list.");Db(a);b=new fb(b,d)}else{b=null;break a}else b=new jb(+z(a.a))}"["==y(a.a)&&(d=new qb(Ib(a)),b=new db(b,d))}if(b)if(nb(y(a.a)))d=b;else return b;else b=Hb(a,"/"),d=new mb,c.push(b)}for(;nb(y(a.a));)b=z(a.a),Y(a,"Missing next location step."),b=Hb(a,b),c.push(b);return new kb(d,c)}
function Hb(a,b){var c,d,e;if("/"!=b&&"//"!=b)throw Error('Step op should be "/" or "//"');if("."==y(a.a))return d=new V(wb,new B("node")),z(a.a),d;if(".."==y(a.a))return d=new V(vb,new B("node")),z(a.a),d;var f;if("@"==y(a.a))f=lb,z(a.a),Y(a,"Missing attribute name");else if("::"==y(a.a,1)){if(!/(?![0-9])[\w]/.test(y(a.a).charAt(0)))throw Error("Bad token: "+z(a.a));c=z(a.a);f=ub[c]||null;if(!f)throw Error("No axis with name: "+c);z(a.a);Y(a,"Missing node name")}else f=rb;c=y(a.a);if(/(?![0-9])[\w]/.test(c.charAt(0)))if("("==
y(a.a,1)){if(!Ha(c))throw Error("Invalid node type: "+c);c=z(a.a);if(!Ha(c))throw Error("Invalid type name: "+c);Cb(a,"(");Y(a,"Bad nodetype");e=y(a.a).charAt(0);var g=null;if('"'==e||"'"==e)g=Eb(a);Y(a,"Bad nodetype");Db(a);c=new B(c,g)}else c=Fb(a);else if("*"==c)c=Fb(a);else throw Error("Bad token: "+z(a.a));e=new qb(Ib(a),f.a);return d||new V(f,c,e,"//"==b)}
function Ib(a){for(var b=[];"["==y(a.a);){z(a.a);Y(a,"Missing predicate expression.");var c=Ab(a);b.push(c);Y(a,"Unclosed predicate expression.");Cb(a,"]")}return b}function Bb(a){if("-"==y(a.a))return z(a.a),new xb(Bb(a));var b=Gb(a);if("|"!=y(a.a))a=b;else{for(b=[b];"|"==z(a.a);)Y(a,"Missing next union location path."),b.push(Gb(a));a.a.a--;a=new yb(b)}return a};function Jb(a,b){if(!a.length)throw Error("Empty XPath expression.");var c=Da(a);if(Ga(c))throw Error("Invalid XPath expression.");b?"function"==aa(b)||(b=da(b.lookupNamespaceURI,b)):b=function(){return null};var d=Ab(new zb(c,b));if(!Ga(c))throw Error("Bad token: "+z(c));this.evaluate=function(a,b){var c=d.a(new w(a));return new Z(c,b)}}
function Z(a,b){if(0==b)if(a instanceof J)b=4;else if("string"==typeof a)b=2;else if("number"==typeof a)b=1;else if("boolean"==typeof a)b=3;else throw Error("Unexpected evaluation result.");if(2!=b&&1!=b&&3!=b&&!(a instanceof J))throw Error("value could not be converted to the specified type");this.resultType=b;var c;switch(b){case 2:this.stringValue=a instanceof J?Xa(a):""+a;break;case 1:this.numberValue=a instanceof J?+Xa(a):+a;break;case 3:this.booleanValue=a instanceof J?0<a.i:!!a;break;case 4:case 5:case 6:case 7:var d=
L(a);c=[];for(var e=M(d);e;e=M(d))c.push(e instanceof F?e.a:e);this.snapshotLength=a.i;this.invalidIteratorState=!1;break;case 8:case 9:d=Wa(a);this.singleNodeValue=d instanceof F?d.a:d;break;default:throw Error("Unknown XPathResult type.");}var f=0;this.iterateNext=function(){if(4!=b&&5!=b)throw Error("iterateNext called with wrong result type");return f>=c.length?null:c[f++]};this.snapshotItem=function(a){if(6!=b&&7!=b)throw Error("snapshotItem called with wrong result type");return a>=c.length||
0>a?null:c[a]}}Z.ANY_TYPE=0;Z.NUMBER_TYPE=1;Z.STRING_TYPE=2;Z.BOOLEAN_TYPE=3;Z.UNORDERED_NODE_ITERATOR_TYPE=4;Z.ORDERED_NODE_ITERATOR_TYPE=5;Z.UNORDERED_NODE_SNAPSHOT_TYPE=6;Z.ORDERED_NODE_SNAPSHOT_TYPE=7;Z.ANY_UNORDERED_NODE_TYPE=8;Z.FIRST_ORDERED_NODE_TYPE=9;function Kb(a){this.lookupNamespaceURI=Ia(a)}
function Lb(a){a=a||h;var b=a.document;b.evaluate||(a.XPathResult=Z,b.evaluate=function(a,b,e,f){return(new Jb(a,e)).evaluate(b,f)},b.createExpression=function(a,b){return new Jb(a,b)},b.createNSResolver=function(a){return new Kb(a)})}var Mb=["wgxpath","install"],$=h;Mb[0]in $||!$.execScript||$.execScript("var "+Mb[0]);for(var Nb;Mb.length&&(Nb=Mb.shift());)Mb.length||void 0===Lb?$[Nb]?$=$[Nb]:$=$[Nb]={}:$[Nb]=Lb;})()

/*************************************************************************
 * ADOBE CONFIDENTIAL
 * ___________________
 *
 *  Copyright 2013 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and are protected by all applicable intellectual property
 * laws, including trade secret and copyright laws.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/



;(function() {
    xfalib = {
        ut : {},
        script : {
            mixin : {},
            dom : {}
        },
        view : {
            util:{},
            layout:{}
        },
        runtime: {
            _private: {}
        },
        locale : {},
        acrobat: {}, //added for acrobat specific scripts
        template: {},
        globals: {
            highlight : false // flag for "Highlight Existing Fields"
        }
    };
    window.xfalib = xfalib;
})();

/*******************************************************************************
 * ADOBE CONFIDENTIAL
 *  ___________________
 *
 *   Copyright 2013 Adobe Systems Incorporated
 *   All Rights Reserved.
 *
 *  NOTICE:  All information contained herein is, and remains
 *  the property of Adobe Systems Incorporated and its suppliers,
 *  if any.  The intellectual and technical concepts contained
 *  herein are proprietary to Adobe Systems Incorporated and its
 *  suppliers and are protected by all applicable intellectual property
 *  laws, including trade secret and copyright laws.
 *  Dissemination of this information or reproduction of this material
 *  is strictly forbidden unless prior written permission is obtained
 *  from Adobe Systems Incorporated.
 ******************************************************************************/

(function(xfalib){
xfalib.locale.Strings =
{
    "pleaseTapText"         :       "Please tap here to sign",
	"pleaseClickText"       :       "Please click here to sign",
	"clearSignature"        :       "Clear Signature Confirmation",
	"clearSignatureConfirm" :       "Are you sure you want to clear signature?",
	"fetchGeoLocation"      :       "Fetching Geo Location info...",
	"errorFetchGeoLocation" :       "Error fetching geolocation info",
	"pleaseSignText"        :       "Please sign here",
	"latitude"              :       "Latitude",
	"longitude"             :       "Longitude",
	"time"                  :       "Time",
    "clearText"             :       "Clear",
    "validationIssue"       :       "Validation Error in the field",
    "warning"               :       "Warnings",
    "errors"                :       "Errors",
    "errorServerScript"     :       "Error in running server script",
    "unableToConnectText"   :       "Couldn't connect to the server",
    "errorSubmittingForm"   :       "Error submitting form to internal url",
    "ok"                    :       "OK",
    "cancel"                :       "Cancel",
    "yes"                   :       "Yes",
    "no"                    :       "No",
    "clear"                 :       "Clear",
    "brushes"               :       "Brushes",
    "geolocation"           :       "Geolocation",
    "FileCloseAccessText"   :       "Press Enter to delete the file ",
    "FileSizeGreater"       :       "File(s) {0} are greater than the expected size: {1}MB.",
    "FileNameInvalid"       :       "Do not attach files where filename starts with (.), contains \\ / : * ? \" < > | ; % $, or is a reserved keyword like nul, prn, con, lpt, or com.",
    "FileMimeTypeInvalid"   :       "File(s) {0} are unsupported file types",
    "UnableToSave"          :       "Unable to save",
    "SavedSuccessfully"     :       "Saved Successfully",
    "Attach"                :       "Attach",
    "datePickerAriaLabel"   :       "Please Enter date in {0} format only",
    "typeYourSignatureHere" :       "Type Your Signature Here",
    "typeYourName"          :       "Type Your Name"
}
})(xfalib);

/*************************************************************************
 * ADOBE CONFIDENTIAL
 * ___________________
 *
 *  Copyright 2013 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and are protected by all applicable intellectual property
 * laws, including trade secret and copyright laws.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/




(function(xfalib){
xfalib.locale.LogMessages =
{
    "ALC-FRM-901-001"   :   "[ALC-FRM-901-001] : "+xfalib.locale.Strings.errorServerScript,
    "ALC-FRM-901-002"   :   "[ALC-FRM-901-002] : Exception occurred while executing {0} script for {1} : {2}.",
    "ALC-FRM-901-003"   :   "[ALC-FRM-901-003] : Error: xfa is not initialized.",
    "ALC-FRM-901-004"   :   "[ALC-FRM-901-004] : NullPointer Exception: {0} child {1} is null.",
    "ALC-FRM-901-005"   :   "[ALC-FRM-901-005] : exception {0} in parsing user script. script:{1}.",
    "ALC-FRM-901-006"   :   "[ALC-FRM-901-006] : Unsupported operation : {0}.",
    "ALC-FRM-901-007"   :   "[ALC-FRM-901-007] : Error in running server scripts. Type mismatch old: {0}, new: {1}.",
    "ALC-FRM-901-008"   :   "[ALC-FRM-901-008] : "+xfalib.locale.Strings.unableToConnectText,
    "ALC-FRM-901-009"   :   "[ALC-FRM-901-009] : Message Box with Yes/No are not supported and converted to Ok/Cancel message box but the return values are correct i.e for Yes/No",
    "ALC-FRM-901-010"   :   "[ALC-FRM-901-010] : Message Box with 3 buttons are not supported",
    "ALC-FRM-901-011"   :   "[ALC-FRM-901-011] : Geo Location not supported",
    "ALC-FRM-901-012"   :   "[ALC-FRM-901-012] : Mixed mode data binding is not supported",
    "ALC-FRM-901-013"   :   "[ALC-FRM-901-013] : Calculations failed after {0}",
    "ALC-FRM-901-014"   :   "[ALC-FRM-901-014] : Validation failed for the object: {0}. Validate Script is {1}",
    "ALC-FRM-901-015"   :   "[ALC-FRM-901-015] : exception {0} in creating user script object. user script:{1}, initialized from event: {2}, object : {3}",
    "ALC-FRM-901-016"   :   "[ALC-FRM-901-016] : "+xfalib.locale.Strings.errorSubmittingForm,
    "ALC-FRM-901-017"   :   "[ALC-FRM-901-017] : Exception occurred {0} while accessing property {1} of {2}" ,
    "ALC-FRM-901-018"   :   "[ALC-FRM-901-018] : This form may not render correctly as you are using an unsupported browser.",
    "ALC-FRM-901-019"   :   "[ALC-FRM-901-019] : Exception occurred while resolving floating fields for : {0}.",
    "ALC-FRM-901-020"   :   "[ALC-FRM-901-020] : Exception while Initializing Logger. Invalid Configuration {0} in {1}",
    "ALC-FRM-901-021"   :   "[ALC-FRM-901-021] : Failed to parse dataPattern {0} for the value {1}: {2}",
    "ALC-FRM-901-022"   :   "[ALC-FRM-901-022] : Skipped parsing Multiple dataPatterns  pattern {0} value {1}",
    "ALC-FRM-901-023"   :   "[ALC-FRM-901-023] : Numeric Patterns having the format (pattern) are not supported. " +
                                                    "Skipping pattern {0} value {1}"
}
})(xfalib);

/*
 * ***********************************************************************
 * ADOBE CONFIDENTIAL
 * __________________
 *
 * Copyright 2015 Adobe Systems Incorporated
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 * ***********************************************************************
 */

window.xfalib = window.xfalib || {
    ut : {},
    view : {
        util : {

        }
    }
};
window.xfalib.$ = window.$;
window.xfalib.jQuery = window.jQuery;
window.xfalib._ = window._;

/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/

/**
 * @package guidelib.util.Namespace
 * @version 0.0.1
 */

(function (window) {
    this.guidelib = {
        util : {},
        event : {},
        model : {
            util : {},
            mixin : {}
        },
        view : {
            util : {},
            ad : {
                layout : {}
            }
        },
        __runtime__ : {
            _private : {},
            af : {},
            guideContext : {}
        },
        author : {
            instances : {},
            editConfigListeners : {}
        },
        __internal__ : {
            liveModel : {},
            liveXmlUtils : {},
            liveDataUtils : {},
            GuideDirtyMarkerAndVisitor : {}
        }
    };

    // access to runtime would fail server side re-validation
    Object.defineProperty(guidelib, "runtime", {
        get : function () {
            console.warn("Access to guidelib.runtime would fail server side re-validation. Please correct your scripts.");
            return guidelib.__runtime__;
        }
    });

    // access to internal would fail server side re-validation
    Object.defineProperty(guidelib, "internal", {
        get : function () {
            console.warn("Access to guidelib.internal would fail server side re-validation. Please correct your scripts.");
            return guidelib.__internal__;
        }
    });

    // We are using this NS in API  in guideBridge.getSignedDocLink
    window.FD = window.FD || {};
})(window);


// jscs:disable requireDotNotation
/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/

/**
 * @package guidelib.util.GuideUtil
 * @version 0.0.1
 *
 * Created with IntelliJ IDEA.
 * User: bsirivel
 * Date: 29/11/13
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
(function (window, $, guidelib, _) {
    var guideLoadingDiv = null,
        gd = function () {
            if (guideLoadingDiv == null) {
                guideLoadingDiv = $("#loadingPage");
            }
            return guideLoadingDiv;
        };
    var GuideUtil = guidelib.util.GuideUtil = {
        GUIDE_ITEM_CONTAINER_SUFFIX : "_guide-item-container",
        DATA_GUIDE_ITEM_CONTAINER : "data-guide-item-container",
        GUIDE_ITEM_NAV_CONTAINER_SUFFIX : "_guide-item-nav-container",
        GUIDE_ITEM_SUFFIX : "_guide-item",
        DATA_GUIDE_ITEM : "data-guide-item",
        GUIDE_ITEM_NAV_SUFFIX : "_guide-item-nav",
        GUIDE_NODE_ID_SUFFIX : "__",
        GUIDE_VIEW_BIND_ATTR : "data-guide-view-bind",
        GUIDE_LAYOUT_CLASS : ".guideLayout",
        GUIDE_WIZARD_LAYOUT : "guideWizardLayout",
        GUIDE_TABBED_PANEL_LAYOUT : "guideTabbedPanelLayout",
        GUIDE_VERTICAL_TABBED_PANEL_LAYOUT : "guideVerticalTabbedPanelLayout",
        DATA_LAYOUT_ITEM_INDEX : "data-layout-item-index",
        SCRIBBLE_RESIZE_TIME_INTERVAL : 1000,       //--to set time-interval for setTimeout
        MANDATORY_TEST : "nullTest", // string to signify the reason for failed test being mandatory
        FORMAT_TEST : "formatTest", // string to signify the reason for failed test being validate picture clause test
        SCRIPT_TEST : "scriptTest", // string to signify the reason for failed test being validate script test
        MAXIMUM_VALUE_TEST : "maximumValueTest", // string to signify the reason for failed test being maximum value test
        MINIMUM_VALUE_TEST : "minimumValueTest", // string to signify the reason for failed test being minimum value test
        TOTAL_DIGITS_TEST : "totalDigitTest", // string to signify the reason for failed test being total digit test
        MINIMUM_LENGTH_TEST : "minimumLengthTest", // string to signify the reason for failed test being minimum length test
        LENGTH_TEST : "totalLengthTest", // string to signify the reason for failed test being total length test
        FM_DAM_ROOT : "/content/dam/formsanddocuments/",
        FM_AF_ROOT : "/content/forms/af/",
        GUIDE_CONTAINER_FORM_CLASS : "#guideContainerForm",
        GUIDE_CONTAINER_THEME_CLASS : "#guideContainerTheme",
        EVENT_PROPERTY_MAPPING : {
            "Calculate" : "calcExp",
            "Visibility" : "visibleExp",
            "Initialize" : "initScript",
            "Click" : "clickExp",
            "Value Commit" : "valueCommitScript",
            "Enabled" : "enabledExp",
            "Validate" : "validateExp",
            "Completion" : "completionExp",
            "Summary" : "summaryExp",
            "Options" : "optionsExp",
            "Navigation" : "navigationChangeExp"
        },

        /**
         * Types of chart available
         */
        chartType : {
            LINE : "line",
            POINT : "point",
            LINE_POINT : "linepoint",
            AREA : "area",
            BAR : "bar",
            COLUMN : "column",
            PIE : "pie",
            DONUT : "donut"
        },

        xfaExprMap : {
            "clickExp" : "click",
            "enabledExp" : null,
            "visibleExp" : null
        },

        _globalUniqueId : (new Date()).getTime(),

        generateUID : function () {
            return "GUID" + (++this._globalUniqueId);
        },

        replaceAll : function (stringToReplaceIn, textToReplace, replacementString) {
            return stringToReplaceIn.split(textToReplace).join(replacementString);
        },

        getId : function (myid) {
            return "#" + myid.replace(/(:|\.|\[|\])/g, "\\$1");
        },
        /**
         * Utility method to compare version
         * @param version1
         * @param version2
         */
        compareVersion : function (version1, version2) {
            if (!_.isEmpty(version1) && !_.isEmpty(version2)) {
                var ver1Array = version1.split("."),
                    ver2Array = version2.split("."),
                    ver1MajorVersion,
                    ver1MinorVersion,
                    ver2MajorVersion,
                    ver2MinorVersion;
                // check if array length is 2 to validate the version value
                if (ver1Array.length === 2 && ver2Array.length === 2) {
                    ver1MajorVersion = parseInt(ver1Array[0], 10);
                    ver1MinorVersion = parseInt(ver1Array[1], 10);
                    ver2MajorVersion = parseInt(ver2Array[0], 10);
                    ver2MinorVersion = parseInt(ver2Array[1], 10);
                    // do the comparison
                    return (ver1MajorVersion == ver2MajorVersion)
                        ? ver1MinorVersion - ver2MinorVersion
                        : ver1MajorVersion - ver2MajorVersion;
                }
            }
        },

        /**
         * Reformats the date of formats like 2018-02-06T16:21:41.240Z or
         * Sun May 06 00:00:00 IST 2001 into ISO format. This utility is useful
         * to convert date present in database or any other data source into a format which AF understands
         * @param value
         * @returns {*}
         * @private
         */
        _reformatDate : function (value, validateWithDefaultPatterns) {
            var retVal = value,
                year = null,
                month = null,
                day = null,
                parsedDate = null,
                isInvalidDate = xfalib.ut.DateInfo.Parse(value, undefined, validateWithDefaultPatterns) == null;
            if (isInvalidDate && value) {
                // date send by FDM layer is always in ISO format
                parsedDate = Date.parse(value);
                if (!isNaN(parsedDate)) {
                    // the code below is for the following date formats, "2018-02-06T16:21:41.240Z"
                    var tmp = value.substr(0, 10);
                    // tmp is expected to contain things like 2018-02-06
                    // if it contains anything else, bail out
                    // need this to avoid regression
                    if (/^[0-9\-]+$/.test(tmp)) {
                        retVal = tmp;
                    }
                } else {
                    // the code below is for the following date formats, "Sun May 06 00:00:00 IST 2001"
                    // these date formats are generally present in data base etc
                    year = value.slice(-4);
                    // check if the value has a valid year before proceeding further
                    if (/^[0-9]+$/.test(year)) {
                        month = guidelib.i18n.calendarSymbols.abbrmonthNames.indexOf(value.substr(4, 3)) + 1;
                        // month == 0, means indexOf returned -1, i.e not found.
                        if (month > 0) {
                            day = value.substr(8, 2);
                            // since this format can only contain days in numeric, check for numeric
                            if (/^[0-9]+$/.test(day)) {
                                retVal = year + '-' + (month < 10 ? '0' : '') + month + '-' + day;
                            }
                        }
                    }
                }
            }
            return retVal;
        },

        /**
         * Formats the given value in given pattern.
         * @param value
         * @param formatPattern pattern defined via picture cluase
         * @returns {*}
         */
        formatValue : function (value, formatPattern, dataType) {
            var formattedValue;
            // in case of data-time, we additionally format the date before passing on to xfa utility
            if (dataType === 'date-time' || dataType === 'date') {
                value = guidelib.util.GuideUtil._reformatDate(value);
            }
            try {
                formattedValue = xfalib.ut.PictureFmt.format(value + "", formatPattern, null, true);
            } catch (exception) {
                window.guideBridge._guide.logger().error("Cannot format value " + value + " with " + formatPattern, exception);
            }
            return formattedValue ? formattedValue : value;
        },
        guideSomToId : function (som) {
            //Note: If you change the som versus id logic than make sure you also take care of GuideBridge.setFocus and
            //AuthoringUtils.setAuthoringFocus which unfortunately based on this specially(AuthoringUtils.setAuthoringFocus).
            if (som) {
                return ("" + som).replace(/\./g, "-");
            }
            return null;
        },

        /**
         * This API returns the name of the component from the given som expression.
         * Eg - If som = guide[0].guide1[0].guideRootPanel[0].numericbox[0],
         * then this API will return numericbox.
         * @param som
         * @returns {*}
         */
        guideSomToComponentName : function (som) {
            if (som) {
                return som.substring(som.lastIndexOf(".") + 1, som.lastIndexOf("["));
            }
            return null;
        },

         /**
          * Utility API to extract key value strings from options
          * @param keyValueString
          * @public
          */
         getOptionsKeyValue: function (keyValueString) {
            var splitValues = [];
            var value = keyValueString.trim();
            if (value.length > 0) {
               var endLoop = true;
               var pos = -1;
               var start = 0;
               do {
                  pos = value.indexOf('=', start);
                  // check for escaping
                  if (pos > 0 && value.charAt(pos - 1) == '\\') {
                     start = pos + 1;
                     endLoop = false;
                  } else {
                     endLoop = true;
                  }
               } while (!endLoop);
               var optionKey, optionValue;
               if (pos == -1) {
                  optionKey = value;
                  optionValue = value;
               } else {
                  optionKey = value.substring(0, pos);
                  optionValue = value.substring(pos + 1);
               }
               splitValues.push(optionKey.replace("\\=", "="));
               splitValues.push(optionValue.replace("\\=", "="));
            } else {
               splitValues.push("");
               splitValues.push("");
            }
            return splitValues;
         },

        /**
         * Returns whether the chart type supports legends or not.
         * Legend is not available for Line / Point / Line and Point / Area chart types.
         * @param chartType
         * @returns {boolean}
         */
        isChartLegendApplicable : function (chartType) {
            return !(chartType === GuideUtil.chartType.LINE || chartType === GuideUtil.chartType.POINT
                || chartType === GuideUtil.chartType.LINE_POINT || chartType === GuideUtil.chartType.AREA);
        },

        /**
         * Returns whether the chart type supports tooltip or not.
         * Tooltip is not available for Line / Area chart types.
         * @param chartType
         * @returns {boolean}
         */
        isChartTooltipApplicable : function (chartType) {
            return !(chartType === GuideUtil.chartType.LINE || chartType === GuideUtil.chartType.AREA);
        },

        /**
         * Returns whether the chart type supports Axis title or not.
         * Axis Title is not available for Pie / Area chart types.
         * @param chartType
         * @returns {boolean}
         */
        isChartAxisTitleApplicable : function (chartType) {
            return !(chartType === GuideUtil.chartType.PIE || chartType === GuideUtil.chartType.DONUT);
        },

        modelElSelector : function (id) {
            var modelSelector = '[' + GuideUtil.GUIDE_VIEW_BIND_ATTR + ']';
            if (id) {
                modelSelector = '[' + GuideUtil.GUIDE_VIEW_BIND_ATTR + '="' + id + '"]';
            }
            return modelSelector;
        },

        /**
         * Checks if the given child model is part of sub tree of container model.
         * @param {?Object} container   container model
         * @param {?Object} child       child model
         * @returns {boolean} true, if child belongs to sub tree of container, false otherwise
         */
        isChildPartOfContainer : function (container, child) {
            if (child != null && container != null) {
                return child.somExpression.lastIndexOf(container.somExpression, 0) === 0;
            }
            return false;
        },

        relativeSom : function (relativeTo, fullSom) {
            if (!relativeTo || !fullSom) {
                return fullSom;
            } else {
                if (fullSom.indexOf("guide[0].") == 0) {
                    fullSom = fullSom.substring(9);
                }
                if (relativeTo.indexOf("guide[0].") == 0) {
                    relativeTo = relativeTo.substring(9);
                }

                if (fullSom.indexOf(relativeTo) == 0) {
                    return fullSom.substring(relativeTo.length + 1);
                } else {
                    return fullSom;
                }
            }
        },

        evalSom : function (som, obj) {
            if (som && obj) {
                return som.split('.').reduce(
                    function (obj, i) {
                        return obj[i];
                    },
                    obj
                );
            } else {
                return null;
            }
        },

        itemContainerSelector : function (id) {
            return "#" + id + GuideUtil.GUIDE_ITEM_CONTAINER_SUFFIX;
        },

        alternateItemContainerSelector : function (id) {
            return "[" + GuideUtil.DATA_GUIDE_ITEM_CONTAINER + "=" + (id + GuideUtil.GUIDE_ITEM_CONTAINER_SUFFIX) + "]";
        },

        itemNavContainerSelector : function (id) {
            var navContainerId = id + GuideUtil.GUIDE_ITEM_NAV_CONTAINER_SUFFIX;
            return ("#" + navContainerId + ", [data-guide-id=" + navContainerId + "]");
        },

        checkIfTableRow : function (model) {
            return model && model instanceof guidelib.model.GuideTableRow;
        },

        itemSelector : function (id, model) {
            if (GuideUtil.checkIfTableRow(model)) {
                return "[" + GuideUtil.DATA_GUIDE_ITEM + "=" + id + GuideUtil.GUIDE_ITEM_SUFFIX + "]";
            } else {
                return "#" + id + GuideUtil.GUIDE_ITEM_SUFFIX;
            }
        },

        itemNavSelector : function (id) {
            var navId = id + GuideUtil.GUIDE_ITEM_NAV_SUFFIX;
            return ("#" + navId + ", [data-guide-id=" + navId + "]");
        },

        summarySelector : function (id) {
            return ".guideSummary[data-guide-id='" + id + "']";
        },

        propSelector : function (prop, id) {
            return "[data-guide-prop=" + prop + "][data-guide-id='" + id + "']";
        },

        getLocalizedMessage : function (category, message, snippets) {
            var resolvedMessage = message;
            if (snippets) {
                //resolve message with snippet
                resolvedMessage = resolvedMessage.replace(/{(\d+)}/g, function (match, number) {
                    return typeof snippets[number] != 'undefined'
                        ? snippets[number]
                        : match;
                });
            }
            var text = "";
            if (category) {
                text += " [" + category + "]";
            }
            text += "  " + resolvedMessage + "\r\n";
            return text;
        },

        elIdWithoutNodeIdSuffix : function (id) {
            var nodeIdSuffix = GuideUtil.GUIDE_NODE_ID_SUFFIX;
            if (id && (id.indexOf(GuideUtil.GUIDE_NODE_ID_SUFFIX) == (id.length - nodeIdSuffix.length))) {
                id = id.substring(0, (id.length - nodeIdSuffix.length)); // remove id suffix
                return id;
            } else {
                return "";
            }
        },

        loadCSS : function (filename) {
            if (!filename) {
                return;
            }
            //Needs to be loaded in both authoring and runtime so not using ClientLibraryManager. Need better way to do that
            var file = window.document.createElement("link");
            file.setAttribute("rel", "stylesheet");
            file.setAttribute("type", "text/css");
            file.setAttribute("href", filename);

            if (typeof file !== "undefined") {
                window.document.getElementsByTagName("head")[0].appendChild(file);
            }
        },
        /**
         * This API sets focus on first element of the Table Row.  First element can consists of add,edit,delete control and a field.
         * This API auto computes the presence of these elements and set's focus on the field.
         * @param $row HTML element of the row to be created
         * @memberof GuideUtil
         * @since 6.3
         * @private
         */
        setFocusOnFirstItemOfTableRow : function ($row) {
            var $editControl = $row.find(".guideTableRuntimeEditControl"),
                id = null,
                bIsEditControlMadeVisible = false,
                model = null;
            // Setting focus on field, since td is not focusable
            if ($editControl.length > 0) {
                $editControl.each(function () {
                    if ($(this).is(":visible")) {
                        // Only one edit control can be visible
                        // we dont support two
                        bIsEditControlMadeVisible = true;
                        $editControl.eq(0).focus();
                    }
                });
            }
            if (!bIsEditControlMadeVisible) {
                // Find the field and use guidebridge to set focus on the first field
                id = $row.find("td:first-child").find(".guideFieldNode").data("guideViewBind");
                model = (id != null) ? guideBridge._resolveId(id) : null;
                if (model != null) {
                    guideBridge.setFocus(model.somExpression);
                }
            }
        },

        // selector points to wrapper div since it has a unique id
        adjustElementHeight : function (selector, isPopUp) {
            if (!isPopUp) {
                var self = $("#" + selector).find(".guideFieldWidget"),
                    maxHeight,
                    clientHeight = self.css("height"),
                    childrenTotalHeight = 0,
                    parentHeight = 0,
                    $child = null,
                    clone = self.clone()[0],
                    $clonedChild = null;

                // Create a dummy element to get the height
                $(clone).css({
                    'visibility' : 'hidden',
                    'max-height' : self.css("max-height"),
                    'top' : '-2000px',
                    'left' : '-2000px',
                    'position' : 'absolute',
                    'height' : (clientHeight !== "0px") ? clientHeight : "auto"
                }).appendTo('body');
                parentHeight = $(clone).height();
                // Walk through the children and adjust their height
                self.children().each(function (index) {
                    $clonedChild = $(clone).children().eq(index);
                    if ($clonedChild.height() >= parentHeight && ($child === null)) {
                        $child = $(this);
                    } else {
                        childrenTotalHeight += $clonedChild.height();
                    }
                });
                if ($child && (parentHeight - childrenTotalHeight) > 0) {
                    $child.height((parentHeight - childrenTotalHeight) + "px");
                } else if (parentHeight - childrenTotalHeight <= 0) {
                    self.children().first().css("height", "auto");
                }
                $(clone).remove();
            } else {
                var modalBody = $("#" + selector).find(".guide-modal-body"),
                    guideTnCContent = $("#" + selector).find(".guide-tnc-content"),
                    paddingTop = modalBody.innerHeight() - modalBody.height();
                // Adjust the max height of the modal body equal to window's height
                // in case of pop up enabled
                modalBody.css("max-height", $(window).height());
                // Since modal-body can have a padding, calculate the total padding
                // Subtract the padding and set max-height for tnc content
                guideTnCContent.css("max-height", $(window).height() - paddingTop);

            }
        },

        _resizeScribbleField : function () {
            var self = $('.guidescribble').find('.guideFieldWidget'),
                that = this;
            _.each(self, function (fieldWidget, index) {
                guidelib.util.GuideUtil._computeHeightAndWidthForScribble(fieldWidget);
            });
        },

        _computeHeightAndWidthForScribble : function (fieldWidget) {
            var fieldWidthInPx,
                fieldHeightInPx,
                ratio;
            fieldWidget = $(fieldWidget);
            fieldWidthInPx = fieldWidget.innerWidth();
            ratio = fieldWidget.data('guideAspectRatio');
            fieldHeightInPx = fieldWidthInPx / ratio;
            fieldHeightInPx = (fieldHeightInPx < 34) ? 34 : fieldHeightInPx;
            fieldWidget.css('height', fieldHeightInPx + "px");
            fieldWidget.find("img").css('height', fieldHeightInPx + "px");
        },

        updateContainer : function (path, data) {
            $.ajax({
                url : path,
                type : "POST",
                data : {"wcmmode" : "disabled", "data" : data, "targetMode" : "true"},
                sync : true,
                success : function (result) {
                    if (!window.guidelib.guideReplaced) {
                        //NOCHECKMARX - result is coming from server side preventing Reflective XSS All Clients.
                        var $result = $(result);
                        $(GuideUtil.GUIDE_CONTAINER_FORM_CLASS).replaceWith($result.filter(GuideUtil.GUIDE_CONTAINER_FORM_CLASS));
                        $(GuideUtil.GUIDE_CONTAINER_THEME_CLASS).replaceWith($result.filter(GuideUtil.GUIDE_CONTAINER_THEME_CLASS));
                    }
                },
                error : function (error) {
                    if (window.console) {
                        window.console.log(error);
                    }
                }
            });
        },

        fetchDataXml : function (initialGuideJsonData) {
            var data = "", initialGuideMergedJson;
            if (initialGuideJsonData) {
                initialGuideMergedJson = JSON.parse(initialGuideJsonData["guidemergedjson"] || "null");
            }
            if (initialGuideMergedJson) {
                data = initialGuideMergedJson.guideState.completeDataXML;
            }
            return data;
        },

        detectContextPath : function () {
            var SCRIPT_URL_REGEXP = /^(?:http|https):\/\/[^\/]+(\/.*)\/(?:etc(\/.*)*\/clientlibs|libs(\/.*)*\/clientlibs|apps(\/.*)*\/clientlibs).*\.js(\?.*)?$/;
            var contextPath, scripts, result;
            try {
                if (window.CQURLInfo) {
                    contextPath = window.CQURLInfo.contextPath || "";
                } else {
                    scripts = window.document.getElementsByTagName("script");
                    for (var i = 0; i < scripts.length; i++) {
                        // in IE the first script is not the expected widgets js: loop
                        // until it is found
                        result = SCRIPT_URL_REGEXP.exec(scripts[i].src);
                        if (result) {
                            contextPath = result[1];
                            return contextPath;
                        }
                    }
                    contextPath = "";
                    return contextPath;
                }
            } catch (e) {
                if (window.console) {
                    window.console.log(error);
                }
            }
        },

        /**
         * Util for getting HTML Id
         * @param myid
         * @returns {*}
         * @private
         */
        _getId : function (myid) {
            return guidelib.util.GuideUtil.getId(myid);
        },

        initializeHelp : function () {
            var shortVisible, getId;
            shortVisible = false;
            getId = GuideUtil._getId;

            // Note: Using delegated event here to fix issue LC-3911686
            // This is done because we have to add this listener every time a new repeatable instance is created
            // Which means initialize help should be called everytime after add instance and the selector written below
            // should be made more generic. This has to be done later, else it may impact performance of AF. Ticket - CQ-4205246
            $(window.document).on("click.longDescription keypress.longDescription", "[data-guide-longDescription]", function (event) {
                if (event.type == "keypress" && !GuideUtil.isEnterKeyPressed(event) && !GuideUtil.isSpaceBarPressed(event)) {
                    return;
                }
                event.preventDefault();
                var index, longDescId, shortDescId, fieldId, longVisible, longDescDiv, shortDescDiv, fieldModel, fieldView;
                longDescId = $(this).data('guide-longdescription');
                index = longDescId.indexOf('_guideFieldLongDescription');
                if (index === -1) {
                    index = longDescId.indexOf('_guidePanelLongDescription');
                }
                fieldId = $(this).data('guide-longdescription').substring(0, index);
                shortDescId = fieldId + '_guideFieldShortDescription';
                /* get the divs*/
                longDescDiv = $(getId(longDescId));
                shortDescDiv = $(getId(shortDescId));
                longDescDiv.toggle();
                longVisible = longDescDiv.is(':visible');
                fieldModel = window.guideBridge._resolveId(fieldId);
                fieldView = window.guideBridge._guideView.getView(fieldModel.somExpression);
                /*hiding shortDesc since longDesc is visible */
                if (longVisible) {
                    shortDescDiv.hide();
                } else {
                    if (fieldView != null) {
                        fieldView.setActive(null, true);
                    }
                    if ($(this).data('guide-alwaysshow')) {
                        shortDescDiv.show();
                    }
                }

                fieldView.visibleHelpElement = longVisible ? "longDescription" : shortDescDiv.is(":visible") ? "shortDescription" : "none";

                fieldModel._triggerOnBridge("elementHelpShown", fieldModel, fieldView.visibleHelpElement, "", {
                    help : $(xfalib.ut.XfaUtil.prototype.encodeScriptableTags(fieldModel[fieldView.visibleHelpElement])).html()
                });
            });

            GuideUtil._initializeShortDescription();
        },
        _initializeShortDescription : function ($html) {
            if (_.isUndefined($html)) {
                $html = window.document;
            }
            var getId = GuideUtil._getId,
                tooltipContent = function (element) {
                    var longVisible, alwaysShow, guideFieldNode, elem;
                    guideFieldNode = $(element).parents('.guideFieldNode').eq(0);
                    longVisible = $(getId(guideFieldNode.attr('id') + '_guideFieldLongDescription')).is(':visible');
                    alwaysShow = $(guideFieldNode.find('[data-guide-longDescription]')).data('guide-alwaysshow');
                    elem = guideFieldNode.find('.short');
                    if (elem !== undefined && elem !== null && !longVisible && !alwaysShow) {
                        return elem.html();
                    }
                    return '';
                };

            var $guideFieldWidget = $('.guideFieldWidget', $html);
            if (_.isFunction($.prototype.tooltip) && $guideFieldWidget.length > 0) {
                $guideFieldWidget.tooltip({
                    title : function () {
                        var button = $(this).find('button'),
                            checkbox = $(this).parents('.guideCheckBoxItem').eq(0),
                            radiobutton = $(this).parents('.guideRadioButtonItem').eq(0);
                        if (!(button !== undefined && button.length > 0) && !(checkbox !== undefined && checkbox.length > 0) && !(radiobutton !== undefined && radiobutton.length > 0)) {
                            return tooltipContent(this);
                        }
                        return '';
                    },
                    placement : 'bottom',
                    container : '.guideContainerWrapperNode',
                    html : true
                });
            }

            var $guideButtonAndCheckBox = $('button, .guideRadioButtonItem, .guideCheckBoxItem', $html);
            if (_.isFunction($.prototype.tooltip) && $guideButtonAndCheckBox.length > 0) {
                $guideButtonAndCheckBox.tooltip({
                    title : function () {
                        return tooltipContent(this);
                    },
                    placement : 'bottom',
                    container : '.guideContainerWrapperNode',
                    html : true
                });

            }
        },

        /**
         * Bring the HTML from server and embed it
         * @todo: Id logic must change
         * Problems if we don't change logic of ID
         * a) Som resolve won't work
         * b) Also, may be there are two field's present inside different fragments having the same id
         * @private
         */
        _embedHtml : function (model, referredHtml, uniquePrefix) {
            var bIsSuccess = false;
            if (referredHtml) {
                // need to add the children of of the given HTML div  only so extracting out by regex and string manipulation
                // so that script tag do remain intact
                var parentIdSelector = "#" + model.id,
                // try non greedy matching of first div
                    re = /<div .*?>/,
                // this would be <div data-guide-asset-path="bla" >
                    openingDiv = referredHtml.match(re),
                    parentUniquePrefix = model.id.substring(0, model.id.indexOf("__" + model.templateId));
                // cut out the first div and inset rest
                referredHtml = referredHtml.substring(openingDiv[0].length, referredHtml.lastIndexOf("</div>"));
                $(parentIdSelector).html(referredHtml);
                if (window.guideBridge._guideView) {
                    // Add the HTML to our template cache
                    window.guideBridge._guideView._domTemplateCacheStore.putDomElement("#" + model.templateId, $(parentIdSelector).clone());
                }
                // now if parent is repeatable , then change ids
                // if repeatable change all IDs
                if (model.repeatable || model._ancestorRepeatable) {
                    $(parentIdSelector).find('[id^="guideContainer"]').each(function (i, el) {
                        var $el = $(el),
                            id = el.id;
                        if (id.indexOf(model.templateId + "_") != 0) {
                            // we do not want to change the id of items_container and nav container
                            $el.attr('id', uniquePrefix + "__" + $el.attr('id'));
                        } else if (parentUniquePrefix) {
                            $el.attr('id', parentUniquePrefix + "__" + id);
                        }
                    });
                }

                // Now let's create view for this HTML
                // Call post initialize to create child view
                //this.postInitialize();
                bIsSuccess = true;
            }
            return bIsSuccess;
        },

        isIphoneOrIpad : function () {
            var IS_IPAD = window.navigator.userAgent.match(/iPad/i) !== null,
                IS_IPHONE = (window.navigator.userAgent.match(/iPhone/i) !== null)
                    || (window.navigator.userAgent.match(/iPod/i) !== null);
            return IS_IPAD || IS_IPHONE;
        },

        commonPrefixLen : function (str1, str2) {
            if (_.isString(str1) && _.isString(str2)) {
                var i,
                    length = Math.min(str1.length, str2.length);

                for (i = 0; i < length; ++i) {
                    if (str1.charAt(i) !== str2.charAt(i)) {
                        break;
                    }
                }
                return i;
            }
            return 0;
        },

        /**
         * Returns true if the bindref is an xpath ending with and attribute
         */
        isAttributeBound : function (bindRef) {
            return _.isString(bindRef) && bindRef.split('/@').length === 2;
        },

        /**
         * Returns the hops to rootPanel
         * @param node
         * @returns {number}
         * @private
         */
        _countHopsToRootPanel : function (node) {
            var count = 0;
            while (node && node.parent) {
                count = count + 1;
                if (node.parent.className === "rootPanelNode") {
                    return count;
                }
                node = node.parent;
            }
        },

        /**
         * Check if ancestor is reference
         * @param model
         * @returns {boolean}
         * @private
         */
        _checkIfAncestorIsALazyReference : function (model) {
            // Walk through the parent hierarchy
            var par = model.parent;
            while (par && !(par instanceof guidelib.model.GuideContainerNode)) {
                if (par._lazyReference) {
                    return true;
                }
                par = par.parent;
            }
            return false;
        },

        /**
         * Check if supplied template jason is in lazy state.
         * @param templateJson
         * @returns {boolean}
         * @private
         */
        isLazyJson : function (templateJson) {
            if (_.isUndefined(templateJson) || _.isEmpty(templateJson.items)) {
                return true;
            }
            return false;
        },

        showGuideLoading : function (bShow) {
            if (bShow) {
                gd().addClass("guideLoading");
                window.document.body.classList.add("af-freezeBody");
            } else {
                gd().attr("class", "");
                window.document.body.classList.remove("af-freezeBody");
            }
            return this;
        },

        removeAllMessages : function () {
            gd().empty().removeClass("guideMessage");
            return this;
        },

        showMessages : function (bMessages) {
            if (!_.isArray(bMessages)) {
                bMessages = [bMessages];
            }
            var $messages = bMessages.map(function (bMessage) {
                return $("<h1></h1>").text(bMessage);
            });
            gd().empty().addClass("guideMessage").append($messages);
            return this;
        },

        /**
         * returns the node value from the prefillXML
         * @param prefillXML
         * @returns {String}
         * @private
         */
        fetchXMLNodeValue : function (prefillXML, targetNode) {
            if (!_.isUndefined(prefillXML)) {
                var XMLModel = $.parseXML(prefillXML);
                if (XMLModel && targetNode) {
                    var elements = XMLModel.getElementsByTagName(targetNode);
                    if (elements && elements.length > 0) {
                        var element = elements[0];
                    }
                    if (!_.isUndefined(element)) {
                        return element.textContent;
                    }
                }
            }
        },

        /**
         * returns the value of the object at a specified path in prefillJson.
         * @param prefillJson
         * @param targetPath
         * @private
         */
        _fetchJSONNodeValue : function (prefillJson, targetPath) {
            if (!_.isUndefined(prefillJson)) {
                var JSONObject = JSON.parse(prefillJson);
                if (JSONObject && targetPath) {
                    return xfalib.ut.XfaUtil.prototype.getOrElse(JSONObject, "afData." + targetPath, undefined);
                }
            }
        },

        isEnterKeyPressed : function (event) {
            return (event.key || event.keyIdentifier) == "Enter" || event.keyCode == 13;
        },

        isSpaceBarPressed : function (event) {
            return (event.key || event.keyIdentifier) == " " || event.keyCode == 32;
        },

        /**
         * This function updates the loaded file upload models with the uploaded file paths
         * and also updates the lazy attachment map(map for unloaded file upload components)
         * @param options
         * @private
         */
        _updateFileModelsAndLazyMap : function (options) {
            var listIndex = 0,
                fileUrlList = options.fileUrlList,
                lazyAttachmentMap = options.lazyAttachmentMap;

            // first iterate over the loaded fileAttachment models and update their model
            _.each(options.fileUploadModelsList, function (fileUploadModel) {
                var fileAttachmentModel = fileUploadModel["fileAttachment"],
                    value = [];
                var fileList = fileUploadModel.fileList;
                _.each(fileList, function (fileListValue) {
                    var isFileListObject = (_.isObject(fileListValue) && fileListValue.val().length > 0),
                        isFileListString = (_.isString(fileListValue) && fileListValue.length > 0);
                    if (isFileListString) {
                        value.push(fileUrlList[listIndex++]);
                    } else if (isFileListObject) {
                        // processing of each file inside fileListObject is done
                        _.each(fileListValue[0].files, function () {
                            value.push(fileUrlList[listIndex++]);
                        });
                    }
                });
                fileAttachmentModel.value = value.join("\n");
            });

            // now iterate over the unloaded fileAttachment models and update the lazyAttachmentMap.
            var i = listIndex;
            _.each(lazyAttachmentMap, function (mapObject) {
                var fileList = mapObject.fileList;
                var valueArray = [];
                for (var j = 0; j < fileList.length; j++) {
                    if (!_.isString(fileList[j])) {
                        // setting fileList to the uploaded path value(just like it would've been getting set in case the model was loaded)
                        fileList[j] = fileUrlList[i];
                        valueArray.push(fileUrlList[i++]);
                    } else {
                        valueArray.push(fileUrlList[i++]);
                    }
                }
                mapObject.value = valueArray.join("\n");
            });
        },

        /**
         * Returns whether the given bindRef is of schema JSON/XSD/FDM or not
         * @param bindRef {String}
         * @returns {boolean}
         * @private
         */
        _isSchemaBindRef : function (bindRef) {
            var isSchemaBindRef = false;
            if (bindRef && bindRef.indexOf('/') > -1) {
                isSchemaBindRef = true;
            }
            return isSchemaBindRef;
        },

        /**
         * Returns whether the given bindRef is of XDP or not
         * @param bindRef {String}
         * @returns {boolean}
         * @private
         */
        _isFormTemplateBindRef : function (bindRef) {
            var isFormTemplateBindRef = false;
            if (bindRef && bindRef.indexOf("[") > -1) {
                isFormTemplateBindRef = true;
            }
            return isFormTemplateBindRef;
        },

        /**
         * This function is useful to define the add operation different from javascript.
         * Ignore first or second operand if it's null,
         * else it'll be treated normally.
         * @param operand1
         * @param operand2
         * @returns {*}
         * @private
         */
        _addValues : function (operand1, operand2) {
            if (_.isNull(operand1)) {
                return operand2;
            } else if (_.isNull(operand2)) {
                return operand1;
            }
            return operand1 + operand2;
        },

        /**
         * Returns the value of the field with the given bindRef, if no Adaptive Form field is found
         * then, it tries to fetch the value of given bindRef from prefill XML
         * @param bindRef - bindRef {string} associated with the field whose value needs to be fetched
         * @param contextSom - optional contextSom {String}, som of the field for which this value is needed
         * @returns {string} value of the field with the given bindRef
         */
        getValueForBindRefField : function (bindRef, contextSom, guide) {
            var value,
               // candidateModels = guidelib.internal.liveModel.getAllFieldModels([bindRef]),
                winnerModel;

            /* Commenting below as recomputation is not going to be supported
            // check for abstract field first, i.e, if there is a global field
            for (var i = 0; i < candidateModels.length; i++) {
                var fieldModel = candidateModels[i];
                if (fieldModel) {
                    if (fieldModel instanceof guidelib.model.AbstractField) {
                        winnerModel = fieldModel;
                        break;
                    } else if (!winnerModel) {
                        winnerModel = fieldModel;
                    }
                }
            }*/

            //TODO: Use som to derive dataSOM, and get correct instance data value from prefill data

            // if no loaded field is found check prefill data
            if (!winnerModel) {
                var dataSection = guide.internal.liveDataUtils.constants.UNBOUND_TAG;
                if (GuideUtil._isSchemaBindRef(bindRef)) {
                    dataSection = guide.internal.liveDataUtils.constants.BOUND_TAG;
                }
                if (GuideUtil._isFormTemplateBindRef(bindRef)) {
                    dataSection = guide.internal.liveDataUtils.constants.XFA_TAG;
                }
                value = guide.internal.liveDataUtils.getDataValue(bindRef, dataSection);
            } else {
                // accessing value from the model in the end injects the correct dependency
                value = winnerModel.value;
            }
            return value;
        },

        /**
         * This API checks if file is accessible, file could not be accessible for multiple reasons,
         * a) Removed from file system, since attaching a file and submitting the form could have a big time gap
         * b) User attached a file to which browser does not have access
         * @param fileName
         * @param file
         * @returns Promise, promise is resolved, if file is accessible, rejected with file name, if file is not accessible
         * @private
         */
        _checkIfFileIsAccessible : function(fileName, file) {
            var msg = file.name,
                timeOutId = null,
                rejectAfter = function(ms, pmsg, pfileName) {
                    return new Promise(function(resolve, reject) {
                        timeOutId = setTimeout(function() {
                            console.log("Read timeout for file " + pfileName);
                            reject(pmsg);
                        }, ms);
                    });
                },
                fileAccessCheck = function (pmsg, pfileName, pfile, timeOutId) {
                    return new Promise(function(resolve, reject) {
                        var chunk_size = 50, // just reading small chunk to validate if disk access is there
                            offset = 0,
                            retVal = {
                                fileName: pfileName,
                                file: pfile
                            },
                            blob = pfile.slice(offset, offset + chunk_size); //slice the file by specifying the index(chunk size)
                        var reader = new FileReader();
                        reader.onerror = function (e) {
                            clearTimeout(timeOutId);
                            console.log("Unable to read file " + pfileName, e);
                            reject(pmsg);
                        };
                        reader.onload = function (e) {
                            clearTimeout(timeOutId);
                            if (e.target.result === 0) {
                                console.log("File has zero bytes " + pfileName);
                                reject(pmsg);

                            }
                            resolve(retVal);
                        };
                        // readAsBinaryString works in firefox and not IE
                        // readAsArrayBuffer works in IE but not firefox
                        // hence readAsBinaryString is still being used
                        reader.readAsBinaryString(blob);
                    });
                };
            // wait for 10 seconds, in some browsers like chrome, onload or onerror is not called in some edge cases
            // if fileAccessCheck does not resolve or reject a promise in 10 seconds, we reject the promise
            return Promise.race([rejectAfter(10000, msg, fileName), fileAccessCheck(msg, fileName, file, timeOutId)])
        },

        _createGetterSetter : function (container, name, ref) {
            var iName = "_" + name + "_";
            if (!container.hasOwnProperty(name)) {
                Object.defineProperty(container, name, {
                    get : function () {
                        if (this._private[iName]) {
                            return this._private[iName]._getNakedThis();
                        }
                        return undefined;
                    },
                    set : function (val) {
                        var curRef = this._private[iName];
                        if (_.isObject(curRef)) {
                            curRef[curRef._default] = val;
                        } else {
                            this.logger().warn("AF", "Trying to set unloaded field's model <" + name + ">");
                        }
                    }
                });
            }
            container._private[iName] = ref;
        },

        _setGuideDataHeader : function ($this, $tableElement) {
            // get the headers associated with cell
            // note: we always use the first header in mobile layout
            var headerText = $this.attr("headers"),
                headerId = !_.isEmpty(headerText) ? headerText.split(" ")[0] : undefined;
            if (headerId) {
                // get the header
                var $firstHeader = $tableElement.find("#" + headerId);
                $this.attr("guide-data-header", $.trim($firstHeader.text()));
            }
        },

        _isIOS : function() {
            // includes not supported in IE11, hence not using it
            var arrayContainsString = function(array, string) {
                // using underscore as ecma script 4 does not support filter in array yet
                if (string) {
                    var newArr = _.filter(array, function (el) {
                        return string.indexOf(el) >= 0;
                    });
                    return newArr.length > 0;
                } else {
                    return false;
                }
            };
            return arrayContainsString([
                    'iPad Simulator',
                    'iPhone Simulator',
                    'iPod Simulator',
                    'iPad',
                    'iPhone',
                    'iPod'
                ], navigator.platform)
                // iPad on iOS 13 detection
                || (navigator.userAgent.indexOf("Mac") >= 0 && "ontouchend" in document)
        },

        validateURL : function(url) {
            if(url.charAt(0) == '/') {
                url = window.location.origin + Granite.HTTP.externalize(url);
            }
            try {
                // IE 11 doesn't support javascript URL api
                var link = document.createElement('a');
                link.setAttribute('href', url);
                return (link.protocol === 'http:' || link.protocol === 'https:');
            } 
            catch (err) {
                return false;
            }
        },


        navigateToURL : function (destinationURL, destinationType) {
            var param, arg,
                windowParam = window;
            switch (destinationType){
                case "SAME_TAB":
                    param = "_self";
                    windowParam = window.parent;
                    break;
                case "NEW_WINDOW":
                    param = "newwindow";
                    arg = "width=1000,height=800";
                    break;
            }
            if (guidelib.util.GuideUtil.validateURL(destinationURL)){
                windowParam.open(Granite.HTTP.externalize(destinationURL), param, arg);
            }
        }
    };
})(window, $, guidelib, window._);

/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/

(function (window, $, guidelib) {

    /* Function to set aria attributes of accordion titles based on current state
     of accordion tab i.e. active or not. */

    function handleAccordionAccessibility() {
        $("a[data-guide-toggle='accordion-tab']").each(function (index, element) {   // Select all accordion tab headers
            var panelId = $(element).attr("data-guide-id"),
                isPanelActive = $("#" + panelId + "_guide-item").hasClass("active");
            $(element).attr("aria-selected", isPanelActive)
                      .attr("aria-expanded", isPanelActive);
        });
    };

    // GUIDE TAB CLASS DEFINITION
    // ====================

    var GuideTab = function (element) {
            this.element = $(element);
        },
        editWindow = window.parent,
        old = $.fn.guidetab;

    GuideTab.prototype.show = function () {
        var $this    = this.element,
            tabType =  $this.data("guide-toggle"),
            $ul      = $this.closest('ul:not(.dropdown-menu)'),
            id       = $this.attr("data-guide-id"),
            tabEnable = (tabType === "tab" || tabType === "accordion-tab"),
            parentPanel    = $this.parents("[id='" + id + "_guide-item']"),
            editPath = null,
            isPanelActive = parentPanel.hasClass("active"),
            $li,
            guideNode;

        if (!id) {
            $li      = $this.parent('li');
            tabEnable = tabEnable || $li.hasClass("stepped");
            id = $li.attr("id") || $li.attr("data-guide-id");
            if (id) {
                id = id.substring(0, id.length - guidelib.util.GuideUtil.GUIDE_ITEM_NAV_SUFFIX.length);
            }
        }

        if (id && tabEnable) {
            if (window.guideBridge) {
                guideNode = window.guideBridge._resolveId(id);
                if (guideNode) {
                    window.guideBridge.setFocus(guideNode.somExpression);
                }
            }
            // for touch authoring, we have AuthorUtils in parent, this is a special handling done for touch authoring
            // todo: have to change this
            else if (window.parent._afAuthorHook && window.parent.guidelib.author.AuthorUtils) {
                //Checking CQ.WCM.getMode() is returning inconsistent results with cf#. So this fallback implementation.
                window.parent.guidelib.author.AuthorUtils.setAuthoringFocus(id, window.document); //Use alternate API in authoring for setFocus
            } else if (guidelib.author.AuthorUtils) {
                // In classic authoring do as usual
                guidelib.author.AuthorUtils.setAuthoringFocus(id, window.document); //Use alternate API in authoring for setFocus
            }
            if (tabType === "accordion-tab") {
                parentPanel.toggleClass("active", !isPanelActive);
                handleAccordionAccessibility();
            }
        } else if (tabEnable) {
            //TODO: JIRA ISSUE
            if (console && console.log) {
                console.log("could not execute setFocus for:" + id);
            }
        }
    };

    // GUIDE TAB PLUGIN DEFINITION
    // =====================

    $.fn.guidetab = function (option) {
        return this.each(function () {
            var $this = $(this),
                instance  = $this.data('guidetab');

            if (!instance) {
                $this.data('guidetab', (instance = new GuideTab(this)));
            }
            if (typeof option === 'string') {
                instance[option]();
            }
        });
    };

    $.fn.guidetab.Constructor = GuideTab();

    // TAB NO CONFLICT
    // ===============

    $.fn.guidetab.noConflict = function () {
        $.fn.guidetab = old;
        return this;
    };

    // TAB DATA-API
    // ============

    $(window.document).on('click.guidetab.data-api', '[data-guide-toggle$="tab"]',
        function (e) {
            e.preventDefault();
            $(this).guidetab('show');
        }).on('keydown.guidetab.data-api', '[data-guide-toggle$="tab"], [id$="' + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_SUFFIX + '"]',
        function (e) {
            if (guidelib.util.GuideUtil.isSpaceBarPressed(e)) {
                e.preventDefault();
                e.stopPropagation();
                if ($(e.target).find('[data-guide-toggle$="tab"]').length > 0) {
                    $(this).find('[data-guide-toggle$="tab"]').guidetab("show");
                } else {
                    $(this).guidetab('show');
                }
            }
        });

    /* Set the aria-attributes for accordion header when form
       is initialized. */

    window.addEventListener("bridgeInitializeStart", function (event) {
        var gb = event.detail.guideBridge;
        gb.on(gb.GUIDE_BRIDGE_INITIALIZE_COMPLETE, handleAccordionAccessibility);
    });

}(window, $, guidelib));


/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/

(function (window, $, guidelib) {
    guidelib.util.GuideUtil.showHideNavScroll = function () {
        var scrollControls = $('[data-guide-nav-scroll]');
        if (scrollControls !== undefined && scrollControls !== null) {
            _.each(scrollControls, function (scrollControl) {
                var $scrollControl = $(scrollControl),
                    isModuleScroller,
                    listArray;
                isModuleScroller = $scrollControl.hasClass('adTabScroller');
                if (isModuleScroller) {
                    listArray = $scrollControl.parent().find('.adTabbedItemTitleContainer');
                } else {
                    // using query selector all here, since sizzle of jquery is manipulating dom
                    // which is causing infinite loop due to dom mutation observer set in parent frame in touch ui
                    listArray = $scrollControl.parent()[0].querySelectorAll('[id*="' + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_CONTAINER_SUFFIX + '"]');
                }
                if (listArray !== undefined && listArray !== null && listArray[0] !== undefined && listArray[0] !== null) {
                    //Don't expect element.offsetWidth to get the same value in all browsers, same issue was faced for TnC in IE.
                    if (listArray[0].scrollWidth <= listArray[0].offsetWidth) {
                        $scrollControl.addClass('hide-tab-scroll');
                    } else {
                        $scrollControl.removeClass('hide-tab-scroll');
                    }
                }
            });
        }
    };

    guidelib.util.GuideUtil.navScroll = function (itemNavContainerDiv, scrollDirection, scrollStep, navSelector) {
        var $itemNavContainerDiv = $(itemNavContainerDiv),
            itemNavs,
            scrollWidth = 0,
            maxScroll,
            currWidth,
            currPos;
        if (!(scrollStep)) {
            scrollStep = 1;
        }
        if ($itemNavContainerDiv !== undefined && $itemNavContainerDiv !== null) {
            itemNavs = $itemNavContainerDiv.find(navSelector);
            if (itemNavs.length > 0) {
                maxScroll = Math.ceil(itemNavContainerDiv.scrollWidth - itemNavContainerDiv.offsetWidth);
                if ($itemNavContainerDiv.data("guideNavScrollPos") === undefined) {
                    $itemNavContainerDiv.attr("data-guide-nav-scroll-pos", 0);
                }
                var navPos = $itemNavContainerDiv.data("guideNavScrollPos");
                if ('left' === scrollDirection) {
                    if (navPos - scrollStep >= 0) {
                        navPos = navPos - scrollStep;
                    }
                } else if ('right' === scrollDirection) {
                    if (navPos + scrollStep < itemNavs.length) {
                        navPos = navPos + scrollStep;
                    }
                }
                _.each(itemNavs, function (item, pos) {
                    if (pos < navPos) {
                        scrollWidth += $(item).outerWidth(true);
                    }
                });
                if (scrollWidth > maxScroll) {
                    currWidth = 0;
                    _.each(itemNavs, function (item, pos) {
                        if (pos <= navPos && currWidth <= maxScroll) {
                            currPos = pos;
                            currWidth += $(item).outerWidth(true);
                        }
                    });
                    navPos = currPos;
                    scrollWidth = currWidth;
                }
                $itemNavContainerDiv.data("guideNavScrollPos", navPos);
                $itemNavContainerDiv.scrollLeft(scrollWidth);
            }
        }
    };
})(window, $, guidelib);

/*handle scrolling of navigator*/
$(function ($) {
    $('body').on('click', '[data-guide-nav-scroll]', function () {
        var scrollDirection = $(this).data("guideNavScroll"),
            isModuleScroller = $(this).hasClass('adTabScroller'),
            listArray;
        if (isModuleScroller) {
            listArray = $(this).parent().find('.adTabbedItemTitleContainer');
        } else {
            listArray = $(this).parent().find('[id*="' + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_CONTAINER_SUFFIX + '"]');
        }
        if (!_.isUndefined(listArray) && !_.isNull(listArray) && listArray.length > 0) {
            if (isModuleScroller) {
                guidelib.util.GuideUtil.navScroll(listArray[0], scrollDirection, 0, '.adTabbedItemTitle');
            } else {
                guidelib.util.GuideUtil.navScroll(listArray[0], scrollDirection, 0, '[id*="' + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_SUFFIX + '"]:not(.hidden)');
            }
        }
    });

    //this should be changed back to $(document).ready(showHideNavScroll) instead of windows onload,
    //once jquery version is bumped
    $(window).on('load resize', guidelib.util.GuideUtil.showHideNavScroll);

});

/**
 * @package guidelib.util.Namespace
 * @version 0.0.1
 */
(function (guidelib) {
    guidelib.log = {
        /* put the Strings that need logging here. The key for the string should be
         * AEM-AF-901-XXX, where XXX is a three digit number with trailing zeroes.
         * Start with AEM-AF-901-020
         */
        LogStrings : {

        }
    };
}(guidelib));


/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/


(function ($, _, guidelib) {
    var LayoutBase = guidelib.view.ad.layout.LayoutBase = function (options) {
        this.options = _.extend({}, this.options, options);
        this.initialize.apply(this, arguments);
    };

    _.extend(LayoutBase.prototype, {
        initialize : function () {
        }
    });

    _.extend(LayoutBase, {
        extend : function (props) {
            var child = inherits(this, props);
            child.extend = this.extend;
            return child;
        }
    });

    
    var ctor = function () {};

    
    
    
    function inherits(parent, protoProps, staticProps) {
        var child;
        var _super = parent.prototype;
        
        
        
        if (protoProps && protoProps.hasOwnProperty('constructor')) {
            child = protoProps.constructor;
        } else {
            child = function () { parent.apply(this, arguments); };
        }

        
        _.extend(child, parent);

        
        
        ctor.prototype = parent.prototype;
        child.prototype = new ctor();
        child._super = parent.prototype;
        child._superClass = parent;

        
        
        if (protoProps) { 
            
            for (var name in protoProps) {
                if (name == "_defaults") {
                    protoProps[name] = _.extend({}, _super[name], protoProps[name]);
                }
                child.prototype[name] = protoProps[name];
            }
        }

        
        if (staticProps) {
            _.extend(child, staticProps);
        }

        
        child.prototype.constructor = child;

        
        child.__super__ = parent.prototype;

        return child;
    };

}($, _, window.guidelib));
(function ($, _, guidelib) {
    var LayoutPlugin = guidelib.view.ad.layout.LayoutPlugin = guidelib.view.ad.layout.LayoutBase.extend({

        layoutName : "",

        initialize : function () {
            this.options = this.options || {};

            
            this.$element = this.options.$element;

            
            this.itemAndTitleArray = this.options.itemAndTitleArray;

            
            this.$container = this.getContainer(this.options.$container);
            this.$container.addClass(this.layoutName);

            
            this.containerId = this.options.containerId;

            this.itemClass = this.layoutName + 'Item';
            this.titleClass = this.layoutName + 'Title';
            this.itemTitleClass = this.layoutName + 'ItemTitle';

            this.$parentNavMenu = this.constructNavMenuContainer();

            this.addItemTitle();
        },

        
        done : function () {

        },

        
        getContainer : function ($optionsContainer) {
            return $optionsContainer;
        },

        
        constructNavMenuContainer : function () {
            var $parentContainer = this.$container.closest('[' + guidelib.util.GuideUtil.DATA_LAYOUT_ITEM_INDEX + ']'),
                parentContainerId,
                $parentListItem,
                itemNavId,
                itemNavContainerId,
                $parentNavMenu,
                $parentModule,
                parentModuleId,
                parentModuleNavContainerId,
                $parentModuleNavMenu;
            
            if ($parentContainer && $parentContainer.length > 0) {
                
                $parentModule = this.$container.parents('.guideAdModule').eq(0);
                if ($parentModule && $parentModule.length === 0) {
                    $parentModule = this.$container.parents('.guideAdModuleGroup').eq(0);
                }
                parentModuleId = $parentModule.data('guide-view-bind');
                parentModuleNavContainerId = parentModuleId + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_CONTAINER_SUFFIX;
                $parentModuleNavMenu = $('[data-guide-id="' + parentModuleNavContainerId + '"]');
                parentContainerId = $parentContainer.attr(guidelib.util.GuideUtil.DATA_LAYOUT_ITEM_INDEX);
                itemNavContainerId = parentContainerId + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_CONTAINER_SUFFIX;
                itemNavId = parentContainerId + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_SUFFIX;
                $parentNavMenu = $parentModuleNavMenu.find('[data-guide-id="' + itemNavContainerId + '"]');
                if (!($parentNavMenu && $parentNavMenu.length > 0)) {
                    $parentListItem = $parentModuleNavMenu.find('[data-guide-id="' + itemNavId + '"]');
                    $parentNavMenu = $('<ul></ul>').attr('data-guide-id', itemNavContainerId);
                    $parentNavMenu.addClass('tab-navigators tab-navigators-mobile');
                    $parentListItem.append($parentNavMenu);
                }
            } else { 
                $parentContainer = this.$container.closest('.guideAdModule');
                if ($parentContainer && $parentContainer.length === 0) {
                    $parentContainer = this.$container.closest('.guideAdModuleGroup');
                }
                parentContainerId = $parentContainer.data('guide-view-bind');
                itemNavContainerId = parentContainerId + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_CONTAINER_SUFFIX;
                $parentNavMenu = $('[data-guide-id="' + itemNavContainerId + '"]');
                $parentNavMenu.removeClass('hidden');
            }

            
            if (!($parentNavMenu && $parentNavMenu.length > 0)) {
                $parentNavMenu = undefined;
            }

            return $parentNavMenu;
        },

        
        constructItemTitle : function (itemAndTitle, index) {
            var $itemTitle = $('<' + this.layoutItemTitleType + '/>'),
                $title = itemAndTitle.title,
                $item = itemAndTitle.item,
                adIndex = 'ad-' + index,
                itemContentId = 'itemContent' + adIndex,
                itemTitleId = 'itemTitle' + adIndex;
            $item.addClass(this.itemClass);
            $itemTitle.attr('data-' + this.layoutName + '-id', adIndex);
            $itemTitle.addClass(this.itemTitleClass);
            $itemTitle.attr('tabindex', 0);
            if ($title && $title.length > 0) {
                $itemTitle.append($title.text());
                $title.addClass(this.titleClass);
            } else { 
                var itemHtml = $item.html().replace(/<br>|<p>|<\/p>|<div>|<\/div>/gi, ' ').replace(/ +/g, ' '),
                    itemText = $('<div></div>').append(itemHtml).text(),
                    itemWordArray = itemText.split(' '),
                    itemTitleText = "";
                if (itemWordArray) {
                    if (itemWordArray.length > 4) {
                        itemTitleText = itemWordArray[0] + ' ' + itemWordArray[1] + ' ' + itemWordArray[2] + ' ' + itemWordArray[3];
                    } else {
                        itemTitleText = itemText;
                    }
                    $itemTitle.append(itemTitleText);
                }
            }
            $itemTitle.attr('title', $itemTitle.text());
            
            $item.attr('data-' + this.layoutName + '-content-id', adIndex);
            $item.attr(guidelib.util.GuideUtil.DATA_LAYOUT_ITEM_INDEX, this.containerId + adIndex);

            
            $item.attr('id', itemContentId);
            $itemTitle.attr('id', itemTitleId);
            $itemTitle.attr('role', 'tab').attr('aria-controls', itemContentId);
            $item.attr('role', 'tabpanel').attr('aria-labeledby', itemTitleId);

            itemAndTitle.item = $item;

            this.updateNavMenuForItem($item, $itemTitle, adIndex);
            return $itemTitle;
        },

        
        updateNavMenuForItem : function ($item, $itemTitle, adIndex) {
            if (this.$parentNavMenu) {
                var menuListItem = $('<li></li>'),
                    menuListItemAnchor = $('<a></a>'),
                    titleText = $itemTitle.text(),
                    navId = this.containerId + adIndex,
                    parentListItem,
                    prefixPath = '';
                menuListItem.attr('data-guide-id', navId + guidelib.util.GuideUtil.GUIDE_ITEM_NAV_SUFFIX);
                menuListItem.attr('title', titleText);
                parentListItem = this.$parentNavMenu.parents('li');
                if (parentListItem && parentListItem.length > 0) {
                    var closeseListItemPath = $(parentListItem[0]).data('path');
                    if (closeseListItemPath) {
                        prefixPath = closeseListItemPath;
                    }
                }
                menuListItem.attr('data-path', prefixPath + '/' + navId);
                menuListItemAnchor.attr('data-toggle', 'collapse');
                menuListItemAnchor.attr('data-target', '#guide-mobile-navigator');
                menuListItemAnchor.append(titleText);
                menuListItemAnchor.on('click', function () {
                    
                    menuListItem.siblings().removeClass('active');
                    
                    menuListItem.addClass('active');
                    $itemTitle.click();
                    $('body').animate({
                        scrollTop : $item.offset().top
                    }, 500);
                    $item.focus();
                });
                menuListItem.append(menuListItemAnchor);
                this.$parentNavMenu.append(menuListItem);
            }
        },

        
        constructItemTitleForOneActive : function (itemAndTitle, itemIndex) {
            var $itemTitle = this.constructItemTitle(itemAndTitle, itemIndex);
            if (itemIndex === 0) {
                this.makeItemTitleActive(itemAndTitle.item, $itemTitle);
            } else {
                this.unmarkItemTitleForOneActive(itemAndTitle.item, $itemTitle);
            }
            if (this.handleItemTitleClick) {
                $itemTitle.on('click', {layoutPlugin : this}, this.handleItemTitleClick);
                $itemTitle.keydown(this.handleItemTitleKeyDown);
            }
            return $itemTitle;
        },

        
        handleItemTitleKeyDown : function (event) {
            switch (event.keyCode) {
                case 32: 
                    $(this).trigger("click");
                    break;
            }
        },

        
        constructItemTitleContainer : function () {
            var $itemTitleContainer = $('<' + this.layoutItemTitleContainerType + '/>');
            $itemTitleContainer.addClass(this.layoutName + 'ItemTitleContainer').attr('data-' + this.layoutName + '-id', this.containerId);
            return $itemTitleContainer;
        },

        
        makeItemTitleActive : function ($item, $itemTitle) {
            $item.addClass('active').removeClass('hidden');
            $item.attr('aria-hidden', 'false');
            $itemTitle.addClass('active');
        },

        
        unmarkItemTitleActive : function ($item, $itemTitle) {
            $item.removeClass('active');
            $itemTitle.removeClass('active');
        },

        unmarkItemTitleForOneActive : function ($item, $itemTitle) {
            $item.addClass('hidden');
            $item.attr('aria-hidden', 'true');
            this.unmarkItemTitleActive($item, $itemTitle);
        }
    });
}($, _, window.guidelib));
(function ($, _, guidelib) {
    var TabLayoutPlugin = guidelib.view.ad.layout.TabLayoutPlugin = guidelib.view.ad.layout.LayoutPlugin.extend({
        layoutName : "adTabbed",
        layoutItemTitleType : "li",
        layoutItemTitleContainerType : "ul",

        addItemTitle : function () {
            var $itemTitleContainer = this.constructItemTitleContainer(),
                $itemTitleScrollerDiv = $('<div></div>'),
                $leftScroll = $('<div></div>').addClass('adTabScroller adTabLeft').attr('data-guide-nav-scroll', 'left'),
                $rightScroll = $('<div></div>').addClass('adTabScroller adTabRight').attr('data-guide-nav-scroll', 'right');
            
            this.$container.attr('data-' + this.layoutName + '-content-id', 'ad-' + this.containerId);

            _.each(this.itemAndTitleArray, function (itemAndTitle, itemIndex) {
                var $itemTitle = this.constructItemTitleForOneActive(itemAndTitle, itemIndex);
                $itemTitleContainer.append($itemTitle);
            }, this);
            $itemTitleScrollerDiv.append($leftScroll).append($itemTitleContainer).append($rightScroll);
            this.$container.before($itemTitleScrollerDiv);
        },

        
        getContainer : function ($optionsContainer) {
            if (!$optionsContainer.is('ul') && !$optionsContainer.is('ol') && this.itemAndTitleArray && this.itemAndTitleArray.length > 0) {
                var firstItem = this.itemAndTitleArray[0].item[0],
                    $itemParent = $(firstItem).parent(),
                    allChildren = $itemParent.children(),
                    filteredList = [],
                    addToFilterList = false;
                _.each(allChildren, function (containerChild) {
                    if (firstItem == containerChild) {
                        addToFilterList = true;
                    }
                    if (addToFilterList) {
                        filteredList.push(containerChild);
                    }
                });
                return $(filteredList).wrapAll('<div></div>').parent();
            }
            return $optionsContainer;
        },

        handleItemTitleClick : function (event) {
            var $itemTitle = $(this);
            if (!$itemTitle.hasClass('active')) {
                var layoutPlugin = event.data.layoutPlugin,
                    dataAttrtName = 'data-' + layoutPlugin.layoutName.toLowerCase() + '-content-id',
                    dataAttrValueItem = $itemTitle.data(layoutPlugin.layoutName.toLowerCase() + '-id'),
                    $itemTitleContainer = $itemTitle.parent(layoutPlugin.layoutItemTitleContainerType),
                    dataAttrValueItemContainer = $itemTitleContainer.data(layoutPlugin.layoutName.toLowerCase() + '-id'),
                    $itemContainer = $itemTitleContainer.parent().siblings('[' + dataAttrtName + '="ad-' + dataAttrValueItemContainer + '"]'),
                    $item = $itemContainer.children('[' + dataAttrtName + '="' + dataAttrValueItem + '"]'),
                    list,
                    scrollPos,
                    navPos,
                    scrollDirection,
                    scrollStep;
                layoutPlugin.unmarkItemTitleForOneActive($itemContainer.children('.active'), $itemTitleContainer.children('.active'));
                layoutPlugin.makeItemTitleActive($item, $itemTitle);
                list = $itemTitleContainer.eq(0);
                if (_.isUndefined(list.data("guideNavScrollPos"))) {
                    list.data("guideNavScrollPos", 0);
                }
                scrollPos = list.data("guideNavScrollPos");
                
                navPos = parseInt($itemTitle.data('adtabbedId').substr(3));
                if (navPos > scrollPos) {
                    scrollDirection = "right";
                } else {
                    scrollDirection = "left";
                }
                scrollStep = Math.abs(navPos - scrollPos);
                guidelib.util.GuideUtil.navScroll(list, scrollDirection, scrollStep, '.adTabbedItemTitle');
                guidelib.util.GuideUtil.showHideNavScroll();
            }
        },

        done : function () {
            var parentCard = this.$container.parents('.' + this.layoutName);
            
            if (!(parentCard && parentCard.length > 0)) {
                guidelib.util.GuideUtil.showHideNavScroll();
            }
        }
    });
}($, _, window.guidelib));

(function ($, _, guidelib) {
    var AccordionLayoutPlugin = guidelib.view.ad.layout.AccordionLayoutPlugin = guidelib.view.ad.layout.LayoutPlugin.extend({
        layoutName : "adAccordion",
        layoutItemTitleType : "div",

        addItemTitle : function () {
            _.each(this.itemAndTitleArray, function (itemAndTitle, itemIndex) {
                var $item = itemAndTitle.item,
                    $itemTitle;
                
                if ($item.is('li')) {
                    $item.wrapInner('<div></div>');
                    $item = $item.children('div');
                    itemAndTitle.item = $item;
                }
                $itemTitle = this.constructItemTitleForOneActive(itemAndTitle, itemIndex);
                $item.before($itemTitle);
            }, this);
        },

        handleItemTitleClick : function (event) {
            var $itemTitle = $(this),
                layoutPlugin = event.data.layoutPlugin,
                dataAttrtName = 'data-' + layoutPlugin.layoutName.toLowerCase() + '-content-id',
                dataAttrValue = $itemTitle.data(layoutPlugin.layoutName.toLowerCase() + '-id'),
                $itemContainer = $itemTitle.parent(),
                $item = $itemContainer.children('[' + dataAttrtName + '="' + dataAttrValue + '"]'),
                $prevActiveItemTitle,
                $prevActiveItem;
            if (!$itemTitle.hasClass('active')) {
                if ($itemContainer.is("li")) {
                    $itemContainer = $itemContainer.parent().children(); 
                }
                $prevActiveItem = $itemContainer.children('.active[' + dataAttrtName + ']'); 
                $prevActiveItemTitle = $itemContainer.children('.active'); 
                layoutPlugin.unmarkItemTitleForOneActive($prevActiveItem, $prevActiveItemTitle);
                layoutPlugin.makeItemTitleActive($item, $itemTitle);
            } else {
                $itemTitle.removeClass('active');
                $item.toggleClass('hidden');
            }
        }
    });
}($, _, window.guidelib));


(function ($, _, guidelib) {
    var AnchorLayoutPlugin = guidelib.view.ad.layout.AnchorLayoutPlugin = guidelib.view.ad.layout.LayoutPlugin.extend({
        layoutName : "adAnchor",
        layoutItemTitleType : "a",
        layoutItemTitleContainerType : "ul",

        initialize : function (options) {
            
            this.mergeWithParent = this.options.mergeWithParent || true;
            AnchorLayoutPlugin._super.initialize.call(this, options);
        },

        addItemTitle : function () {
            var $itemTitleContainer = this.constructItemTitleContainer(),
                titleClassSelector = '.' + this.titleClass,
                dataUidAttr = 'data-' + this.layoutName + '-uid';
            
            this.$container.attr('data-' + this.layoutName + '-content-id', 'ad-' + this.containerId);

            _.each(this.itemAndTitleArray, function (itemAndTitle, itemIndex) {
                var $item = itemAndTitle.item,
                    $itemTitle = this.constructItemTitle(itemAndTitle, itemIndex),
                    itemUid =  this.containerId + 'data-' + itemIndex + '-val-' + $itemTitle.html(),
                    $itemAnchor,
                    $title;
                $item.attr(dataUidAttr, itemUid);
                $itemTitle.attr('href', '#' + itemUid);
                $itemTitle.wrap('<li></li>');
                if (this.$titles) {
                    $title = $(this.$titles[itemIndex]);
                } else {
                    $title = $item.find(titleClassSelector);
                }
                $itemAnchor = $('<a></a>').attr('name', itemUid);
                if ($title && $title.length > 0) {
                    $title.before($itemAnchor);
                } else {
                    $item.prepend($itemAnchor);
                }
                $itemTitleContainer.append($itemTitle.parent());
            }, this);

            if (this.mergeWithParent) {
                var $parentAnchorItem = this.$container.closest('[' + dataUidAttr + ']'),
                    $anchorList,
                    uidCondition,
                    $parentAnchor;
                if ($parentAnchorItem && $parentAnchorItem.length > 0) {
                    $anchorList = this.$element.siblings('.' + this.layoutName + 'ItemTitleContainer');
                    uidCondition = '[href="#' + $parentAnchorItem.attr(dataUidAttr) + '"]';
                    $parentAnchor = $anchorList.find(uidCondition);
                    if ($parentAnchor && $parentAnchor.length > 0) {
                        $parentAnchor.parent().append($itemTitleContainer);
                    }
                } else {
                    
                    this.$element.before($itemTitleContainer);
                }
            } else {
                this.$container.before($itemTitleContainer);
            }
        }
    });
}($, _, window.guidelib));

(function ($, _, guidelib) {
    var CardLayoutPlugin = guidelib.view.ad.layout.CardLayoutPlugin = guidelib.view.ad.layout.LayoutPlugin.extend({
        layoutName : "adCard",
        layoutItemTitleType : "div",
        layoutColumns : 2,

        initialize : function (options) {
            
            if (this.options.layoutColumns && this.options.layoutColumns !== null) {
                this.layoutColumns = parseInt(this.options.layoutColumns);
            }
            CardLayoutPlugin._super.initialize.call(this, options);
        },

        addItemTitle : function () {
            _.each(this.itemAndTitleArray, function (itemAndTitle, itemIndex) {
                var $itemTitle = this.constructItemTitle(itemAndTitle, itemIndex);
                itemAndTitle.item.prepend($itemTitle);
            }, this);
        },

        expandCard : function (event) {
            var context = event.data.context,
                $this = $(this),
                $cardItem = $this.closest('.' + context.itemClass);
            $this.toggleClass('adCardCollapse');
            $cardItem.toggleClass('adCardFull');
        },

        getExpandCard : function () {
            var $expand = $('<div></div>').addClass('adCardExpand').on('click', {context : this}, this.expandCard),
                $expandShade = $('<div></div>').addClass('adCardShade'),
                $expandIcon = $('<div></div>').addClass('adCardIcon');
            $expand.append($expandShade, $expandIcon);
            return $expand;
        },

        done : function () {
            var parentCard = this.$container.parents('.' + this.layoutName);
            
            if (!(parentCard && parentCard.length > 0)) {
                var $expand = this.getExpandCard(),
                    $cardContainer = this.itemAndTitleArray[0].item.closest('.' + this.layoutName);
                
                $cardContainer.find('.' + this.itemClass).append($expand);

                if (this.layoutColumns > 1) {
                    var $cardDesktopContainer = $('<div></div>').addClass('adCardDesktop').attr('data-adCardCol', this.layoutColumns),
                        divColArray = [],
                        itemList;

                    for (var i = 0; i < this.layoutColumns; i++) {
                        var $divCol = $('<div></div>').attr('data-adCardColNum', i);
                        divColArray.push($divCol);
                    }

                    itemList = $cardContainer.children('.' + this.itemClass);
                    _.each(itemList, function (item, itemIndex) {
                        var $item = $(item),
                            colIndex = itemIndex % this.layoutColumns;
                        divColArray[colIndex].append($item.clone(true));
                        $item.addClass('adCardMobile');
                    }, this);

                    for (i = 0; i < this.layoutColumns; i++) {
                        $cardDesktopContainer.append(divColArray[i]);
                    }

                    $cardContainer.append($cardDesktopContainer);
                }
            }
        }
    });
}($, _, window.guidelib));

(function ($, _, guidelib) {
    var LayoutStrategy = guidelib.view.ad.layout.LayoutStrategy = guidelib.view.ad.layout.LayoutBase.extend({

        layoutStrategy : "",

        initialize : function (options) {
            this.options = this.options || {};

            
            this.$element = this.options.$element;

            
            this.layoutConfigs = this.getStrategyLayoutConfigs(this.options.layoutConfigs || []);

            this.layoutInstances = [];
        },

        getStrategyLayoutConfigs : function (layoutConfigArray) {
            var strategyLayoutConfigs = [];
            _.each(layoutConfigArray, function (layoutConfig) {
                if (layoutConfig.layoutStrategy === this.layoutStrategy) {
                    strategyLayoutConfigs.push(layoutConfig);
                }
            }, this);
            return strategyLayoutConfigs;
        },

        applyLayoutConfig : function (layoutConfig, itemAndTitleArray, $container, containerId) {
            if (layoutConfig && layoutConfig.layoutName) {
                var layoutPlugin = eval(layoutConfig.layoutName),
                    layoutInstance;
                if (layoutPlugin) {
                    layoutInstance = new layoutPlugin({
                                        $element : this.$element,
                                        itemAndTitleArray : itemAndTitleArray,
                                        $container : $container,
                                        containerId : containerId,
                                        layoutColumns : layoutConfig.layoutColumns
                                    });
                    this.layoutInstances.push(layoutInstance);
                }
            }
        },

        done : function () {
            _.each(this.layoutInstances, function (layoutInstance, instanceIndex) {
                layoutInstance.done();
                this.layoutInstances[instanceIndex] = null;
            }, this);
        }
    });
}($, _, window.guidelib));
(function ($, _, guidelib) {
    var ContainerLayoutStrategy = guidelib.view.ad.layout.ContainerLayoutStrategy = guidelib.view.ad.layout.LayoutStrategy.extend({

        layoutStrategy : "adContainerStrategy",

        initialize : function (options) {
            ContainerLayoutStrategy._super.initialize.call(this, options);
            _.each(this.layoutConfigs, this.applyLayouts, this);
        },

        applyLayouts : function (layoutConfig, layoutConfigIndex) {
            var containerSelector,
                containerSelectorLevel,
                titleSelectors,
                itemSelector,
                containerArray;

            
            containerSelector = layoutConfig.containerSelector || 'ol,ul';

            
            containerSelectorLevel = (layoutConfig.containerSelectorLevel ? parseInt(layoutConfig.containerSelectorLevel) : layoutConfig.containerSelectorLevel) || 0;

            
            titleSelectors = this.getTitleSelectors(layoutConfig.titleSelector);

            
            itemSelector = layoutConfig.itemSelector || 'li';

            
            containerArray = this.getContainers(containerSelector, containerSelectorLevel);

            _.each(containerArray, function ($container, containerIndex) {
                var $items = $container.children(itemSelector),
                    itemAndTitleArray = [],
                    containerId;
                _.each($items, function (item, itemIndex) {
                    var $item = $(item),
                        $title = this.getTitle($(item), titleSelectors);
                    itemAndTitleArray.push({item : $item, title : $title});
                }, this);
                containerId = layoutConfigIndex + '-' + containerIndex;
                this.applyLayoutConfig(layoutConfig, itemAndTitleArray, $container, containerId);
            }, this);
        },

        
        getTitleSelectors : function (titleSelector) {
            var titleSelectors = [];
            if (titleSelector) {
                titleSelectors.push(titleSelector);
            }
            titleSelectors.push('h1');
            titleSelectors.push('h2');
            titleSelectors.push('h3');
            titleSelectors.push('h4');
            titleSelectors.push('h5');
            titleSelectors.push('h6');
            return titleSelectors;
        },

        
        getTitle : function ($item, titleSelectors) {
            var $candidateTitles = [],
                $title;
            for (var i = 0; i < titleSelectors.length; i++) {
                $candidateTitles = $item.find(titleSelectors[i]);
                if ($candidateTitles.length > 0) {
                    $title = $($candidateTitles[0]);
                    break;
                }
            }
            return $title;
        },

        
        getContainers : function (containerSelector, containerSelectorLevel) {
            var $itemContainers = this.$element.find(containerSelector),
                containerArray = [];
            
            $itemContainers.each(function (itemIndex, itemContainer) {
                var $itemContainer = $(itemContainer),
                    $itemContainerParents = $itemContainer.parents(containerSelector);
                
                if (containerSelectorLevel < 0 || ($itemContainerParents.length === containerSelectorLevel)) {
                    containerArray.push($itemContainer);
                }
            });
            return containerArray;
        }
    });
}($, _, window.guidelib));
(function ($, _, guidelib) {
    var DelimiterLayoutStrategy = guidelib.view.ad.layout.DelimiterLayoutStrategy = guidelib.view.ad.layout.LayoutStrategy.extend({

        layoutStrategy : "adDelimiterStrategy",
        
        standardDelimiters : ["h1", "h2", "h3", "h4", "h5", "h6"],

        standardLevels : ["first", "second", "third"],

        initialize : function (options) {

            DelimiterLayoutStrategy._super.initialize.call(this, options);

            
            this.delimiterSelectors = this.extractConfigDelimiters();

            if (this.layoutConfigs && this.layoutConfigs.length > 0) {
                this.applyLayouts(0, this.$element, 0);
            }
        },

        extractConfigDelimiters : function () {
            var prependStandardDelimiters = false,
                delimiters = [];
            _.each(this.layoutConfigs, function (layoutConfig) {
                var delimiter = layoutConfig.itemDelimiter;
                if ((this.standardLevels.indexOf(layoutConfig.layoutType) > -1 && !delimiter)
                    || this.standardDelimiters.indexOf(delimiter) > -1) {
                    prependStandardDelimiters = true;
                } else if (delimiter) {
                    
                    delimiters.push(delimiter);
                }
            }, this);
            if (prependStandardDelimiters) {
                delimiters = [].concat(this.standardDelimiters).concat(delimiters);
            }
            return delimiters;
        },

        getDelimiterLayoutConfig : function (delimiter, delimiterEncounter) {
            var delimiterLayoutConfig;
            _.each(this.layoutConfigs, function (layoutConfig) {
                _.each(this.standardLevels, function (standardLevel, index) {
                    if ((!layoutConfig.itemDelimiter && layoutConfig.layoutType === standardLevel && delimiterEncounter === index)
                            || (layoutConfig.itemDelimiter && layoutConfig.itemDelimiter === delimiter)) {
                        delimiterLayoutConfig = layoutConfig;
                    }
                }, this);
            }, this);
            return delimiterLayoutConfig;
        },

        
        applyLayouts : function (delimiterIndex, $element, delimiterEncounter) {
            var delimiter,
                itemAndTitleArray = [],
                $itemDelimiters,
                $items = [],
                $container = $element,
                layoutConfig,
                containerId;
            
            if (delimiterIndex >= this.delimiterSelectors.length) {
                return;
            }
            delimiter = this.delimiterSelectors[delimiterIndex];
            $itemDelimiters = $element.find(delimiter);
            
            if ($itemDelimiters && $itemDelimiters.length === 0) {
                return this.applyLayouts(delimiterIndex + 1, $element, delimiterEncounter);
            }

            layoutConfig = this.getDelimiterLayoutConfig(delimiter, delimiterEncounter);

            
            $itemDelimiters.each(function (index, itemDelimiter) {
                var $itemDelimiter = $(itemDelimiter),
                    $itemElements = $itemDelimiter.nextUntil(delimiter),
                    $item,
                    $title = $itemDelimiter;
                
                $itemElements.splice(0, 0, itemDelimiter);
                $itemElements.wrapAll('<div></div>');
                $item = $itemElements.parent();
                $items.push($item);
                if (layoutConfig && layoutConfig.titleSelector) {
                    var $titles = $item.find(layoutConfig.titleSelector);
                    if ($titles && $titles.length > 0) {
                        $title = $($titles[0]);
                    }
                }
                itemAndTitleArray.push({item : $item, title : $title});
            });

            if (layoutConfig) {
                containerId = layoutConfig.layoutType + '-' + delimiter;
                this.applyLayoutConfig(layoutConfig, itemAndTitleArray, $container, containerId);
            }

            _.each($items, function ($item) {
                this.applyLayouts(delimiterIndex + 1, $item, delimiterEncounter + 1);
            }, this);
        }
    });
}($, _, window.guidelib));

/*
 * **********************************************************************
 *  ADOBE CONFIDENTIAL
 *  __________________
 *
 *  Copyright 2015 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 *  NOTICE:  All information contained herein is, and remains
 *  the property of Adobe Systems Incorporated and its suppliers,
 *  if any.  The intellectual and technical concepts contained
 *  herein are proprietary to Adobe Systems Incorporated and its
 *  suppliers and may be covered by U.S. and Foreign Patents,
 *  patents in process, and are protected by trade secret or copyright law.
 *  Dissemination of this information or reproduction of this material
 *  is strictly forbidden unless prior written permission is obtained
 *  from Adobe Systems Incorporated.
 *  **********************************************************************
 */

(function (window, $, guidelib) {
    guidelib.util.AdUtil = {
        descriptionPlugin : function () {
            if (_.isFunction($.prototype.tooltip)) {
                $(this).find('[data-description]').tooltip({
                    title : function () {
                        //using browser native 'decodeURIComponent' as that is what is used for encoding in CM
                        return decodeURIComponent($(this).data('description'));
                    },
                    placement : 'top',
                    html : true
                });
            }
        },

        applyLayouts : function (options) {
            var strategies = [];
            strategies.push(new guidelib.view.ad.layout.DelimiterLayoutStrategy(options));
            strategies.push(new guidelib.view.ad.layout.ContainerLayoutStrategy(options));
            _.each(strategies, function (strategy, index) {
                strategy.done();
                strategies[index] = null;
            });
        },

        applyDescriptionPlugin : function () {
            $('.guideAdModule, .guideAdModuleGroup').one('mouseenter', guidelib.util.AdUtil.descriptionPlugin);
        }
    };
}(window, $, guidelib));

/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2022 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/
/**
 * @package guidelib.util.GuideUtil
 * Utility methods to handle recaptcha
 */

(function (window,$, guidelib,_) {
    var RecaptchaUtil = guidelib.util.RecaptchaUtil = {

        constants : {
            ENTERPRISE_VERSION : 'enterprise',
            SCORE_KEY : 'score',
            CHECKBOX_KEY : 'checkbox',
            TIMEOUT_MULTIPLIER : 1000
        },

        _tokenChange : function (element, recaptchaConfigData) {
            var tokenData = null, token = element.attr("af-grecaptcha-response");
            if (!_.isEmpty(token)) {
                tokenData = {
                    'g_recaptcha_response' : token,
                    'rcCloudServicePath' : recaptchaConfigData.rcCloudServicePath
                };
            }
            if($._data( element[0] , 'events').tokenChange != undefined) {
                element.trigger({
                    type: "tokenChange.captcha",
                    token: tokenData
                });
                return;
            }

            var recaptchaInvisibleElement = $("#recaptchaInvisible"),
                model = window.guideBridge._resolveId(recaptchaInvisibleElement.attr("modelId"));
            model.value = tokenData;

            if(model._triggerPostSubmission) {
                recaptchaInvisibleElement.removeAttr("af-recaptcha-execute");
                setTimeout( function () {
                    window.guideBridge._submitAfterValidation(model._submitParameters.options, model._submitParameters.success, model._submitParameters.error);
                });
            }
        },

        /* render recaptcha by adding g-recaptcha element */
        renderRecaptcha : function (element, recaptchaConfigData) {
            var INVISIBLE = "invisible";
            var recaptcha_url = guidelib.util.RecaptchaUtil.isRecaptchaEnterprise(recaptchaConfigData)
                ? 'recaptcha/enterprise.js'
                : 'recaptcha/api.js';
            element.append('<div class="g-recaptcha"></div>');
            var gcontainer = $("div.g-recaptcha")[0];
            var widgetId;
            var domain = element.data('externaldomain') || '';
            var url = '';
            // CQ-4327044: Below code is because URL is not supported in IE11
            // and neither "".endsWith("<>") is available on IE11
            // ToDo: Remove if check once support for IE11 is dropped
            if (typeof(window.URL) === "function") {
                // supports URL class
                url = new URL(recaptcha_url, domain).toString();
            } else {
                if (domain.length > 0 && domain[domain.length - 1] != '/') {
                    domain = domain + '/';
                }
                url = domain + recaptcha_url;
            }
            guidelib.util.RecaptchaUtil.successCallback = function (response) {
                element.attr("af-grecaptcha-response", response);
                RecaptchaUtil._tokenChange(element, recaptchaConfigData);
            };

            guidelib.util.RecaptchaUtil.expiredCallback = function () {
                if (RecaptchaUtil.isRecaptchaEnterprise(recaptchaConfigData)) {
                    grecaptcha.enterprise.reset(widgetId);
                } else {
                    grecaptcha.reset(widgetId);
                }
                element.removeAttr("af-grecaptcha-response");
                if(gparameters.size == INVISIBLE && recaptchaConfigData.mandatory) {
                    element.attr("af-recaptcha-execute", "");
                    return;
                }
                RecaptchaUtil._tokenChange(element, recaptchaConfigData);
            };

            var gparameters = {
                'sitekey' : recaptchaConfigData.rcSitekey,
                'theme' : recaptchaConfigData.rcTheme || 'light',
                'type' : recaptchaConfigData.rcType || 'image',
                'size' : recaptchaConfigData.rcSize || 'invisible',
                'callback' : guidelib.util.RecaptchaUtil.successCallback,
                'expired-callback' : guidelib.util.RecaptchaUtil.expiredCallback
            };

            onloadCallbackInternal = function () {
                if (RecaptchaUtil.isRecaptchaEnterprise(recaptchaConfigData)) {
                    if (recaptchaConfigData.rcKeyType === RecaptchaUtil.constants.SCORE_KEY) {
                        return;
                    }
                    widgetId = grecaptcha.enterprise.render(
                        gcontainer,
                        gparameters
                    );
                } else {
                    widgetId = grecaptcha.render(
                        gcontainer,
                        gparameters
                    );
                }
                return widgetId;
            };

            window.onloadRecaptchaCallback = onloadCallbackInternal;

            var runtimeLocale = element.data("locale");
            if (RecaptchaUtil.isRecaptchaEnterprise(recaptchaConfigData)  && recaptchaConfigData.rcKeyType === RecaptchaUtil.constants.SCORE_KEY) {
                element.append('<script src="' + url + '?onload=onloadRecaptchaCallback&render=' + recaptchaConfigData.rcSitekey + '&hl=' + runtimeLocale + '"  async defer></script>');
            } else {
                element.append('<script src="' + url + '?onload=onloadRecaptchaCallback&render=explicit&hl=' + runtimeLocale + '" async defer></script>');
            }
        },

        recaptchaExecution : function (options) {
            var model = window.guideBridge._resolveId($("#recaptchaInvisible").attr("modelId"));
            model._submitParameters = options.submitParameters;
            model._triggerPostSubmission = options.triggerPostSubmission;
            if (RecaptchaUtil.isRecaptchaEnterprise(model.jsonModel)) {
                var retryCount = 1;
                var actionName = "submit_" + guideBridge._getFormName(model.jsonModel['jcr:path']) + "_" + model.jsonModel.name;
                //Allowed characters for actionName are "A-Za-z/_"
                actionName = actionName.replaceAll("-","_");
                RecaptchaUtil.recaptchaEnterpriseExecution(model.jsonModel, actionName, retryCount);
            } else {
                grecaptcha.execute();
            }
        },

        recaptchaEnterpriseExecution : function(recaptchaConfigData, actionName, retryCount) {
            var reCaptchaExecuteFail , reCaptchaExecuteSuccess;
            grecaptcha.enterprise.ready(function() {
                if (reCaptchaExecuteFail == true) {
                    return;
                }
                grecaptcha.enterprise.execute(recaptchaConfigData.rcSitekey, {action: actionName}).then(function(token) {
                    if (reCaptchaExecuteFail == true) {
                        return;
                    }
                    reCaptchaExecuteSuccess = true;
                    var recaptchaElement = $("#recaptchaInvisible");
                    recaptchaElement.attr("af-grecaptcha-response", token);
                    RecaptchaUtil._tokenChange(recaptchaElement, recaptchaConfigData);
                });
            });
            setTimeout(function () {
                if (reCaptchaExecuteSuccess == true){
                    return;
                }
                reCaptchaExecuteFail = true;
                if (retryCount > 2) {
                    window.guideBridge._handleCaptchaTimeout();
                } else {
                    RecaptchaUtil.recaptchaEnterpriseExecution(recaptchaConfigData, actionName, retryCount + 1);
                }
            }, Math.pow(2, retryCount) * RecaptchaUtil.constants.TIMEOUT_MULTIPLIER);
        },

        isRecaptchaEnterprise : function (recaptchaConfigData) {
            return recaptchaConfigData.rcVersion === RecaptchaUtil.constants.ENTERPRISE_VERSION;
        }

    }
})(window, $, guidelib, window._);
/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/

(function (guidelib) {
    guidelib.i18n = {
        "calendarSymbols" : {
            "monthNames" : ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
            "abbrmonthNames" : ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
            "dayNames" : ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
            "abbrdayNames" : ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
            "meridiemNames" : ["AM", "PM"],
            "eraNames" : ["BC", "AD"],
            "day" : "day",
            "days" : "days",
            "month" : "month",
            "months" : "months",
            "year" : "year",
            "years" : "years",
            "more" : "more",
            "less" : "less"
        },
        "datePatterns" : {
            "full" : "EEEE D MMMM YYYY",
            "long" : "D MMMM YYYY",
            "med" : "DD-MMM-YY",
            "short" : "DD/MM/YY"
        },
        "timePatterns" : {
            "full" : "h:MM:SS A Z",
            "long" : "h:MM:SS A Z",
            "med" : "h:MM:SS A",
            "short" : "h:MM A"
        },
        "dateTimeSymbols" : "GyMdkHmsSEDFwWahKzZ",
        "numberPatterns" : {
            "numeric" : "z,zz9.zzz",
            "currency" : "$ z,zz9.99",
            "percent" : "z,zz9%"
        },
        "numberSymbols" : {
            "decimal" : ".",
            "grouping" : ",",
            "percent" : "%",
            "minus" : "-",
            "zero" : "0"
        },
        "currencySymbols" : {
            "symbol" : "$",
            "isoname" : "USD",
            "decimal" : "."
        },
        "typefaces" : {}
    };
}(guidelib));

/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/

(function (guidelib) {
    guidelib.i18n.strings = {

        "LostInternetConnection" : "Current functionality needs internet connectivity to work. Please connect your " +
                                   "device to the internet." , //Added in AEM 6.0 SP1
        "ESignDisabled" : "The privileges to sign the filled form are not available to you. Please, continue to the " +
                          "next action or submit the form.",
        "VerifyDisabled" : "The privileges to verify the filled data are not available to you. Please, continue to " +
                            "the next action or submit the form.",
        "validatingForm" : "Validating...",
        "submittingForm" : "Submitting...",
        "generatingSignAgreement" : "Preparing document for signature",
        "maxValErrorMessage" : "The value must be less than or equal to {0}",
        "exclusiveMaxValErrorMessage" : "The value must be strictly less than {0}",
        "minValErrorMessage" : "The value must be greater than or equal to {0}",
        "exclusiveMinValErrorMessage" : "The value must be strictly greater than {0}",
        "minimumLengthMessage" : "The number of characters must be greater than or equal to {0}",
        "totalLengthMessage" : "The number of characters must be equal to {0}",
        "totalDigitMessage" : "The number of digits must be less than or equal to {0}",
        "formAlreadySigned" : "The Form has been signed.",
        "formAlreadySubmitted" : "The Form has been submitted.",
        "datatypeMessage" : "The value must be of {0} datatype.",
        "genericInvalidDatePart" : "A {0} can not have {1} than {2} {3}.",
        "genericInvalidYearPart": "Year can not have less than four digit.",
        "nonFebruaryMessage" : "{0} can not have more than {1} days.",
        "februaryMessage" : "February can not have more than {0} days in {1}.",
        "draftSavedSuccessMessage" : "Draft Saved Successfully",
        "formHasBeenReset" : "The form has been reset.",
        "formSubmitFail" : "Failed to submit the form."
    };
    /* Do not put any new message here. Use the guidelib.i18n.strings object */
    guidelib.i18n.LogMessages = {
        "AEM-AF-901-001"   :   "[AEM-AF-901-001]: Error in retrieving the form state.",
        "AEM-AF-901-003"   :   "[AEM-AF-901-003]: Unable to connect to the server.",
        "AEM-AF-901-004"   :   "[AEM-AF-901-004]: Encountered an internal error while submitting the form.",
        "AEM-AF-901-005"   :   " This Field is a required field.",
        "AEM-AF-901-006"   :   " There is a validation error in the field.",
        "AEM-AF-901-007"   :   " Field not filled in expected format.",
        "AEM-AF-901-008"   :   " Server is not reachable",
        "AEM-AF-901-009"   :   " Error occurred while draft saving",
        "AEM-AF-901-010"   :   "Verify works only with XFA-based Adaptive Forms.",
        "AEM-AF-901-011"   :   "Failed to restore the form state.",
        "AEM-AF-901-012"   :   "Failed to retrieve the form state.",
        "AEM-AF-901-013"   :   "User email undefined. Unable to generate signable PDF.",
        "AEM-AF-901-014"   :   "XDP title or Guide title undefined. Unable to generate signable PDF.",
        "AEM-AF-901-015"   :   "Error while submitting the guide: ",
        "AEM-AF-901-016"   :   "No signing field in the form. Please continue!",
        "AEM-AF-901-017"   :   "Failed to obtain data XML from HTML form: ",
        "AEM-AF-901-018"   :   "Please sign all the mandatory fields",
        "AEM-AF-901-019"   :   "Please esign the form.",
        "AEM-AF-901-020"   :   "Submitting the form...",
        "AEM-AF-901-021"   :   "Verify Component works only for XDP based DoR template.",
        "AEM-AF-901-022"   :   "The document is ready for signing but could not be loaded. We have sent the document to your email. Check your email to continue signing.",
        "AEM-AF-901-024"   :   "You cannot submit a form with empty attachment(s). Check these attachment(s) and resubmit the form: {0}",
        "AEM-AF-901-025"   :   "Google reCAPTCHA services are currently experiencing low availability. You can try again later after some time or contact your administrator if the issue continues."
    };
}(guidelib));

