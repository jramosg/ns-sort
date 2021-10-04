# ns-sort

Sort your project namespaces

## Installation

Download from http://example.com/FIXME.

## Usage

Use function `sort-ns`

## Examples

```
(sort-ns '(:require
            [clojure.string :as string]
            [clojure.set :as set]
            [clojure.java.io :as io]))
=>
(:require
 [clojure.java.io :as io]
 [clojure.set :as set]
 [clojure.string :as string])
 ```

...

## Tasks

Create a function that checks all the namespaces in a project
and sort them automatically.

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
