The documentation in this directory is based on [Sphinx](http://www.sphinx-doc.org/en/stable/).


The makefile and conf.py was generated using,

```bash
$ sphinx-quicksart 
```

There is no need to regenerate the makefile.


Simply generate html documentation locally in the build dir, use

```bash
 $ cd [THIS DIR]
 $ make html
```

This is a good way to verify the syntax of the rst files.

To generate pdf documentation locally in the build dir, use

```bash
 $ cd [THIS DIR]
 $ make latexpdf
```

NOTE: Latex is required for generating a pdf. On Ubuntu, latex can be installed using,

```bash
 $ sudo apt-get install texlive-full
 ```
