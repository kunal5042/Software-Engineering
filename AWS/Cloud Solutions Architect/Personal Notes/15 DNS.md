# Domain Name System
- Discovery services - resolves domain names to ip addresses
- It's huge and hast to be distributed 

### Understanding DNS Components

1. **DNS Client**: The DNS system is accessed through clients like web browsers, which translate domain names into IP addresses.
    
2. **Resolver**: This can be software on your device or a server that queries DNS servers to fetch IP address information on your behalf.
    
3. **Zone**: A distinct segment of the DNS database that houses specific domain name records.
    
4. **Zonefile**: The physical representation of a zone, containing data and configurations for that particular zone.
    
5. **Nameserver**: The server hosting zonefiles and providing DNS information during domain name resolution processes.

```

> scutil --dns                                                                                                              [15:24:21]
DNS configuration

resolver #1
  nameserver[0] : 8.8.8.8
  flags       : Supplemental, Request A records
  reach       : 0x00000002 (Reachable)
  order       : 101600

resolver #2
  nameserver[0] : 192.168.1.1
  if_index : 15 (en0)
  flags       : Request A records
  reach       : 0x00020002 (Reachable,Directly Reachable Address)
  order       : 200000

resolver #3
  domain     : local
  options    : mdns
  timeout    : 5
  flags      : Request A records
  reach      : 0x00000000 (Not Reachable)
  order      : 300000

resolver #4
  domain     : 254.169.in-addr.arpa
  options    : mdns
  timeout    : 5
  flags      : Request A records
  reach      : 0x00000000 (Not Reachable)
  order      : 300200

resolver #5
  domain     : 8.e.f.ip6.arpa
  options    : mdns
  timeout    : 5
  flags      : Request A records
  reach      : 0x00000000 (Not Reachable)
  order      : 300400

resolver #6
  domain     : 9.e.f.ip6.arpa
  options    : mdns
  timeout    : 5
  flags      : Request A records
  reach      : 0x00000000 (Not Reachable)
  order      : 300600

resolver #7
  domain     : a.e.f.ip6.arpa
  options    : mdns
  timeout    : 5
  flags      : Request A records
  reach      : 0x00000000 (Not Reachable)
  order      : 300800

resolver #8
  domain     : b.e.f.ip6.arpa
  options    : mdns
  timeout    : 5
  flags      : Request A records
  reach      : 0x00000000 (Not Reachable)
  order      : 301000

DNS configuration (for scoped queries)

resolver #1
  nameserver[0] : 192.168.1.1
  if_index : 15 (en0)
  flags       : Scoped, Request A records
  reach       : 0x00020002 (Reachable,Directly Reachable Address)

```

In this output, you can see the DNS configuration details, including the DNS servers (`nameserver`), flags indicating reachability and type of queries (`flags`), and other related information for each resolver.

# DNS Query Resolution

![DNS Queries — Recursive and Iterative | by Geeky much! | Networks &  Security | Medium](https://miro.medium.com/v2/resize:fit:1200/0*7d3wrIM0G2RDnJi7.png)

