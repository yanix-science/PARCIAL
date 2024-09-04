#!/usr/bin/awk -f

# Estado inicial: 0
# Token para "+"
/^\+$/ {
    print "TOKEN: SUMA ->", $0
}

# Token para "++"
/^\+\+$/ {
    print "TOKEN: INCR ->", $0
}

# Token para números enteros [0-9]+
/^[0-9]+$/ {
    print "TOKEN: ENTERO ->", $0
}

# Token para números reales ([0-9]+)”.”([0-9])+
/^[0-9]+\.[0-9]+$/ {
    print "TOKEN: REAL ->", $0
}
