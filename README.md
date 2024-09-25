Issue: https://github.com/bndtools/bnd/issues/6278

Error:

```
[ERROR] Resolution failed. Capabilities satisfying the following requirements could not be found:
    [<<INITIAL>>]
      ⇒ osgi.identity: (osgi.identity=sample-test-tests)
          ⇒ [sample-test-tests version=0.0.1.202409251137]
              ⇒ osgi.wiring.package: (osgi.wiring.package=app.getxray.xray.junit.customjunitxml.annotations)
    [org.osgi.service.log version=1.4.0.201802012107]
      ⇒ osgi.wiring.package: (&(osgi.wiring.package=org.osgi.util.pushstream)(version>=1.0.0)(!(version>=2.0.0)))
    [osgi.cmpn version=6.0.0.201505202027]
      ⇒ osgi.compile.time.only: (&(must.not.resolve=*)(!(must.not.resolve=*)))
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.656 s
[INFO] Finished at: 2024-09-25T13:37:14+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal biz.aQute.bnd:bnd-resolver-maven-plugin:6.4.0:resolve (resolve-test) on project sample-test: Unable to resolve <<INITIAL>>: missing requirement osgi.identity;filter:='(osgi.identity=sample-test-tests)' [caused by: Unable to resolve sample-test-tests version=0.0.1.202409251137: missing requirement osgi.wiring.package;filter:='(osgi.wiring.package=app.getxray.xray.junit.customjunitxml.annotations)';osgi.wiring.package='app.getxray.xray.junit.customjunitxml.annotations'] -> [Help 1]
```

The test run is succesful when you comment the two annotations @Requirement and @XrayTest in the TestClass.
