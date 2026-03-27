def timeConversion(s):
    time = s[:-2].split(":")
    hr = int(time[0])
    ampm = s[-2:]
    
    if ampm == 'PM':
        if hr != 12:
            hr+=12
    else:
        if hr == 12:
            hr = 0
    
    time[0] = f"{hr:02d}"
    return str.join(":",time)