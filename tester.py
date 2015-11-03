#!/usr/bin/env python

import sys


def main():
    (_, java_class, path, test_start, test_end, in_start, in_end) = sys.argv

    test_start = int(test_start)
    test_end = int(test_end)
    in_start = int(in_start)
    in_end = int(in_end)

    s = ('java {clazz} < {path}{test_set}/in{test} > out && '
         'diff -BZ out {path}{test_set}/out{test}')

    print '\n'.join([
        s.format(
            clazz=java_class,
            path=path,
            test_set=test_set,
            test=test
        )
        for test_set in range(test_start, test_end + 1)
        for test in range(in_start, in_end + 1)
    ])


if __name__ == '__main__':
    main()
