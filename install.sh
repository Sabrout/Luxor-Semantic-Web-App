#!/bin/sh

echo 'Downloading Fuseki, that could take some time ~40+Mb'
wget http://www-eu.apache.org/dist/jena/binaries/apache-jena-fuseki-2.5.0.tar.gz

cp apache-jena-fuseki-2.5.0.tar.gz server/lib
tar -xzvf server/lib/apache-jena-fuseki-2.5.0.tar.gz

chmod +x server/lib/apache-jena-fuseki-2.5.0/fuseki-server
chmod +x server/lib/apache-jena-fuseki-2.5.0/bin/s-*
